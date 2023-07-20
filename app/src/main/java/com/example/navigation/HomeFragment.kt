package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstButton:Button = view.findViewById(R.id.first_to_button)
        val secondButton:Button = view.findViewById(R.id.second_to_button)

        var navHostFragment =
            requireActivity().supportFragmentManager.findFragmentById(R.id.host_activity_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        firstButton.setOnClickListener{
            val action =
                HomeFragmentDirections.actionHomeFragmentToFirstFragment(Name = "ame")
            navController.navigate(action)
        }

        secondButton.setOnClickListener{
            val action =
                HomeFragmentDirections.actionHomeFragmentToSecondFragment()
            navController.navigate(action)
        }
    }

}