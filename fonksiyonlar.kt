package com.example.kotlin2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mySum(a = 15, b = 23)
        val value = fonks(x = 15, y = 20)
        //Fonksiyonumuzdan dönen değeri başka değerlere atayabiliriz.

    }

    //Fonksiyon dersleri
    fun mySum(a: Int, b: Int){
        textView.text = "${a+b}"
    }
    //Return kullanımı
    fun fonks(x: Int,y: Int ) : Int {
        return x * y
    }
}
