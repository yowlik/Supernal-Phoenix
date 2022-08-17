package com.chillyroom.zhmr.g.white

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import com.chillyroom.zhmr.g.R
import com.chillyroom.zhmr.g.databinding.ActivityGameBinding

class Game : AppCompatActivity() {
    val roll=mutableListOf<String>("1","2","3","4","5","6","7","8","9")
    var scr=0
    private var timer: CountDownTimer?=null
    lateinit var binding: ActivityGameBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.im1.setVisibility(View.GONE)
        binding.im2.setVisibility(View.GONE)
        binding.im3.setVisibility(View.GONE)
        binding.im4.setVisibility(View.GONE)
        binding.im5.setVisibility(View.GONE)
        binding.im6.setVisibility(View.GONE)
        binding.im7.setVisibility(View.GONE)
        binding.im8.setVisibility(View.GONE)
        binding.im9.setVisibility(View.GONE)
        binding.apply {
            binding.start.setOnClickListener {
                binding.start.setVisibility(View.GONE)
                scr=0
                binding.scoret.text="$scr"
                startTimer(30000)
            }

        }

    }





    private fun startTimer(timeMillis:Long){
        timer?.cancel()
        timer=object : CountDownTimer(timeMillis,500){

            override fun onTick(TimeEl: Long) {
                var i=roll.random()
                check(i)
                binding.timend.text="${(TimeEl/1000).toString()}"
            }
            override fun onFinish() {
                binding.im1.setVisibility(View.GONE)
                binding.im2.setVisibility(View.GONE)
                binding.im3.setVisibility(View.GONE)
                binding.im4.setVisibility(View.GONE)
                binding.im5.setVisibility(View.GONE)
                binding.im6.setVisibility(View.GONE)
                binding.im7.setVisibility(View.GONE)
                binding.im8.setVisibility(View.GONE)
                binding.im9.setVisibility(View.GONE)
                binding.timend.text="Finish"
                binding.start.setVisibility(View.VISIBLE)

            }

        }.start()

    }

    fun check(i:String){
        if(i=="1"){
            binding.im1.setVisibility(View.VISIBLE)
            binding.im2.setVisibility(View.GONE)
            binding.im3.setVisibility(View.GONE)
            binding.im4.setVisibility(View.GONE)
            binding.im5.setVisibility(View.GONE)
            binding.im6.setVisibility(View.GONE)
            binding.im7.setVisibility(View.GONE)
            binding.im8.setVisibility(View.GONE)
            binding.im9.setVisibility(View.GONE)
            binding.im1.setOnClickListener {
                scr++
                binding.scoret.text="$scr"
            }
        }
        else if(i=="2"){
            binding.im2.setVisibility(View.VISIBLE)
            binding.im1.setVisibility(View.GONE)
            binding.im3.setVisibility(View.GONE)
            binding.im4.setVisibility(View.GONE)
            binding.im5.setVisibility(View.GONE)
            binding.im6.setVisibility(View.GONE)
            binding.im7.setVisibility(View.GONE)
            binding.im8.setVisibility(View.GONE)
            binding.im9.setVisibility(View.GONE)
            binding.im2.setOnClickListener {
                scr++
                binding.scoret.text="$scr"
            }
        }
        else if(i=="3"){
            binding.im3.setVisibility(View.VISIBLE)
            binding.im1.setVisibility(View.GONE)
            binding.im2.setVisibility(View.GONE)
            binding.im4.setVisibility(View.GONE)
            binding.im5.setVisibility(View.GONE)
            binding.im6.setVisibility(View.GONE)
            binding.im7.setVisibility(View.GONE)
            binding.im8.setVisibility(View.GONE)
            binding.im9.setVisibility(View.GONE)
            binding.im3.setOnClickListener {
                scr++
                binding.scoret.text="$scr"
            }
        }
        else if(i=="4"){
            binding.im4.setVisibility(View.VISIBLE)
            binding.im1.setVisibility(View.GONE)
            binding.im3.setVisibility(View.GONE)
            binding.im2.setVisibility(View.GONE)
            binding.im5.setVisibility(View.GONE)
            binding.im6.setVisibility(View.GONE)
            binding.im7.setVisibility(View.GONE)
            binding.im8.setVisibility(View.GONE)
            binding.im9.setVisibility(View.GONE)
            binding.im4.setOnClickListener {
                scr++
                binding.scoret.text="$scr"
            }
        }
        else if(i=="5"){
            binding.im5.setVisibility(View.VISIBLE)
            binding.im1.setVisibility(View.GONE)
            binding.im3.setVisibility(View.GONE)
            binding.im4.setVisibility(View.GONE)
            binding.im2.setVisibility(View.GONE)
            binding.im6.setVisibility(View.GONE)
            binding.im7.setVisibility(View.GONE)
            binding.im8.setVisibility(View.GONE)
            binding.im9.setVisibility(View.GONE)
            binding.im5.setOnClickListener {
                scr++
                binding.scoret.text="$scr"
            }
        }
        else if(i=="6"){
            binding.im6.setVisibility(View.VISIBLE)
            binding.im1.setVisibility(View.GONE)
            binding.im3.setVisibility(View.GONE)
            binding.im4.setVisibility(View.GONE)
            binding.im5.setVisibility(View.GONE)
            binding.im2.setVisibility(View.GONE)
            binding.im7.setVisibility(View.GONE)
            binding.im8.setVisibility(View.GONE)
            binding.im9.setVisibility(View.GONE)
            binding.im6.setOnClickListener {
                scr++
                binding.scoret.text="$scr"
            }
        }
        else if(i=="7"){
            binding.im7.setVisibility(View.VISIBLE)
            binding.im1.setVisibility(View.GONE)
            binding.im3.setVisibility(View.GONE)
            binding.im4.setVisibility(View.GONE)
            binding.im5.setVisibility(View.GONE)
            binding.im6.setVisibility(View.GONE)
            binding.im2.setVisibility(View.GONE)
            binding.im8.setVisibility(View.GONE)
            binding.im9.setVisibility(View.GONE)
            binding.im7.setOnClickListener {
                scr++
                binding.scoret.text="$scr"
            }
        }else if(i=="8"){
            binding.im8.setVisibility(View.VISIBLE)
            binding.im1.setVisibility(View.GONE)
            binding.im3.setVisibility(View.GONE)
            binding.im4.setVisibility(View.GONE)
            binding.im5.setVisibility(View.GONE)
            binding.im6.setVisibility(View.GONE)
            binding.im7.setVisibility(View.GONE)
            binding.im2.setVisibility(View.GONE)
            binding.im9.setVisibility(View.GONE)
            binding.im8.setOnClickListener {
                scr++
                binding.scoret.text="$scr"
            }
        }
        else if(i=="9"){
            binding.im9.setVisibility(View.VISIBLE)
            binding.im1.setVisibility(View.GONE)
            binding.im3.setVisibility(View.GONE)
            binding.im4.setVisibility(View.GONE)
            binding.im5.setVisibility(View.GONE)
            binding.im6.setVisibility(View.GONE)
            binding.im7.setVisibility(View.GONE)
            binding.im8.setVisibility(View.GONE)
            binding.im2.setVisibility(View.GONE)
            binding.im9.setOnClickListener {
                scr++
                binding.scoret.text="$scr"
            }
        }
    }

}