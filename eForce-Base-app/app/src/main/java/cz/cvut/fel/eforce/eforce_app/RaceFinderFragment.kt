package cz.cvut.fel.eforce.eforce_app


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.race_finder.*


/**
 * A simple [Fragment] subclass.
 */
class RaceFinderFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.race_finder, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button3.setOnClickListener{startActivity(Intent(activity,RaceDetailActivity::class.java))}
    }
}// Required empty public constructor
