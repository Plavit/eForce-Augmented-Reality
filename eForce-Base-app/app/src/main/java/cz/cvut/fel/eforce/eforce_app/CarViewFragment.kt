package cz.cvut.fel.eforce.eforce_app


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_more.view.*
import android.content.ComponentName




/**
 * A simple [Fragment] subclass.
 */
class CarViewFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_car_view_fragment, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view?.imageButton?.setOnClickListener {

            val intent = Intent(Intent.ACTION_MAIN)
            intent.component = ComponentName("com.eForce.ARdemo", "com.eForce.ARdemo.UnityPlayerActivity" )
            startActivity(intent)


        }

    }



}// Required empty public constructor
