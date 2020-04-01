//Date: 1/1/2020
//Name: MainActivity.kt
//Info: Simple Kotlin application to pick a random dinner choice for the days you can't pick for yourself.
//repo created

package com.mongerstudios.dinnerdecider

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    //Variable
    //Array list of food choices.
    val foodList = arrayListOf("Jack in the Box", "KFC","Chicken Express", "Pizza Hut", "In'n'Out","Whataburger","Wendys","Panda Express","Sushi")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Set on Click Listener for decide button
        decideButton.setOnClickListener{
            //Random Number and selecting the random food from list, then set the label to the selected food
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodText.text = foodList[randomFood]

        }

        //Add Food in TextField to Array, Notify user it was added and clear the textfield.
        addFoodButton.setOnClickListener {
            println("Add Clicked")
            if(addFoodText.text.isNotBlank()){
                val toadd = addFoodText.text.toString()
                foodList.add(toadd)
                Toast.makeText(applicationContext,"Food Added to List",Toast.LENGTH_SHORT).show()
                addFoodText.text.clear()
            }
        }
    }
}
