package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.DataStructure

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentDSStackBinding


class DSStack : Fragment() {

    private lateinit var binding : FragmentDSStackBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDSStackBinding.inflate(layoutInflater,container,false)



        return binding.root
    }

}