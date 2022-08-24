package com.example.fragment

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.fragment.fragments.FragmentA
import com.example.fragment.fragments.FragmentB
import com.example.fragment.fragments.FragmentC

class MainActivity : AppCompatActivity() {

    private lateinit var frag : FragmentManager
    private lateinit var ft : FragmentTransaction
    private lateinit var btnFragA : Button
    private lateinit var btnFragB : Button
    private lateinit var btnFragC : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFrg(FragmentA(),0)

        btnFragA = findViewById(R.id.FragA)
        btnFragA.setOnClickListener {
            loadFrg(FragmentA(),0)
        }

        btnFragB = findViewById(R.id.FragB)
        btnFragB.setOnClickListener{
            loadFrg(FragmentB(),1)
        }

        btnFragC = findViewById(R.id.FragC)
        btnFragC.setOnClickListener{
            loadFrg(FragmentC(),1)
        }

    }
    private fun loadFrg(fragment : Fragment, flag : Int) {
        frag = supportFragmentManager
        ft = frag.beginTransaction()
        if (flag == 0) {
            ft.add(R.id.fragment_container, fragment)
            frag.popBackStack("ROOT", FragmentManager.POP_BACK_STACK_INCLUSIVE)
            ft.addToBackStack("ROOT")
        } else {
            ft.replace(R.id.fragment_container, fragment)
            ft.addToBackStack(null)
        }
        ft.commit()
    }
}