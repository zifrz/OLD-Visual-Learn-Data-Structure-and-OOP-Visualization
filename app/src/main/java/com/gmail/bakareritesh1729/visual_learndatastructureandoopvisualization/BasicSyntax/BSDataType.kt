package com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.BasicSyntax

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.R
import com.gmail.bakareritesh1729.visual_learndatastructureandoopvisualization.databinding.FragmentBSDataTypeBinding

class BSDataType : Fragment() {

    private lateinit var binding : FragmentBSDataTypeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentBSDataTypeBinding.inflate(layoutInflater,container,false)


        return binding.root
    }


}