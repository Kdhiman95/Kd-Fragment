package com.example.fragment.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragment.R


class FragmentB : Fragment() {

    private lateinit var msgToDisplay : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fg", "onCreate: B")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        msgToDisplay = view.findViewById(R.id.displayMsg)

        val msg = arguments?.getString("message")

        msgToDisplay.text = msg

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("Fg", "onViewCreated: B")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("Fg", "onViewStateRestored: B")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Fg", "onStart: B")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fg", "onResume: B")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fg", "onPause: B")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fg", "onStop: B")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("Fg", "onSaveInstanceState: B")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fg", "onDestroyView: B")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fg", "onDestroy: B")
    }
}