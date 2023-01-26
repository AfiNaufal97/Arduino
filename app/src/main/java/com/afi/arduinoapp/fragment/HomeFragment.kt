package com.afi.arduinoapp.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.afi.arduinoapp.activity.DetailTipsActivity
import com.afi.arduinoapp.adapter.DisorderAdapter
import com.afi.arduinoapp.adapter.TipsAdapter
import com.afi.arduinoapp.data.DisorderData
import com.afi.arduinoapp.data.TipsData
import com.afi.arduinoapp.databinding.FragmentHomeBinding
import com.afi.arduinoapp.model.Disorder
import com.afi.arduinoapp.model.Tips

class HomeFragment : Fragment() {
    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var tipsAdapter: TipsAdapter
    private lateinit var disorderAdapter: DisorderAdapter
    private var listTips : ArrayList<Tips> = arrayListOf()
    private var listDisorder : ArrayList<Disorder> = arrayListOf()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        showTipsToRv()
        showDisorderToRv()
        hideProgressBar()
        return binding.root
    }

    fun showTipsToRv(){
        listTips.addAll(TipsData.listTips)
        tipsAdapter = TipsAdapter(listTips, object : TipsAdapter.onTipsClick{
            override fun onTipsClickListener(tips: Tips) {
                startActivity(Intent(activity, DetailTipsActivity::class.java).apply {
                    putExtra("idTips", tips.id_news)
                })
            }
        })
        binding.RvTips.apply {
            adapter = tipsAdapter
            val mLayout = LinearLayoutManager(activity)
            mLayout.orientation = LinearLayoutManager.HORIZONTAL
            layoutManager = mLayout
        }

    }

    fun showDisorderToRv(){
        listDisorder.addAll(DisorderData.listDisorder)
        disorderAdapter = DisorderAdapter(listDisorder, object : DisorderAdapter.onDisorderClick{
            override fun onDisorderClickListener(disorder: Disorder) {
                startActivity(Intent(activity, DetailTipsActivity::class.java).apply {
                    putExtra("idDisorder", disorder.id_news)
                })
            }

        })
        binding.RvDisorder.apply {
            adapter = disorderAdapter
            val mLayout = LinearLayoutManager(activity)
            mLayout.orientation = LinearLayoutManager.HORIZONTAL
            layoutManager = mLayout
        }
    }

    private fun hideProgressBar() {
        binding.loading.visibility = View.INVISIBLE
    }
}