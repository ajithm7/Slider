package com.example.slider

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.slider.databinding.FragmentFirstBinding
import com.example.slider.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentSecondBinding = DataBindingUtil.inflate(
            inflater,R.layout.fragment_second,container,false)

//The complete onClickListener with Navigation using createNavigateOnClickListener
        binding.secondNextButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_secondFragment_to_thirdFragment))

        binding.previousButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_secondFragment_to_firstFragment))
        return binding.root
    }

}