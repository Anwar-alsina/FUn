package com.example.funapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.funapp.databinding.FragmentIntroBinding


class IntroFragment : Fragment() {

    private var _binding: FragmentIntroBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentIntroBinding.inflate(inflater, container, false)
        val view = binding.root

        binding.btnSignup.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_introFragment_to_loginFragment2)
        }


        binding.tvRegister.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_introFragment_to_registerFragment3)
        }


        return view
    }


}