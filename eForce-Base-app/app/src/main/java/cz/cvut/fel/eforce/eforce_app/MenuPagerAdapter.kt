package cz.cvut.fel.eforce.eforce_app

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by Marek on 14.4.2018.
 */
class MenuPagerAdapter(fm:FragmentManager):FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 5
    }

    override fun getItem(position: Int): Fragment {
        return when (position){
            0->ProfileFragment()
            1->TokenFragment()
            2->RaceFinderFragment()
            3->CarViewFragment()
            4->MoreFragment()
            else->ProfileFragment()
        }
    }


}