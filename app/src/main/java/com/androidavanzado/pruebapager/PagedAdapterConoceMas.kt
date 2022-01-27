package com.androidavanzado.pruebapager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.androidavanzado.pruebapager.fragments.ConoceMas
import com.androidavanzado.pruebapager.fragments.LasVacunas
import com.androidavanzado.pruebapager.fragments.Materiales

class PagedAdapterConoceMas(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private  val listFragments = ArrayList<Fragment>()
    private val mFragmentTitleList = ArrayList<String>()


    override fun getItem(position: Int): Fragment {
        when(position){
            0->{
                val conocemas: ConoceMas =
                    ConoceMas()
                return  conocemas
            }
            1 ->{
                val lasVacunas: LasVacunas= LasVacunas()
                return lasVacunas
            }
            2->{
                val materiales: Materiales = Materiales()
                return  materiales
            }

        }
        return listFragments[position]
    }

    override fun getCount(): Int {
        return listFragments.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0->"Conoce Mamamas"
            1->"Las Vacunas"
            2-> "Materiales"
            else -> "Conoce Mas"

        }
    }

    fun addFragment(fragment: Fragment, title: String){
        mFragmentTitleList.add(title)
        listFragments.add(fragment)
    }
}