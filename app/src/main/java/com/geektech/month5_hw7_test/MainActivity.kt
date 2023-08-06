package com.geektech.month5_hw7_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geektech.month5_hw7_test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        with(binding){
            btnCalculateAdd.setOnClickListener {
                tvResult.text = Math().add(etFirst.text.toString(),etSecond.text.toString())
            }
            btnCalculateDivide.setOnClickListener{
                tvResult.text = Math().divide(etFirst.text.toString(),etSecond.text.toString())
            }
        }
    }
}