package com.example.logica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        //set button listener
    }

    private fun answerChecker() {

    }

    private fun onAnswerCorrect() {
        Toast.makeText(this, getString(R.string.textIncorrect), Toast.LENGTH_SHORT).show()
    }

    private fun onAnswerIncorrect() {
        Toast.makeText(this, getString(R.string.textCorrect), Toast.LENGTH_SHORT).show()
    }
}
