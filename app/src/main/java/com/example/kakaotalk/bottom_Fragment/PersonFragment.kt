package com.example.kakaotalk.bottom_Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.view.size
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kakaotalk.ChannelPage
import com.example.kakaotalk.R
import com.example.kakaotalk.databinding.FragmentPersonBinding
import com.example.kakaotalk.open_profile
import com.example.kakaotalk.person_activity.mainProfileAdpater
import com.example.kakaotalk.person_activity.mainProfileItems
import com.example.kakaotalk.person_activity.upDateProfileAdapter

import com.example.kakaotalk.person_activity.upDateProfileItems

class PersonFragment: Fragment() {

    companion object {

        fun newInstance() : PersonFragment {
            return PersonFragment()
        }

    }
    //전역 변수로 바인딩 객체 선언
    private var mBinding: FragmentPersonBinding? = null
    //편의성을 위한 바인딩 변수 재 선언
    private val binding get() = mBinding!!

    //프레그먼트와 레이아웃 연결
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentPersonBinding.inflate(inflater, container, false)

        spaceDecoration()

        val myLayoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.upDateProfileRecyclerView.layoutManager = myLayoutManager

        val myLayoutManager2 = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.profileRecyclerView.layoutManager = myLayoutManager2

        val data = ArrayList<upDateProfileItems>()
        val mainData = ArrayList<mainProfileItems>()

        binding.upDateProfileRecyclerView.run {
            adapter = upDateProfileAdapter(data)
            layoutManager = myLayoutManager
        }
        binding.profileRecyclerView.run {
            adapter = mainProfileAdpater(mainData)
            layoutManager = myLayoutManager2
        }

        //업데이트 부분 리사이클러뷰
        data.add(upDateProfileItems(R.drawable.profile, "1"))
        data.add(upDateProfileItems(R.drawable.profile, "2"))
        data.add(upDateProfileItems(R.drawable.profile, "3"))
        data.add(upDateProfileItems(R.drawable.profile, "4"))
        data.add(upDateProfileItems(R.drawable.profile, "5"))
        data.add(upDateProfileItems(R.drawable.profile, "5"))
        data.add(upDateProfileItems(R.drawable.profile, "5"))
        data.add(upDateProfileItems(R.drawable.profile, "5"))
        data.add(upDateProfileItems(R.drawable.profile, "5"))
        data.add(upDateProfileItems(R.drawable.profile, "5"))
        data.add(upDateProfileItems(R.drawable.profile, "5"))

        //프로필 리사이클러뷰
        mainData.add(mainProfileItems(R.drawable.profile, R.string.myName, R.string.desText))
        mainData.add(mainProfileItems(R.drawable.profile, R.string.myName, R.string.desText))
        mainData.add(mainProfileItems(R.drawable.profile, R.string.myName, R.string.desText))
        mainData.add(mainProfileItems(R.drawable.profile, R.string.myName, R.string.desText))
        mainData.add(mainProfileItems(R.drawable.profile, R.string.myName, R.string.desText))
        mainData.add(mainProfileItems(R.drawable.profile, R.string.myName, R.string.desText))


        binding.channelButton.setOnClickListener {
            val intent = Intent(context, ChannelPage::class.java)
            startActivity(intent)
        }
        binding.mainPersonProfile.setOnClickListener {
            val intent = Intent(context, open_profile::class.java)
            startActivity(intent)
        }


        return binding.root
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
    private fun spaceDecoration() {
        val spaceDecoration = upDateProfileAdapter.HorizontalSpaceItemDecoration(20)
        binding.upDateProfileRecyclerView.addItemDecoration(spaceDecoration)
    }

}


