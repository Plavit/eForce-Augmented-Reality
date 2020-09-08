package cz.cvut.fel.eforce.eforce_app


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_more.view.*


/**
 * A simple [Fragment] subclass.
 */
class MoreFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_more, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view?.imageButton?.setOnClickListener { startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://eforce.fel.cvut.cz"))) }
    }
}// Required empty public constructor
