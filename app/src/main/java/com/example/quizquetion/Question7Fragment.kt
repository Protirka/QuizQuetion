package com.example.quizquetion

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.quizquetion.databinding.FragmentQuestion7Binding

class Question7Fragment : Fragment(R.layout.fragment_question1) {
   lateinit var binding: FragmentQuestion7Binding
   val dataModel : DataModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentQuestion7Binding.bind(view)

        binding.imgBack.setOnClickListener {
            Navigation.findNavController(view).popBackStack()
        }

        binding.btnAnswer1.setOnClickListener {
            dataModel.object1 = 0
        }
        binding.btnAnswer1.setOnClickListener {
            dataModel.object1 = 5
        }
        binding.btnAnswer1.setOnClickListener {
            dataModel.object1 = 10
        }

        binding.btnNext.setOnClickListener {
            findNavController()
                .navigate(Question7FragmentDirections
                    .actionQuestion7FragmentToQuestion8Fragment())
        }

    }

}