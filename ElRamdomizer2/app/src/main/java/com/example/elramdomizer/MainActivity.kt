package com.example.elramdomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.elramdomizer.databinding.ActivityMainBinding
import com.example.elramdomizer.fragments.CoinFlipFragment
import com.example.elramdomizer.fragments.RollDiceFragment


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.btnCoinFlip.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frame_content, CoinFlipFragment()).commit()
        }

        binding.btnRollDice.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frame_content, RollDiceFragment()).commit()
        }


    }


}