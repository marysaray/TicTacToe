package com.example.tictactoe

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private val playerX = "X"
    private val playerO = "O"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val row1col1 = findViewById<Button>(R.id.row1col1Button) // Top row on the left corner
        row1col1.setOnClickListener {
            btnClick(row1col1)
        }
        val row1col2 = findViewById<Button>(R.id.row1col2Button) // Top row in the middle
        row1col2.setOnClickListener {
            btnClick(row1col2)
        }
        val row1col3 = findViewById<Button>(R.id.row1col3Button) // Top row on the right corner
        row1col3.setOnClickListener {
            btnClick(row1col3)
        }
        val row2col1 = findViewById<Button>(R.id.row2col1Button) // Middle row on the left side
        row2col1.setOnClickListener {
            btnClick(row2col1)
        }
        val row2col2 = findViewById<Button>(R.id.row2col2Button) // Middle row in the middle
        row2col2.setOnClickListener {
            btnClick(row2col2)
        }
        val row2col3 = findViewById<Button>(R.id.row2col3Button) // Middle row on the right side
        row2col3.setOnClickListener {
            btnClick(row2col3)
        }
        val row3col1 = findViewById<Button>(R.id.row3col1Button) // Bottom row on the left corner
        row3col1.setOnClickListener {
            btnClick(row3col1)
        }
        val row3col2 = findViewById<Button>(R.id.row3col2Button) // Bottom row in the middle
        row3col2.setOnClickListener {
            btnClick(row3col2)
        }
        val row3col3 = findViewById<Button>(R.id.row3col3Button) // Bottom row on the right corner
        row3col3.setOnClickListener {
            btnClick(row3col3)
        }
        val newGame = findViewById<Button>(R.id.newGameButton) // Clear game
        newGame.setOnClickListener {
            val buttons = arrayOf(row1col1, row1col2, row1col3
                                , row2col1, row2col2, row2col3
                                , row3col1, row3col2, row3col3)
            btnNewGame(buttons)
        }
    }

    // Reset Game
    private fun btnNewGame(buttons: Array<Button>) {
        for (button in buttons) {
            button.text = ""
            button.isClickable = true
        }
        val displayText = findViewById<TextView>(R.id.displayTextId)
        "Player X's turn".also { displayText.text = it }
    }

    private fun btnClick(button: Button) {
        val displayText = findViewById<TextView>(R.id.displayTextId)
        if (button.text == "") {
            if (displayText.text == "Player X's turn") {
                button.text = playerX
                "Player O's turn".also { displayText.text = it }
            } else {
                button.text = playerO
                "Player X's turn".also { displayText.text = it }
            }
        }
        checkWinnerOrDraw()
    }

    // Display Winner or Draw
    private fun checkWinnerOrDraw() {
        val displayText = findViewById<TextView>(R.id.displayTextId)
        val row1col1 = findViewById<Button>(R.id.row1col1Button) // Top row on the left corner
        val row1col2 = findViewById<Button>(R.id.row1col2Button) // Top row in the middle
        val row1col3 = findViewById<Button>(R.id.row1col3Button) // Top row on the right corner
        val row2col1 = findViewById<Button>(R.id.row2col1Button) // Middle row on the left side
        val row2col2 = findViewById<Button>(R.id.row2col2Button) // Middle row in the middle
        val row2col3 = findViewById<Button>(R.id.row2col3Button) // Middle row on the right side
        val row3col1 = findViewById<Button>(R.id.row3col1Button) // Bottom row on the left corner
        val row3col2 = findViewById<Button>(R.id.row3col2Button) // Bottom row in the middle
        val row3col3 = findViewById<Button>(R.id.row3col3Button) // Bottom row on the right corner
        val button = arrayOf(row1col1, row1col2, row1col3
                            ,row2col1, row2col2, row2col3
                            ,row3col1, row3col2, row3col3)

        // Row 1 horizontal winner is Player X
        if (row1col1.text == playerX && row1col2.text == playerX && row1col3.text == playerX) {
            "WINNER: X !!!".also { displayText.text = it }
           if (displayText.text == "WINNER: X !!!"){
               for (buttons in button) {
                   buttons.isClickable = false
               }
           }

        }
        // Row 1 horizontal winner is Player O
        if (row1col1.text == playerO && row1col2.text == playerO && row1col3.text == playerO) {
            "Player O won!!!".also { displayText.text = it }
            if (displayText.text == "Player O won!!!") {
                for (buttons in button) {
                    buttons.isClickable = false
                }
            }
        }
        // Row 2 horizontal winner is Player X
        if (row2col1.text == playerX && row2col2.text == playerX && row2col3.text == playerX) {
            "WINNER: X !!!".also { displayText.text = it }
            if (displayText.text == "WINNER: X !!!"){
                for (buttons in button) {
                    buttons.isClickable = false
                }
            }
        }
        // Row 2 horizontal winner is Player O
        if (row2col1.text == playerO && row2col2.text == playerO && row2col3.text == playerO) {
            "Player O won!!!".also { displayText.text = it }
            if (displayText.text == "Player O won!!!") {
                for (buttons in button) {
                    buttons.isClickable = false
                }
            }
        }
        // Row 3 horizontal winner is Player X
        if (row3col1.text == playerX && row3col2.text == playerX && row3col3.text == playerX) {
            "WINNER: X !!!".also { displayText.text = it }
            if (displayText.text == "WINNER: X !!!"){
                for (buttons in button) {
                    buttons.isClickable = false
                }
            }
        }
        // Row 3 horizontal winner is Player O
        if (row3col1.text == playerO && row3col2.text == playerO && row3col3.text == playerO) {
            "Player O won!!!".also { displayText.text = it }
            if (displayText.text == "Player O won!!!") {
                for (buttons in button) {
                    buttons.isClickable = false
                }
            }
        }
        // Diagonal backward-slash winner is Player X
        if (row1col1.text == playerX && row2col2.text == playerX && row3col3.text == playerX) {
            "WINNER: X !!!".also { displayText.text = it }
            if (displayText.text == "WINNER: X !!!"){
                for (buttons in button) {
                    buttons.isClickable = false
                }
            }
        }
        // Diagonal backward-slash winner is Player O
        if (row1col1.text == playerO && row2col2.text == playerO && row3col3.text == playerO) {
            "Player O won!!!".also { displayText.text = it }
            if (displayText.text == "Player O won!!!") {
                for (buttons in button) {
                    buttons.isClickable = false
                }
            }
        }
        // Diagonal forward-slash winner is Player X
        if (row1col3.text == playerX && row2col2.text == playerX && row3col1.text == playerX) {
            "WINNER: X !!!".also { displayText.text = it }
            if (displayText.text == "WINNER: X !!!"){
                for (buttons in button) {
                    buttons.isClickable = false
                }
            }
        }
        // Diagonal forward-slash winner is Player O
        if (row1col3.text == playerO && row2col2.text == playerO && row3col1.text == playerO) {
            "Player O won!!!".also { displayText.text = it }
            if (displayText.text == "Player O won!!!") {
                for (buttons in button) {
                    buttons.isClickable = false
                }
            }
        }
        // Column 1 vertical winner is Player X
        if (row1col1.text == playerX && row2col1.text == playerX && row3col1.text == playerX) {
            "WINNER: X !!!".also { displayText.text = it }
            if (displayText.text == "WINNER: X !!!"){
                for (buttons in button) {
                    buttons.isClickable = false
                }
            }
        }
        // Column 1 vertical winner is Player O
        if (row1col1.text == playerO && row2col1.text == playerO && row3col1.text == playerO) {
            "Player O won!!!".also { displayText.text = it }
            if (displayText.text == "Player O won!!!") {
                for (buttons in button) {
                    buttons.isClickable = false
                }
            }
        }
        // Column 2 vertical winner is Player X
        if (row1col2.text == playerX && row2col2.text == playerX && row3col2.text == playerX) {
            "WINNER: X !!!".also { displayText.text = it }
            if (displayText.text == "WINNER: X !!!"){
                for (buttons in button) {
                    buttons.isClickable = false
                }
            }
        }
        // Column 2 vertical winner is Player O
        if (row1col2.text == playerO && row2col2.text == playerO && row3col2.text == playerO) {
            "Player O won!!!".also { displayText.text = it }
            if (displayText.text == "Player O won!!!") {
                for (buttons in button) {
                    buttons.isClickable = false
                }
            }
        }
        // Column 3 vertical winner is Player X
        if (row1col3.text == playerX && row2col3.text == playerX && row3col3.text == playerX) {
            "WINNER: X !!!".also { displayText.text = it }
            if (displayText.text == "WINNER: X !!!"){
                for (buttons in button) {
                    buttons.isClickable = false
                }
            }
        }
        // Column 3 vertical winner is Player O
        if (row1col3.text == playerO && row2col3.text == playerO && row3col3.text == playerO) {
            "Player O won!!!".also { displayText.text = it }
            if (displayText.text == "Player O won!!!") {
                for (buttons in button) {
                    buttons.isClickable = false
                }
            }
        }
        // All different combination findings for a draw (5 0's and 4 X's) or (5 X's and 4 O's)
        if (row1col1.text == playerX && row1col2.text == playerX && row1col3.text == playerO
            && row2col1.text == playerO && row2col2.text == playerO && row2col3.text == playerX
            && row3col1.text == playerX && row3col2.text == playerO && row3col3.text == playerX
            ||
            row1col1.text == playerO && row1col2.text == playerO && row1col3.text == playerX
            && row2col1.text == playerX && row2col2.text == playerX && row2col3.text == playerO
            && row3col1.text == playerO && row3col2.text == playerX && row3col3.text == playerO
            ||
            row1col1.text == playerO && row1col2.text == playerX && row1col3.text == playerO
            && row2col1.text == playerO && row2col2.text == playerX && row2col3.text == playerX
            && row3col1.text == playerX && row3col2.text == playerO && row3col3.text == playerO
            ||
            row1col1.text == playerX && row1col2.text == playerO && row1col3.text == playerX
            && row2col1.text == playerX && row2col2.text == playerO && row2col3.text == playerO
            && row3col1.text == playerO && row3col2.text == playerX && row3col3.text == playerX
            ||
            row1col1.text == playerX && row1col2.text == playerX && row1col3.text == playerO
            && row2col1.text == playerO && row2col2.text == playerO && row2col3.text == playerX
            && row3col1.text == playerX && row3col2.text == playerX && row3col3.text == playerO
            ||
            row1col1.text == playerO && row1col2.text == playerO && row1col3.text == playerX
            && row2col1.text == playerX && row2col2.text == playerX && row2col3.text == playerO
            && row3col1.text == playerO && row3col2.text == playerO && row3col3.text == playerX
            ||
            row1col1.text == playerO && row1col2.text == playerX && row1col3.text == playerO
            && row2col1.text == playerX && row2col2.text == playerO && row2col3.text == playerX
            && row3col1.text == playerX && row3col2.text == playerO && row3col3.text == playerX
            ||
            row1col1.text == playerX && row1col2.text == playerO && row1col3.text == playerX
            && row2col1.text == playerO && row2col2.text == playerX && row2col3.text == playerO
            && row3col1.text == playerO && row3col2.text == playerX && row3col3.text == playerO
            ||
            row1col1.text == playerO && row1col2.text == playerX && row1col3.text == playerO
            && row2col1.text == playerO && row2col2.text == playerO && row2col3.text == playerX
            && row3col1.text == playerX && row3col2.text == playerO && row3col3.text == playerX
            ||
            row1col1.text == playerX && row1col2.text == playerO && row1col3.text == playerX
            && row2col1.text == playerX && row2col2.text == playerX  && row2col3.text == playerO
            && row3col1.text == playerO && row3col2.text == playerX && row3col3.text == playerO
            ||
            row1col1.text == playerO && row1col2.text == playerX && row1col3.text == playerX
            && row2col1.text == playerX && row2col2.text == playerO  && row2col3.text == playerO
            && row3col1.text == playerX && row3col2.text == playerO && row3col3.text == playerX
            ||
            row1col1.text == playerX && row1col2.text == playerO && row1col3.text == playerO
            && row2col1.text == playerO && row2col2.text == playerX  && row2col3.text == playerX
            && row3col1.text == playerO && row3col2.text == playerX && row3col3.text == playerO
            ||
            row1col1.text == playerO && row1col2.text == playerX && row1col3.text == playerO
            && row2col1.text == playerX && row2col2.text == playerO  && row2col3.text == playerO
            && row3col1.text == playerX && row3col2.text == playerO && row3col3.text == playerX
            ||
            row1col1.text == playerX && row1col2.text == playerO && row1col3.text == playerX
            && row2col1.text == playerO && row2col2.text == playerX  && row2col3.text == playerX
            && row3col1.text == playerO && row3col2.text == playerX && row3col3.text == playerO
            ||
            row1col1.text == playerX && row1col2.text == playerO && row1col3.text == playerX
            && row2col1.text == playerO && row2col2.text == playerO  && row2col3.text == playerX
            && row3col1.text == playerX && row3col2.text == playerX && row3col3.text == playerO
            ||
            row1col1.text == playerO && row1col2.text == playerX && row1col3.text == playerO
            && row2col1.text == playerX && row2col2.text == playerX  && row2col3.text == playerO
            && row3col1.text == playerO && row3col2.text == playerO && row3col3.text == playerX
            ||
            row1col1.text == playerO && row1col2.text == playerX && row1col3.text == playerO
            && row2col1.text == playerX && row2col2.text == playerX  && row2col3.text == playerO
            && row3col1.text == playerX && row3col2.text == playerO && row3col3.text == playerX
            ||
            row1col1.text == playerX && row1col2.text == playerO && row1col3.text == playerX
            && row2col1.text == playerO && row2col2.text == playerO  && row2col3.text == playerX
            && row3col1.text == playerO && row3col2.text == playerX && row3col3.text == playerO
            ||
            row1col1.text == playerX && row1col2.text == playerX && row1col3.text == playerO
            && row2col1.text == playerO && row2col2.text == playerX  && row2col3.text == playerX
            && row3col1.text == playerX && row3col2.text == playerO && row3col3.text == playerO
            ||
            row1col1.text == playerO && row1col2.text == playerO && row1col3.text == playerX
            && row2col1.text == playerX && row2col2.text == playerO  && row2col3.text == playerO
            && row3col1.text == playerO && row3col2.text == playerX && row3col3.text == playerX
            ||
            row1col1.text == playerX && row1col2.text == playerO && row1col3.text == playerO
            && row2col1.text == playerO && row2col2.text == playerX  && row2col3.text == playerX
            && row3col1.text == playerX && row3col2.text == playerX && row3col3.text == playerO
            ||
            row1col1.text == playerO && row1col2.text == playerX && row1col3.text == playerX
            && row2col1.text == playerX && row2col2.text == playerO  && row2col3.text == playerO
            && row3col1.text == playerO && row3col2.text == playerO && row3col3.text == playerX
            ||
            row1col1.text == playerO && row1col2.text == playerX && row1col3.text == playerX
            && row2col1.text == playerX && row2col2.text == playerX  && row2col3.text == playerO
            && row3col1.text == playerO && row3col2.text == playerO && row3col3.text == playerX
            ||
            row1col1.text == playerX && row1col2.text == playerO && row1col3.text == playerO
            && row2col1.text == playerO && row2col2.text == playerO  && row2col3.text == playerX
            && row3col1.text == playerX && row3col2.text == playerX && row3col3.text == playerO
            ||
            row1col1.text == playerX && row1col2.text == playerO && row1col3.text == playerX
            && row2col1.text == playerX && row2col2.text == playerO  && row2col3.text == playerX
            && row3col1.text == playerO && row3col2.text == playerX && row3col3.text == playerO
            ||
            row1col1.text == playerO && row1col2.text == playerX && row1col3.text == playerO
            && row2col1.text == playerO && row2col2.text == playerX  && row2col3.text == playerO
            && row3col1.text == playerX && row3col2.text == playerO && row3col3.text == playerX
            ||
            row1col1.text == playerO && row1col2.text == playerX && row1col3.text == playerX
            && row2col1.text == playerX && row2col2.text == playerO  && row2col3.text == playerO
            && row3col1.text == playerO && row3col2.text == playerX && row3col3.text == playerX
            ||
            row1col1.text == playerX && row1col2.text == playerO && row1col3.text == playerO
            && row2col1.text == playerO && row2col2.text == playerX  && row2col3.text == playerX
            && row3col1.text == playerX && row3col2.text == playerO && row3col3.text == playerO
            ||
            row1col1.text == playerO && row1col2.text == playerO && row1col3.text == playerX
            && row2col1.text == playerX && row2col2.text == playerX  && row2col3.text == playerO
            && row3col1.text == playerO && row3col2.text == playerX && row3col3.text == playerX
            ||
            row1col1.text == playerO && row1col2.text == playerX && row1col3.text == playerO
            && row2col1.text == playerO && row2col2.text == playerX  && row2col3.text == playerX
            && row3col1.text == playerX && row3col2.text == playerO && row3col3.text == playerX
            ||
            row1col1.text == playerX && row1col2.text == playerO && row1col3.text == playerX
            && row2col1.text == playerX && row2col2.text == playerO  && row2col3.text == playerO
            && row3col1.text == playerO && row3col2.text == playerX && row3col3.text == playerO) {
            "DRAW!!!".also { displayText.text = it }
        }
    }
}