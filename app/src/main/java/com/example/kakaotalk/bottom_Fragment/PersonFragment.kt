package com.example.kakaotalk.bottom_Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kakaotalk.R
import com.example.kakaotalk.databinding.FragmentPersonBinding
import com.example.kakaotalk.person_activity.profileAdapter

import com.example.kakaotalk.person_activity.profileItems

class PersonFragment: Fragment() {

    companion object {
        const val TAG : String = "로그"

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

        val myLayoutManager = LinearLayoutManager(requireContext())
        binding.profileRecyclerView.layoutManager = myLayoutManager

        val data = ArrayList<profileItems>()

        binding.profileRecyclerView.run {
            adapter = profileAdapter(data)
            layoutManager = myLayoutManager
        }

        //업데이트 부분 리사이클러뷰
        data.add(profileItems(R.drawable.profile, "1"))
        data.add(profileItems(R.drawable.profile, "2"))
        data.add(profileItems(R.drawable.profile, "3"))
        data.add(profileItems(R.drawable.profile, "4"))

        return binding.root
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }

}