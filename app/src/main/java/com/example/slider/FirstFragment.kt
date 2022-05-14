package com.example.slider

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.slider.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentFirstBinding = DataBindingUtil.inflate(
        inflater,R.layout.fragment_first,container,false)

//The complete onClickListener with Navigation using createNavigateOnClickListener
        binding.nextButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_secondFragment))
        return binding.root
    }

}