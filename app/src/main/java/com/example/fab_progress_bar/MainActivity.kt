package com.example.fab_progress_bar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

// add dependency of support:design and sync project
//    implementation 'com.android.support:design:28.0.0'
// when we click our fab then our progress will be start
class MainActivity : AppCompatActivity() {
// i add custom_progressbar.xml in drawable folder
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// set 23% by default
    // when we click on fab button it will progress 23% and onword
        progressBar.progress = 23

        fab.setOnClickListener {
            // it will add 5% in 23 and module of 100 because we need truncate it
            progressBar.progress = (progressBar.progress + 5) % 100
        }


    }
}
