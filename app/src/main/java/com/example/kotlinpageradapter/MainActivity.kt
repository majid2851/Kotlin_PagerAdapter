package com.example.pageradapterkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.kotlinpageradapter.DataSource
import com.example.kotlinpageradapter.R
import com.example.kotlinpageradapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    lateinit var binding:ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.viewPager.adapter=MyPagerAdapter(DataSource.getData(),this)

    }
}