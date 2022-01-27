package com.androidavanzado.pruebapager.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import com.androidavanzado.pruebapager.R
import kotlinx.android.synthetic.main.fragment_conoce_mas.*

/**
 * A simple [Fragment] subclass.
 */
class ConoceMas : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        iniResource()
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_conoce_mas, container, false)

    }


    fun iniResource(){
        LinerLayout_of_recyclerView
    }

}
