package com.example.eggcounter.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.eggcounter.R
import com.example.eggcounter.databinding.FragmentGame1Binding


class Game1 : Fragment() {
    private var _binding:FragmentGame1Binding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       _binding =  FragmentGame1Binding.inflate(inflater, container, false)
         val view = binding.root
         var counter  = 0
        binding.imgbtnegg.setOnClickListener{
            counter++
            binding.tvCounter.text = counter.toString()
        }

        binding.reset.setOnClickListener{
            binding.tvCounter.text = "0"
            counter = 0
        }

        return view
    }

}