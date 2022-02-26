package javi.toxic.ohmcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class CalcResistance : AppCompatActivity() {

    lateinit var voltage: EditText
    lateinit var current: EditText
    lateinit var calculateresistance: Button
    lateinit var finalResistance: TextView
    lateinit var res: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_resistance)

        voltage = findViewById(R.id.voltage)
        current = findViewById(R.id.current)
        calculateresistance = findViewById(R.id.calculateresistance)
        finalResistance = findViewById(R.id.finalResistance)
        res = findViewById(R.id.res)

        calculateresistance.setOnClickListener{
            var calcVoltage = voltage.text.toString().toDoubleOrNull()
            var calcCurrent = current.text.toString().toDoubleOrNull()

            if(calcVoltage == null || calcCurrent == null){
                Toast.makeText(this, "Enter a Value!", Toast.LENGTH_SHORT).show()
            }
            else{
                if(calcCurrent!! <= 0.0){
                    Toast.makeText(this, "Resistance must be a positive value!", Toast.LENGTH_SHORT).show()
                }
                else{
                    var finalCur: Double = calcVoltage!! / calcCurrent!!;
                    finalResistance.text = finalCur.toString();
                }
            }
        }
    }
}