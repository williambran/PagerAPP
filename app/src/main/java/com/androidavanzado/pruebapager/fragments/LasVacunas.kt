package com.androidavanzado.pruebapager.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.androidavanzado.pruebapager.R

/**
 * A simple [Fragment] subclass.
 */
class LasVacunas : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_las_vacunas, container, false)
    }

}
