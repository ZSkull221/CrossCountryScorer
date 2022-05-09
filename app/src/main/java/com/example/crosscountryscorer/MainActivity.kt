package com.example.crosscountryscorer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var m_place = 1
    private var buttonCount = 1
    private var color = 0xFFFFFFFF
    private var colorText1 = ""
    private var score1 = 0
    private var score2 = 0
    private var score3 = 0
    private var score4 = 0
    private var score5 = 0
    private var score6 = 0
    private var score7 = 0
    private var score8 = 0
    private var score9 = 0
    private var score10 = 0

    private var count1 = 0
    private var count2 = 0
    private var count3 = 0
    private var count4 = 0
    private var count5 = 0
    private var count6 = 0
    private var count7 = 0
    private var count8 = 0
    private var count9 = 0
    private var count10 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countText1: TextView = findViewById(R.id.count1)
        val scoreText1: TextView = findViewById(R.id.score1)
        val place1: TextView = findViewById(R.id.places1)
        val button1: Button = findViewById(R.id.Button1)
        button1.setOnClickListener {
            if (count1 < 7) {
                if (count1++ < 5) {
                    score1 += m_place
                    scoreText1.text = "Score: $score1"
                }
                countText1.text = "Count: $count1"
                var temp = place1.text.toString()
                temp = "$temp$m_place, "
                place1.text = temp
                m_place++
            }
        }
        val countText2: TextView = findViewById(R.id.count2)
        val scoreText2: TextView = findViewById(R.id.score2)
        val place2: TextView = findViewById(R.id.places2)
        val button2: Button = findViewById(R.id.Button2)
        button2.setOnClickListener {
            if (count2 < 7) {
                if (count2++ < 5) {
                    score2 += m_place
                    scoreText2.text = "Score: $score2"
                }
                countText2.text = "Count: $count2"
                var temp = place2.text.toString()
                temp = "$temp$m_place, "
                place2.text = temp
                m_place++
            }
        }
        val countText3: TextView = findViewById(R.id.count3)
        val scoreText3: TextView = findViewById(R.id.score3)
        val place3: TextView = findViewById(R.id.places3)
        val button3: Button = findViewById(R.id.Button3)
        button3.setOnClickListener {
            if (count3 < 7) {
                if (count3++ < 5) {
                    score3 += m_place
                    scoreText3.text = "Score: $score3"
                }
                countText3.text = "Count: $count3"
                var temp = place3.text.toString()
                temp = "$temp$m_place, "
                place3.text = temp
                m_place++
            }
        }
        val countText4: TextView = findViewById(R.id.count4)
        val scoreText4: TextView = findViewById(R.id.score4)
        val place4: TextView = findViewById(R.id.places4)
        val button4: Button = findViewById(R.id.Button4)
        button4.setOnClickListener {
            if (count4 < 7) {
                if (count4++ < 5) {
                    score4 += m_place
                    scoreText4.text = "Score: $score4"
                }
                countText4.text = "Count: $count4"
                var temp = place4.text.toString()
                temp = "$temp$m_place, "
                place4.text = temp
                m_place++
            }
        }
        val countText5: TextView = findViewById(R.id.count5)
        val scoreText5: TextView = findViewById(R.id.score5)
        val place5: TextView = findViewById(R.id.places5)
        val button5: Button = findViewById(R.id.Button5)
        button5.setOnClickListener {
            if (count5 < 7) {
                if (count5++ < 5) {
                    score5 += m_place
                    scoreText5.text = "Score: $score5"
                }
                countText5.text = "Count: $count5"
                var temp = place5.text.toString()
                temp = "$temp$m_place, "
                place5.text = temp
                m_place++
            }
        }
        val countText6: TextView = findViewById(R.id.count6)
        val scoreText6: TextView = findViewById(R.id.score6)
        val place6: TextView = findViewById(R.id.places6)
        val button6: Button = findViewById(R.id.Button6)
        button6.setOnClickListener {
            if (count6 < 7) {
                if (count6++ < 5) {
                    score6 += m_place
                    scoreText6.text = "Score: $score6"
                }
                countText6.text = "Count: $count6"
                var temp = place6.text.toString()
                temp = "$temp$m_place, "
                place6.text = temp
                m_place++
            }
        }
        val countText7: TextView = findViewById(R.id.count7)
        val scoreText7: TextView = findViewById(R.id.score7)
        val place7: TextView = findViewById(R.id.places7)
        val button7: Button = findViewById(R.id.Button7)
        button7.setOnClickListener {
            if (count7 < 7) {
                if (count7++ < 5) {
                    score7 += m_place
                    scoreText7.text = "Score: $score7"
                }
                countText7.text = "Count: $count7"
                var temp = place7.text.toString()
                temp = "$temp$m_place, "
                place7.text = temp
                m_place++
            }
        }
        val countText8: TextView = findViewById(R.id.count8)
        val scoreText8: TextView = findViewById(R.id.score8)
        val place8: TextView = findViewById(R.id.places8)
        val button8: Button = findViewById(R.id.Button8)
        button8.setOnClickListener {
            if (count8 < 7) {
                if (count8++ < 5) {
                    score8 += m_place
                    scoreText8.text = "Score: $score8"
                }
                countText8.text = "Count: $count8"
                var temp = place8.text.toString()
                temp = "$temp$m_place, "
                place8.text = temp
                m_place++
            }
        }
        val countText9: TextView = findViewById(R.id.count9)
        val scoreText9: TextView = findViewById(R.id.score9)
        val place9: TextView = findViewById(R.id.places9)
        val button9: Button = findViewById(R.id.Button9)
        button9.setOnClickListener {
            if (count9 < 7) {
                if (count9++ < 5) {
                    score9 += m_place
                    scoreText9.text = "Score: $score9"
                }
                countText9.text = "Count: $count9"
                var temp = place9.text.toString()
                temp = "$temp$m_place, "
                place9.text = temp
                m_place++
            }
        }
        val countText10: TextView = findViewById(R.id.count10)
        val scoreText10: TextView = findViewById(R.id.score10)
        val place10: TextView = findViewById(R.id.places10)
        val button10: Button = findViewById(R.id.Button10)
        button10.setOnClickListener {
            if (count10 < 7) {
                if (count10++ < 5) {
                    score10 += m_place
                    scoreText10.text = "Score: $score10"
                }
                countText10.text = "Count: $count10"
                var temp = place10.text.toString()
                temp = "$temp$m_place, "
                place10.text = temp
                m_place++
            }
        }
        val resetButton: Button = findViewById(R.id.ResetButton)
        resetButton.setOnClickListener {
            count1 = 0
            count2 = 0
            count3 = 0
            count4 = 0
            count5 = 0
            count6 = 0
            count7 = 0
            count8 = 0
            count9 = 0
            count10 = 0
            score1 = 0
            score2 = 0
            score3 = 0
            score4 = 0
            score5 = 0
            score6 = 0
            score7 = 0
            score8 = 0
            score9 = 0
            score10 = 0
            m_place = 1
            countText1.text = "Count: 0"
            countText2.text = "Count: 0"
            countText3.text = "Count: 0"
            countText4.text = "Count: 0"
            countText5.text = "Count: 0"
            countText6.text = "Count: 0"
            countText7.text = "Count: 0"
            countText8.text = "Count: 0"
            countText9.text = "Count: 0"
            countText10.text = "Count: 0"
            scoreText1.text = "Score: 0"
            scoreText2.text = "Score: 0"
            scoreText3.text = "Score: 0"
            scoreText4.text = "Score: 0"
            scoreText5.text = "Score: 0"
            scoreText6.text = "Score: 0"
            scoreText7.text = "Score: 0"
            scoreText8.text = "Score: 0"
            scoreText9.text = "Score: 0"
            scoreText10.text = "Score: 0"
            place1.text = ""
            place2.text = ""
            place3.text = ""
            place4.text = ""
            place5.text = ""
            place6.text = ""
            place7.text = ""
            place8.text = ""
            place9.text = ""
            place10.text = ""
        }
        val assignButton: Button = findViewById(R.id.AssignButton)
        val nameText: TextView = findViewById(R.id.TeamNameTextBox)
        val colorText: TextView = findViewById(R.id.TeamColorTextBox)
        assignButton.setOnClickListener {
            colorText1 = colorText.text.toString().uppercase()
            when (colorText1) {
                "RED" -> color = 0xFFFF0000
                "ORANGE" -> color = 0xFFFFA500
                "YELLOW" -> color = 0xFFFFFF00
                "LIGHT GREEN" -> color = 0xFF00FF00
                "GREEN" -> color = 0xFF008000
                "LIGHT BLUE" -> color = 0xFFADD8E6
                "BLUE" -> color = 0xFF0000FF
                "PURPLE" -> color = 0xFF6A0DAD
                "PINK" -> color = 0xFFFFC0CB
                "BROWN" -> color = 0xFF654321
                "WHITE" -> color = 0xFFFFFFFF
                "GRAY" -> color = 0xFF808080
                "BLACK" -> color = 0xFF000000
                else -> color = 0xFFFFFFFF
            }

            if (buttonCount == 1)
            {
                button1.text = nameText.text
                nameText.text = ""
                button1.setBackgroundColor(color.toInt())
                colorText.text = ""
            }
            if (buttonCount == 2)
            {
                button2.text = nameText.text
                nameText.text = ""
                button2.setBackgroundColor(color.toInt())
                colorText.text = ""
            }
            if (buttonCount == 3)
            {
                button3.text = nameText.text
                nameText.text = ""
                button3.setBackgroundColor(color.toInt())
                colorText.text = ""
            }
            if (buttonCount == 4)
            {
                button4.text = nameText.text
                nameText.text = ""
                button4.setBackgroundColor(color.toInt())
                colorText.text = ""
            }
            if (buttonCount == 5)
            {
                button5.text = nameText.text
                nameText.text = ""
                button5.setBackgroundColor(color.toInt())
                colorText.text = ""
            }
            if (buttonCount == 6)
            {
                button6.text = nameText.text
                nameText.text = ""
                button6.setBackgroundColor(color.toInt())
                colorText.text = ""
            }
            if (buttonCount == 7)
            {
                button7.text = nameText.text
                nameText.text = ""
                button7.setBackgroundColor(color.toInt())
                colorText.text = ""
            }
            if (buttonCount == 8)
            {
                button8.text = nameText.text
                nameText.text = ""
                button8.setBackgroundColor(color.toInt())
                colorText.text = ""
            }
            if (buttonCount == 9)
            {
                button9.text = nameText.text
                nameText.text = ""
                button9.setBackgroundColor(color.toInt())
                colorText.text = ""
            }
            if (buttonCount == 10)
            {
                button10.text = nameText.text
                nameText.text = ""
                button10.setBackgroundColor(color.toInt())
                colorText.text = ""
            }

            buttonCount++
        }
    }
}