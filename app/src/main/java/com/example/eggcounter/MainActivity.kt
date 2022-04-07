package com.example.eggcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.eggcounter.Fragments.Game1
import com.example.eggcounter.Fragments.Game2
import com.example.eggcounter.Fragments.Game3
import com.example.eggcounter.databinding.ActivityMainBinding
import com.example.eggcounter.databinding.ActivitySplashScreenBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val auth_titles = arrayListOf("Game 1","Game 2","Game 3")
        val authpageradapter:Authpageradapter = Authpageradapter(this)
        binding.viewPagerMain.adapter =authpageradapter
        TabLayoutMediator(binding.tabLayoutMain,binding.viewPagerMain){
                tab,position->
            tab.text=auth_titles[position]
        }.attach()


    }

    class Authpageradapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity){
        override fun getItemCount(): Int {
            return 3
        }

        override fun createFragment(position: Int): Fragment {
            return when(position){
                0->Game1()
                1->Game2()
                2->Game3()
                else -> Game1()
            }
        }

    }
}
