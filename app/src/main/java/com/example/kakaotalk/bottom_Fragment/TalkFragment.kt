package com.example.kakaotalk.bottom_Fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kakaotalk.R

class TalkFragment: Fragment() {

    companion object {
        const val TAG: String = "로그"

        fun newInstance() : TalkFragment {
            return TalkFragment()
        }
    }

    //메모리에 올라 갔을때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    // 프레그먼트를 안고 있는 엑티비티 붙었을 때
    override fun onAttach(context: Context) {
        super.onAttach(context)
    }
    //프레그먼트와 레이아웃 연결
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_talk, container, false)

        return view

    }

}