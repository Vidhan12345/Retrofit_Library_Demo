package com.example.retrofit_library_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val QuoteApi = RetrofitBuilder.getInstance().create(myInterface::class.java)
        GlobalScope.launch {
            val result = QuoteApi.getQuotes()
            if (result!=null){
                Log.d("Result",result.body().toString())
            }
        }
    }
}