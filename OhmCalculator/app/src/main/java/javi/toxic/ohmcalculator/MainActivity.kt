package javi.toxic.ohmcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    lateinit var resistance: Button
    lateinit var voltage: Button
    lateinit var current: Button
    lateinit var close: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resistance = findViewById(R.id.resistance)
        voltage = findViewById(R.id.voltage)
        current = findViewById(R.id.current)
        close = findViewById(R.id.close)


        resistance.setOnClickListener{
            val intent = Intent(this, CalcResistance::class.java)

            startActivity(intent)
        }
        voltage.setOnClickListener{
            val intent = Intent(this, CalcVoltage::class.java)

            startActivity(intent)
        }
        current.setOnClickListener{
            val intent = Intent(this, CalcCurrent::class.java)

            startActivity(intent)
        }
        close.setOnClickListener{
            exitProcess(0);
        }
    }
}