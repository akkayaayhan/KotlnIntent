package com.akkayasoft.kotlnintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.akkayasoft.kotlnintent.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding:ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityNextBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        val gelenVeri=intent
        val name=gelenVeri.getStringExtra("name")
        binding.nameText.setText(name)
    }
}