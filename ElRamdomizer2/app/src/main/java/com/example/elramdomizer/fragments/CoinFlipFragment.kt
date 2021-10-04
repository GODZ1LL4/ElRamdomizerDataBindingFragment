package com.example.elramdomizer.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.elramdomizer.R
import com.example.elramdomizer.databinding.FragmentCoinFlipBinding


class CoinFlipFragment : Fragment() {

    lateinit var binding: FragmentCoinFlipBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCoinFlipBinding.inflate(inflater, container, false)

        binding.btnLanzarCoin.setOnClickListener {
            lanzarMoneda()
        }

        return binding.root

    }


    private fun lanzarMoneda() {
        val randomNum = kotlin.random.Random.nextInt(2) + 1

        val drawableLado = when (randomNum) {
            1 -> R.drawable.face
            else -> R.drawable.cross
        }

        binding.coinImg.setImageResource(drawableLado)
    }


}