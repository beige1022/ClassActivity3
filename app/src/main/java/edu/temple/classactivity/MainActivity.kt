package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var displayTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayTextView = findViewById(R.id.displayTextView)

        findViewById<Button>(R.id.clickMeButton).setOnClickListener {
            if (findViewById<EditText>(R.id.nameEditText).text.isNotEmpty()) {
                displayTextView.text =
                    "Hello, ${findViewById<EditText>(R.id.nameEditText).text}"
            } else {
                displayTextView.text = "Please enter your name!"
            }
        }
    }
}
