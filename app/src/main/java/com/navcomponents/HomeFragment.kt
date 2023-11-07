package com.navcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.fragment.findNavController
class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button1 = view.findViewById<AppCompatButton>(R.id.button1)
        val button2 = view.findViewById<AppCompatButton>(R.id.button2)
        val button3 = view.findViewById<AppCompatButton>(R.id.button3)
        val navController = findNavController()

        button1.setOnClickListener {
            navController.navigate(R.id.firstFragment)
        }
        button2.setOnClickListener {
            navController.navigate(R.id.secondFragment)
        }
        button3.setOnClickListener {
            navController.navigate(R.id.thirdFragment)
        }
    }
}