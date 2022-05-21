package com.ezatpanah.viewmodel_youtube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.ezatpanah.viewmodel_youtube.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var counter =0
    private val mainViewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            tvNumber.text = mainViewModel.counter.toString()

            btnAdd.setOnClickListener {
/*                counter ++
                tvNumber.text = counter.toString()*/

                mainViewModel.addNumber()
                tvNumber.text = mainViewModel.counter.toString()

            }
        }
    }
}