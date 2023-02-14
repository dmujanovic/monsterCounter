package dmujanovic.monstercounter

import android.graphics.Color
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
                    if(scoreCounter==50){
                        pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(
                            R.drawable.ic_baseline_health_and_safety_medium,
                            0,
                            0,
                            0
                        )
                    }
                    if(scoreCounter==80){
                        pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(
                            R.drawable.ic_baseline_health_and_safety_low,
                            0,
                            0,
                            0
                        )
                    }
                    progressCounter += 10
                    pointsDisplay.text = (100 - scoreCounter.toString().toInt()).toString()
                    progressBar.progress = progressCounter
                }
                if (scoreCounter == 100) {
                    pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0)
                    pointsDisplay.text = "Claim"
                    pointsDisplay.setTextColor(Color.YELLOW)
                    pointsDisplay.setOnClickListener {
                        ivFirstMonster.setImageResource(R.drawable.firstmonster)
                        pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(
                            R.drawable.ic_baseline_health_and_safety_24,
                            0,
                            0,
                            0
                        )
                        pointsDisplay.text = "100"
                        pointsDisplay.setTextColor(Color.BLACK)
                        monsterImage.setImageResource(R.drawable.secondmonster)
                        constraintLayout.setBackgroundResource(R.drawable.background2)
                        monsterName.setText(R.string.second_monster_name)
                        monsterName.setTextColor(Color.parseColor("#FEA271"))
                        progressCounter = 0
                        progressBar.progress = progressCounter
                        scoreCounter = 0
                        monster = 2
                    }
                }
            }

            if (monster == 2) {
                if (scoreCounter < 100) {
                    scoreCounter += 10
                    if(scoreCounter==50){
                        pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(
                            R.drawable.ic_baseline_health_and_safety_medium,
                            0,
                            0,
                            0
                        )
                    }
                    if(scoreCounter==80){
                        pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(
                            R.drawable.ic_baseline_health_and_safety_low,
                            0,
                            0,
                            0
                        )
                    }
                    progressCounter += 10
                    pointsDisplay.text = (100 - scoreCounter.toString().toInt()).toString()
                    progressBar.progress = progressCounter
                }
                if (scoreCounter == 100) {
                    pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0)
                    pointsDisplay.text = "Claim"
                    pointsDisplay.setTextColor(Color.YELLOW)
                    pointsDisplay.setOnClickListener {
                        ivSecondMonster.setImageResource(R.drawable.secondmonster)
                        pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(
                            R.drawable.ic_baseline_health_and_safety_24,
                            0,
                            0,
                            0
                        )
                        pointsDisplay.setTextColor(Color.BLACK)
                        pointsDisplay.text = "100"
                        monsterImage.setImageResource(R.drawable.thirdmonster)
                        constraintLayout.setBackgroundResource(R.drawable.background3)
                        monsterName.setText(R.string.third_monster_name)
                        monsterName.setTextColor(Color.YELLOW)
                        progressCounter = 0
                        progressBar.progress = progressCounter
                        scoreCounter = 0
                        monster = 3
                    }
                }
            }

            if (monster == 3) {
                if (scoreCounter < 100) {
                    scoreCounter += 5
                    if(scoreCounter==50){
                        pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(
                            R.drawable.ic_baseline_health_and_safety_medium,
                            0,
                            0,
                            0
                        )
                    }
                    if(scoreCounter==80){
                        pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(
                            R.drawable.ic_baseline_health_and_safety_low,
                            0,
                            0,
                            0
                        )
                    }
                    progressCounter += 5
                    pointsDisplay.text = (100 - scoreCounter.toString().toInt()).toString()
                    progressBar.progress = progressCounter
                }
                if (scoreCounter == 100) {
                    pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0)
                    pointsDisplay.text = "Claim"
                    pointsDisplay.setTextColor(Color.YELLOW)
                    pointsDisplay.setOnClickListener {
                        ivThirdMonster.setImageResource(R.drawable.thirdmonster)
                        pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(
                            R.drawable.ic_baseline_health_and_safety_24,
                            0,
                            0,
                            0
                        )
                        pointsDisplay.setTextColor(Color.BLACK)
                        pointsDisplay.text = "100"
                        monsterImage.setImageResource(R.drawable.forthmonster)
                        constraintLayout.setBackgroundResource(R.drawable.background4)
                        monsterName.setText(R.string.fourth_monster_name)
                        monsterName.setTextColor(Color.YELLOW)
                        progressCounter = 0
                        progressBar.progress = progressCounter
                        scoreCounter = 0
                        monster = 4
                    }
                }
            }

            if (monster == 4) {
                if (scoreCounter < 100) {
                    scoreCounter += 2
                    if(scoreCounter==50){
                        pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(
                            R.drawable.ic_baseline_health_and_safety_medium,
                            0,
                            0,
                            0
                        )
                    }
                    if(scoreCounter==80){
                        pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(
                            R.drawable.ic_baseline_health_and_safety_low,
                            0,
                            0,
                            0
                        )
                    }
                    progressCounter += 2
                    pointsDisplay.text = (100 - scoreCounter.toString().toInt()).toString()
                    progressBar.progress = progressCounter
                }
                if (scoreCounter == 100) {
                    pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0)
                    pointsDisplay.text = "Claim"
                    pointsDisplay.setTextColor(Color.YELLOW)
                    pointsDisplay.setOnClickListener {
                        ivFourthMonster.setImageResource(R.drawable.forthmonster)
                        pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(
                            R.drawable.ic_baseline_health_and_safety_24,
                            0,
                            0,
                            0
                        )
                        pointsDisplay.setTextColor(Color.BLACK)
                        pointsDisplay.text = "100"
                        monsterImage.setImageResource(R.drawable.fifthmonster)
                        constraintLayout.setBackgroundResource(R.drawable.background5)
                        monsterName.setText(R.string.fifth_monster_name)
                        monsterName.setTextColor(Color.GREEN)
                        progressCounter = 0
                        progressBar.progress = progressCounter
                        scoreCounter = 0
                        monster = 5
                    }
                }
            }

            if (monster == 5) {
                if (scoreCounter < 100) {
                    scoreCounter += 1
                    if(scoreCounter==50){
                        pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(
                            R.drawable.ic_baseline_health_and_safety_medium,
                            0,
                            0,
                            0
                        )
                    }
                    if(scoreCounter==80){
                        pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(
                            R.drawable.ic_baseline_health_and_safety_low,
                            0,
                            0,
                            0
                        )
                    }
                    progressCounter += 1
                    pointsDisplay.text = (100 - scoreCounter.toString().toInt()).toString()
                    progressBar.progress = progressCounter
                }
                if (scoreCounter == 100) {
                    pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, 0, 0)
                    pointsDisplay.text = "Claim"
                    pointsDisplay.setTextColor(Color.YELLOW)
                    pointsDisplay.setOnClickListener {
                        ivFifthMonster.setImageResource(R.drawable.fifthmonster)
                        pointsDisplay.text = "Restart"
                        monsterImage.setImageResource(R.drawable.gameover)
                        monsterName.setText("All monsters collected")
                        monsterName.setTextColor(Color.YELLOW)
                        progressCounter = 0
                        progressBar.progress = progressCounter
                        scoreCounter = 0
                        monster = 6
                    }
                }
            }

            if (monster == 6) {
                pointsDisplay.setOnClickListener {
                    scoreCounter = 0
                    monster = 1
                    progressCounter = 0
                    pointsDisplay.setCompoundDrawablesRelativeWithIntrinsicBounds(
                        R.drawable.ic_baseline_health_and_safety_24,
                        0,
                        0,
                        0
                    )
                    pointsDisplay.setTextColor(Color.BLACK)
                    pointsDisplay.text = "100"
                    monsterImage.setImageResource(R.drawable.firstmonster)
                    monsterName.setText(R.string.first_monster_name)
                    monsterName.setTextColor(Color.RED)
                    constraintLayout.setBackgroundResource(R.drawable.background1)
                    ivFirstMonster.setImageResource(0)
                    ivSecondMonster.setImageResource(0)
                    ivThirdMonster.setImageResource(0)
                    ivFourthMonster.setImageResource(0)
                    ivFifthMonster.setImageResource(0)
                }
            }


        }
    }
}