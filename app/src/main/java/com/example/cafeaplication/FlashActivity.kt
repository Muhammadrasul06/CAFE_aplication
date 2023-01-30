package com.example.cafeaplication

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.cafeaplication.Login.LoginActivity
import com.example.cafeaplication.databinding.ActivityFlashBinding

class FlashActivity : AppCompatActivity() {
    lateinit var binding: ActivityFlashBinding

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var language: String = ""

        binding = ActivityFlashBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.RDButtonUzb.setOnClickListener {
                binding.RDButtonUzb.setTextColor(getColor(R.color.white))
                binding.RDButtonUzb.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.backgroun_selected_button))

                binding.RDButtonRus.setTextColor(getColor(R.color.black))
                binding.RDButtonRus.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.background_radio_button))

                binding.RDButtonEng.setTextColor(getColor(R.color.black))
                binding.RDButtonEng.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.background_radio_button))
            }

        binding.RDButtonRus.setOnClickListener {
                binding.RDButtonRus.setTextColor(getColor(R.color.white))
                binding.RDButtonRus.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.backgroun_selected_button))

                binding.RDButtonUzb.setTextColor(getColor(R.color.black))
                binding.RDButtonUzb.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.background_radio_button))

                binding.RDButtonEng.setTextColor(getColor(R.color.black))
                binding.RDButtonEng.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.background_radio_button))
            }

        binding.RDButtonEng.setOnClickListener {
                binding.RDButtonEng.setTextColor(getColor(R.color.white))
                binding.RDButtonEng.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.backgroun_selected_button))

                binding.RDButtonUzb.setTextColor(getColor(R.color.black))
                binding.RDButtonUzb.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.background_radio_button))

                binding.RDButtonRus.setTextColor(getColor(R.color.black))
                binding.RDButtonRus.setBackgroundDrawable(ContextCompat.getDrawable(this, R.drawable.background_radio_button))
            }

        binding.btnNext.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
            finish()
        }
        finish()
    }
}