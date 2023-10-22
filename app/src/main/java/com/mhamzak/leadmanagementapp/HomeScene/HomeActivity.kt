package com.mhamzak.leadmanagementapp.HomeScene

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mhamzak.leadmanagementapp.R

class HomeActivity: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        prepareView()
        prepareData()

    }


    private fun prepareView(){
      //  setupButton()
    }

    private fun prepareData(){

    }
}