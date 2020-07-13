package com.seif.ad3yaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_doaa_source.*

class doaa_source : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doaa_source)

        var i=intent.extras!!.getString("doaa")
        txt_doaa.text=i
    }
}