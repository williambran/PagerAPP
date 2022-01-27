package com.androidavanzado.pruebapager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager.widget.ViewPager
import com.androidavanzado.pruebapager.fragments.ConoceMas
import com.androidavanzado.pruebapager.fragments.LasVacunas
import com.androidavanzado.pruebapager.fragments.Materiales
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val adapter = PagedAdapterConoceMas(supportFragmentManager)
        adapter.addFragment(ConoceMas(), "Conoce masputo")
        adapter.addFragment(LasVacunas(),"Las Vacunas")
        adapter.addFragment(Materiales(), "Materiales")
        conoceVacunaPaged.adapter = adapter
        conoceVacunaTab.setupWithViewPager(conoceVacunaPaged)

    }
}
