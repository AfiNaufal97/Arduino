package com.afi.arduinoapp.fragment

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.afi.arduinoapp.R
import com.afi.arduinoapp.databinding.FragmentDetectionBinding
import com.afi.arduinoapp.model.History
import com.afi.arduinoapp.room.MyDatabase
import com.google.firebase.FirebaseApp
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class DetectionFragment : Fragment() {

    lateinit var history : History
    //instance db
    lateinit var myDb : MyDatabase

    //inisialisasi variabel untuk menampung id view
    private var _binding : FragmentDetectionBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetectionBinding.inflate(inflater, container, false)
        firebaseConection()
        myDb = MyDatabase.getInstance(requireContext())!!
        return binding.root
    }


    private fun firebaseConection(){

        //memanggil firebaseDatabase sebagai object
        val koneksi = FirebaseDatabase.getInstance().reference

        //membaca value dari realtime database firebase
        koneksi.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                // variable untuk menampung data dari firebase
                val heartRate : String = snapshot.child("Heartrate").getValue().toString()
                val spo : String = snapshot.child("Oxymeter").getValue().toString()
                val temp : String = snapshot.child("Temperature").getValue().toString()

                //menampilkan data ke view
                binding.apply {
                    tvNilaiHeartrate.setText(heartRate)
                    tvNilaiTemp.setText(temp)
                    tvNilaiSpo.setText(spo)
                }

            }

            override fun onCancelled(error: DatabaseError) {

            }
        })
    }

    private fun saveHistory(){

    }

}