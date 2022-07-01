package com.ozansoykan.odev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ozansoykan.odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)
        var numbers = ArrayList<Int>()
        var result = 0

        tasarim.buttonBir.setOnClickListener {
            tasarim.textViewSonuc.text = "1"
            numbers.add(1)
        }
        tasarim.buttonKi.setOnClickListener {
            tasarim.textViewSonuc.text = "2"
            numbers.add(2)
        }
        tasarim.buttonUc.setOnClickListener {
            tasarim.textViewSonuc.text = "3"
            numbers.add(3)
        }
        tasarim.buttonDort.setOnClickListener {
            tasarim.textViewSonuc.text = "4"
            numbers.add(4)
        }
        tasarim.buttonBes.setOnClickListener {
            tasarim.textViewSonuc.text = "5"
            numbers.add(5)
        }
        tasarim.buttonAlti.setOnClickListener {
            tasarim.textViewSonuc.text = "6"
            numbers.add(6)
        }
        tasarim.buttonYedi.setOnClickListener {
            tasarim.textViewSonuc.text = "7"
            numbers.add(7)
        }
        tasarim.buttonSekiz.setOnClickListener {
            tasarim.textViewSonuc.text = "8"
            numbers.add(8)
        }
        tasarim.buttonDokuz.setOnClickListener {
            tasarim.textViewSonuc.text = "9"
            numbers.add(9)
        }
        tasarim.buttonToplama.setOnClickListener {
            for(var i in numbers){
                result += i
            }
        }
        tasarim.buttonAC.setOnClickListener {
            tasarim.textViewSonuc.text = "Sonuç : 0"
            numbers.clear()
        }
        tasarim.buttonSonuc.setOnClickListener {
            tasarim.textViewSonuc.text = "Sonuç : $result"
        }

    }
}