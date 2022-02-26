package javi.toxic.ohmcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class CalcVoltage : AppCompatActivity() {

    lateinit var current: EditText
    lateinit var resistance: EditText
    lateinit var calculatevoltage: Button
    lateinit var finalVoltage: TextView
    lateinit var vol: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_voltage)

        current = findViewById(R.id.current)
        resistance = findViewById(R.id.resistance)
        calculatevoltage = findViewById(R.id.calculatevoltage)
        finalVoltage = findViewById(R.id.finalVoltage)
        vol = findViewById(R.id.vol)

        calculatevoltage.setOnClickListener{
            var calcCurrent = current.text.toString().toDoubleOrNull()
            var calcResistance = resistance.text.toString().toDoubleOrNull()

            if(calcCurrent == null || calcResistance == null){
                Toast.makeText(this, "Enter a Value!", Toast.LENGTH_SHORT).show()
            }
            else{
                var finalVol: Double = calcCurrent!! * calcResistance!!;
                finalVoltage.text = finalVol.toString();
            }
        }
    }
}