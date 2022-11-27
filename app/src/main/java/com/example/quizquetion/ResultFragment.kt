package com.example.quizquetion

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.quizquetion.databinding.FragmentResultBinding

class ResultFragment : Fragment(R.layout.fragment_result) {
    lateinit var binding: FragmentResultBinding
    val dataModel : DataModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    binding = FragmentResultBinding.bind(view)

    }


}