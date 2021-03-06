package com.bailram.dice_roller_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    // how to make global var
//    var diceImage: ImageView? = null // cara pertama
    lateinit var diceImage: ImageView // cara kedua

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.dice_image)

        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener {
//            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt = Random.nextInt(6)+1
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }
//        diceImage.setImageDrawable(getDrawable(drawableResource)) // nggae iki yo iso
        diceImage.setImageResource(drawableResource)
    }
}