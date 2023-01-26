package com.afi.arduinoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.afi.arduinoapp.databinding.ActivityMainBinding
import com.afi.arduinoapp.fragment.DetectionFragment
import com.afi.arduinoapp.fragment.HistoryFragment
import com.afi.arduinoapp.fragment.HomeFragment
import com.google.firebase.FirebaseApp

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        bottomNavigation()
        setCurrentFragment(HomeFragment())
        FirebaseApp.initializeApp(this);
    }
    private fun bottomNavigation(){
        binding.BottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.icHome -> setCurrentFragment(HomeFragment())
                R.id.icDetect -> setCurrentFragment(DetectionFragment())
                R.id.icHistory ->setCurrentFragment(HistoryFragment())
            }
            true
        }
    }

    private fun setCurrentFragment(fragment : Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FrameLayout, fragment)
            commit()
        }
    }
}