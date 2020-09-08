package cz.cvut.fel.eforce.eforce_app

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.view.ViewPager
import android.support.v4.view.ViewPager.OnPageChangeListener
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_profile -> {
                viewPager.setCurrentItem(0)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_token -> {
                viewPager.setCurrentItem(1)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_race -> {
                viewPager.setCurrentItem(2)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_car -> {
                viewPager.setCurrentItem(3)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_more -> {
                viewPager.setCurrentItem(4)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private val onPageChangeListener = object:ViewPager.OnPageChangeListener{
        override fun onPageScrollStateChanged(state: Int) {

        }

        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {

        }

        override fun onPageSelected(position: Int) {
            navigation.menu.getItem(position).isChecked=true
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager.adapter = MenuPagerAdapter(supportFragmentManager)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        viewPager.setOnPageChangeListener(onPageChangeListener)
    }
}
