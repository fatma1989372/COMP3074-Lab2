package ca.gbc.comp3074.Akkoca_Fatma.Lab2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textOutput = findViewById<TextView>(R.id.textOutput)
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val buttonSubtract = findViewById<Button>(R.id.buttonSubtract)
        val buttonReset = findViewById<Button>(R.id.buttonReset)
        val buttonStep = findViewById<Button>(R.id.buttonStep)

        var value = 0
        var step = 1

        buttonAdd.setOnClickListener {
            value += step
            textOutput.text = value.toString()
        }

        buttonSubtract.setOnClickListener {
            value -= step
            textOutput.text = value.toString()
        }

        buttonReset.setOnClickListener {
            value = 0
            step = 1
            textOutput.text = value.toString()
        }

        buttonStep.setOnClickListener {
            step = 2
        }
    }
}