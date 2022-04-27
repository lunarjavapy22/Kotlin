package com.example.kotlinlearning

import android.icu.number.IntegerWidth
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.reflect.typeOf

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x = 25
        var y = 75
        var z = y / x
        println(z)
        //var ile yazılanlar değişkendir. val ile yzılanlar ise sabittir.
        val zax = 52
        //bu şekilde tanımlarsam birdaha değiştirilemez.
        //Değişkende tanımlıyabiliriz.
        val myint : Int
        myint = 43
        var double = 15.5
        val float = 15.555f
        //double ile float arasıdna boyut gibi farklar olsada float tanımlarken sonuna f koyuyoruz.
        println(double + float)

        //String
        val myString = "Selim ozen"
        //stringler bir sınıftır. Biz o sınıftan az önce bir obje tanımladık.
        val myName = "Selim"
        val sirName = "Ozen"
        val fullName = myName + sirName
        println(fullName )
    }
}
