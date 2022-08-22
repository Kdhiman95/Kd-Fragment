package com.example.fragment.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.fragment.R

class FragmentA : Fragment() {
    private lateinit var message : EditText
    private lateinit var sendBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fg", "onCreate: A")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_a, container, false)
        Log.d("Fg", "onCreateView: A")
        message = view.findViewById(R.id.messageInput)
        sendBtn = view.findViewById(R.id.sendBtn)

        sendBtn.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("message", message.text.toString())
            val fragmentB = FragmentB()
            fragmentB.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.fragment_container, fragmentB)?.commit()
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Fg", "onViewCreated: A")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("Fg", "onViewStateRestored: A")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fg", "onStart: A")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fg", "onResume: A")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fg", "onPause: A")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fg", "onStop: A")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("Fg", "onSaveInstanceState: A")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fg", "onDestroyView: A")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fg", "onDestroy: A")
    }
}