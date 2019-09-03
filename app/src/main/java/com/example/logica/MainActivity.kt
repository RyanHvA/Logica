package com.example.logica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        btnSubmit.setOnClickListener {
            onSubmitClick()
        }
    }

    private fun onSubmitClick() {
        if (answerVal1.toString() == getString(R.string.t)
            && answerVal2.toString() == getString(R.string.f)
            && answerVal3.toString() == getString(R.string.f)
            && answerVal4.toString() == getString(R.string.f)) {
            onAnswerCorrect()
        } else { onAnswerIncorrect()
        }
    }

    private fun onAnswerCorrect() {
        Toast.makeText(this, getString(R.string.textCorrect), Toast.LENGTH_SHORT).show()
    }

    private fun onAnswerIncorrect() {
        Toast.makeText(this, getString(R.string.textIncorrect), Toast.LENGTH_SHORT).show()
    }
}
