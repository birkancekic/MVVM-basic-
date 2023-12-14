package com.birkancekic.mvvmkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.birkancekic.mvvmkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel:MainActivtyViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.mainActiviyNesnesi=this

        viewModel.sonuc.observe(this){
            binding.hesaplamaSonucu=it
        }

        binding.hesaplamaSonucu="0"




    }

    fun buttonToplamaTikla(alinanSayi1:String,alinanSayi2:String){
        viewModel.toplamaYap(alinanSayi1,alinanSayi2)



    }

    fun buttonCarpmaTikla(alinanSayi1:String,alinanSayi2:String){

        viewModel.carpmaYap(alinanSayi1,alinanSayi2)

    }


}