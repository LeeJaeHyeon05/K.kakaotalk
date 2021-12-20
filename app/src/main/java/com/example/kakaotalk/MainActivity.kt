package com.example.kakaotalk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kakaotalk.bottom_Fragment.OmenuFragment
import com.example.kakaotalk.bottom_Fragment.PersonFragment
import com.example.kakaotalk.bottom_Fragment.SearchFragment
import com.example.kakaotalk.bottom_Fragment.TalkFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var personFragment: PersonFragment
    private lateinit var talkFragment: TalkFragment
    private lateinit var searchFragment: SearchFragment
    private lateinit var omenuFragment: OmenuFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_nav = findViewById<BottomNavigationView>(R.id.bottom_nav)

        val personFragment = PersonFragment.newInstance()
        supportFragmentManager.beginTransaction().add(R.id.fragments_frame, personFragment).commit()


        btn_nav.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.menu_person -> {
                    val personFragment = PersonFragment.newInstance()
                    supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, personFragment).commit()
                }
                R.id.menu_talk -> {
                    val talkFragment = TalkFragment.newInstance()
                    supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, talkFragment).commit()
                }
                R.id.menu_search -> {
                    val searchFragment = SearchFragment.newInstance()
                    supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, searchFragment).commit()
                }
                R.id.menu_omenu -> {
                    val omenuFragment = OmenuFragment.newInstance()
                    supportFragmentManager.beginTransaction().replace(R.id.fragments_frame, omenuFragment).commit()
                }

            }
            return@setOnItemSelectedListener true
        }
    }

}


