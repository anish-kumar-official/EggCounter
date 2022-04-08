package com.example.eggcounter.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.eggcounter.R
import com.example.eggcounter.databinding.FragmentGame1Binding
import com.example.eggcounter.databinding.FragmentGame2Binding


class Game2 : Fragment() {
    private var _binding: FragmentGame2Binding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding =  FragmentGame2Binding.inflate(inflater, container, false)
        val view = binding.root


        return view
    }
}