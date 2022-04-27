package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //İlk başta isim değişkenini tanımladım. Sonra değer atadım. val dlarak atandığı için birdaha değişmez.
        val isim : String
        isim = "Selim"

        var age = 50
        age = 60
        println(isim + " " + age)

        //Dönüşümler
        var mynumber = 50
        var double = mynumber.toDouble()
        println(double)


        //String dönüşümü
        var strtoInt = "10"
        var int =  strtoInt.toInt()
        println(int * 2)

    }
}
