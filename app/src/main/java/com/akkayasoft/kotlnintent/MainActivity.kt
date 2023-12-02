package com.akkayasoft.kotlnintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.akkayasoft.kotlnintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)


    }

    fun next(view: View){
        val intent=Intent(this@MainActivity,NextActivity::class.java)
        intent.putExtra("name",binding.editText.text.toString())
        startActivity(intent)
    }
}