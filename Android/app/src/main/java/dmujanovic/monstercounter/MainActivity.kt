package dmujanovic.monstercounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var scoreCounter = 0
        var monster = 1
        var progressCounter = 0
        val pointsDisplay = findViewById<TextView>(R.id.textViewMaximumPoints)
        val progressBar = findViewById<ProgressBar>(R.id.progressBarMonster)


        val monsterImage = findViewById<ImageView>(R.id.imageViewMonster)
        monsterImage.setOnClickListener {
            if(scoreCounter<100){
                if (monster == 1) {
                    scoreCounter += 10
                    progressCounter += 10
                    pointsDisplay.text = (100 - scoreCounter.toString().toInt()).toString()
                    progressBar.progress = progressCounter
                }
            }
            if(scoreCounter==100){
                pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(0,0,0,0)
                pointsDisplay.text = "Claim"
            }

        }
    }
}