package cz.cvut.fel.eforce.eforce_app

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class LoadingScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
