package com.josphat.meowmeowapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.josphat.meowmeowapi.ui.CatViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var catViewModel: CatViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat)
    }
}