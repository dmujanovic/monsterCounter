package dmujanovic.monstercounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import kotlinx.android.synthetic.main.activity_main.*
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
        val constraintLayout = findViewById<ConstraintLayout>(R.id.xmlMainActivity)
        val monsterImage = findViewById<ImageView>(R.id.imageViewMonster)
        val monsterName = findViewById<TextView>(R.id.tvMonsterName)


        monsterImage.setOnClickListener {
            if (monster == 1) {
                if (scoreCounter < 100) {
                    scoreCounter += 10
                    progressCounter += 10
                    pointsDisplay.text = (100 - scoreCounter.toString().toInt()).toString()
                    progressBar.progress = progressCounter
                }
                if (scoreCounter == 100) {
                    pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0)
                    pointsDisplay.text = "Claim"
                    pointsDisplay.setOnClickListener {
                        ivFirstMonster.setImageResource(R.drawable.firstmonster)
                        pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(
                            R.drawable.ic_baseline_health_and_safety_24,
                            0,
                            0,
                            0
                        )
                        pointsDisplay.text = "100"
                        monsterImage.setImageResource(R.drawable.secondmonster)
                        constraintLayout.setBackgroundResource(R.drawable.background2)
                        monsterName.setText(R.string.second_monster_name)
                        progressCounter = 0
                        progressBar.progress = progressCounter
                        scoreCounter = 0
                        monster = 2
                    }
                }
            }


        }
    }
}