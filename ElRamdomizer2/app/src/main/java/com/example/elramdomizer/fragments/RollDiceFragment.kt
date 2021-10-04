package com.example.elramdomizer.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.elramdomizer.R
import com.example.elramdomizer.databinding.FragmentRollDiceBinding
import kotlin.random.Random


class RollDiceFragment : Fragment() {


    lateinit var binding: FragmentRollDiceBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentRollDiceBinding.inflate(inflater, container, false)

        binding.btnTirarDice.setOnClickListener {
            tirarDado()
        }

        return binding.root
    }

    private fun tirarDado() {
        val randomNum = Random.nextInt(6) + 1

        val drawableImg = when (randomNum) {
            1 -> R.drawable.alea_1
            2 -> R.drawable.alea_2
            3 -> R.drawable.alea_3
            4 -> R.drawable.alea_4
            5 -> R.drawable.alea_5
            else -> R.drawable.alea_6
        }

        binding.diceImg.setImageResource(drawableImg)
    }


}