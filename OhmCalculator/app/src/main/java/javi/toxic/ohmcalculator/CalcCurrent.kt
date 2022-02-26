package javi.toxic.ohmcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class CalcCurrent : AppCompatActivity() {

    lateinit var voltage: EditText
    lateinit var resistance: EditText
    lateinit var calculatecurrent: Button
    lateinit var finalCurrent: TextView
    lateinit var cur: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc_current)

        voltage = findViewById(R.id.voltage)
        resistance = findViewById(R.id.resistance)
        calculatecurrent = findViewById(R.id.calculatecurrent)
        finalCurrent = findViewById(R.id.finalCurrent)
        cur = findViewById(R.id.cur)

        calculatecurrent.setOnClickListener{
            var calcVoltage = voltage.text.toString().toDoubleOrNull()
            var calcResistance = resistance.text.toString().toDoubleOrNull()

            if(calcVoltage == null || calcResistance == null){
                Toast.makeText(this, "Enter a Value!", Toast.LENGTH_SHORT).show()
            }
            else{
                if(calcResistance!! <= 0.0){
                    Toast.makeText(this, "Resistance must be a positive value!", Toast.LENGTH_SHORT).show()
                }
                else{
                    var finalCur: Double = calcVoltage!! / calcResistance!!;
                    finalCurrent.text = finalCur.toString();
                }
            }


        }
    }
}