package com.example.slider

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.slider.databinding.FragmentSecondBinding
import com.example.slider.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding: FragmentThirdBinding = DataBindingUtil.inflate(
        inflater,R.layout.fragment_third,container,false)

        binding.secondPreviousButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_thirdFragment_to_secondFragment))

        binding.thirdNextButton.setOnClickListener{
            val intent= Intent(context,SecondActivity::class.java)
            startActivity(intent)}

        return binding.root
    }

}