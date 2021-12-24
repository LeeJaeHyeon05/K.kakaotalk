package com.example.kakaotalk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kakaotalk.databinding.FragmentPersonBinding
import com.example.kakaotalk.databinding.MainProfileItemListBinding
import com.example.kakaotalk.person_activity.mainProfileAdpater
import com.example.kakaotalk.person_activity.mainProfileItems
import com.example.kakaotalk.person_activity.upDateProfileAdapter
import com.example.kakaotalk.person_activity.upDateProfileItems

class ChannelPage : AppCompatActivity() {

    //전역 변수로 바인딩 객체 선언
    private var mBinding: FragmentPersonBinding? = null
    //편의성을 위한 바인딩 변수 재 선언
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.channel_page)

        val myLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.upDateProfileRecyclerView.layoutManager = myLayoutManager

        val channelData = ArrayList<mainProfileItems>()

        binding.upDateProfileRecyclerView.run {
            adapter = mainProfileAdpater(channelData)
            layoutManager = myLayoutManager
        }

        channelData.add(mainProfileItems(R.drawable.profile, R.string.channelTextText, R.string.channelTextText))
        channelData.add(mainProfileItems(R.drawable.profile, R.string.channelTextText, R.string.channelTextText))
        channelData.add(mainProfileItems(R.drawable.profile, R.string.channelTextText, R.string.channelTextText))
        channelData.add(mainProfileItems(R.drawable.profile, R.string.channelTextText, R.string.channelTextText))
        channelData.add(mainProfileItems(R.drawable.profile, R.string.channelTextText, R.string.channelTextText))
        channelData.add(mainProfileItems(R.drawable.profile, R.string.channelTextText, R.string.channelTextText))
        channelData.add(mainProfileItems(R.drawable.profile, R.string.channelTextText, R.string.channelTextText))
        channelData.add(mainProfileItems(R.drawable.profile, R.string.channelTextText, R.string.channelTextText))
        channelData.add(mainProfileItems(R.drawable.profile, R.string.channelTextText, R.string.channelTextText))


    }
}