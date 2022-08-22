package com.example.fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.fragment.fragments.FragmentA

class MainActivity : AppCompatActivity() {

    private lateinit var frag : FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        frag = supportFragmentManager


        val fragmentA = FragmentA()
        frag.beginTransaction().add(R.id.fragment_container, fragmentA).commit()
    }
}