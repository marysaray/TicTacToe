package com.example.tictactoe

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var buttons: Array<Button>
    private var currentPlayerX = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
/*        enableEdgeToEdge()*/
        setContentView(R.layout.activity_main )
/*        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }*/
//        val playerX = "X"
//        val playerO = "O"

       // Top row on the left corner
        val row1col1 = findViewById<Button>(R.id.row1col1Button)
//        row1col1.setOnClickListener {
//            row1col1.text = playerX
//        }

        // Top row in the middle
        val row1col2 = findViewById<Button>(R.id.row1col2Button)

/*        row1col2.setOnClickListener {
            row1col2.text = playerO
        }*/

        // Top row on the right corner
       val row1col3 = findViewById<Button>(R.id.row1col3Button)
/*        row1col3.setOnClickListener {
            row1col3.text = playerO
        }*/

       // Middle row on the left side
        val row2col1 = findViewById<Button>(R.id.row2col1Button)
/*        row2col1.setOnClickListener {
            row2col1.text = playerX
        }*/

        // Middle row in the middle
        val row2col2 = findViewById<Button>(R.id.row2col2Button)
/*        row2col2.setOnClickListener {
            row2col2.text = playerX
        }*/

        // Middle row on the right side
        val row2col3 = findViewById<Button>(R.id.row2col3Button)
/*        row2col3.setOnClickListener {
            row2col3.text = playerO
        }*/

        // Bottom row on the left corner
        val row3col1 = findViewById<Button>(R.id.row3col1Button)
/*        row3col1.setOnClickListener {
            row3col1.text = playerO
        }*/

        // Bottom row in the middle
       val row3col2 = findViewById<Button>(R.id.row3col2Button)
/*        row3col2.setOnClickListener {
            row3col2.text = playerO
        }*/

        // Bottom row on the right corner
       val row3col3 = findViewById<Button>(R.id.row3col3Button)
//        row3col3.setOnClickListener {
//            row3col3.text = playerX
//        }
        buttons = arrayOf(
              row1col1, row1col2, row1col3
            , row2col1, row2col2, row2col3
            , row3col1, row3col2, row3col3)
        currentPlayerX = true
        newGame(buttons)

        // Clear Game
        val displayPlayer = findViewById<TextView>(R.id.displayTextId)
        val newGame = findViewById<Button>(R.id.newGameButton)
        newGame.setOnClickListener {
            "Player X's turn".also { displayPlayer.text = it }
            val nineBoxesText = arrayOf(
                  row1col1, row1col2, row1col3
                , row2col1, row2col2, row2col3
                , row3col1, row3col2, row3col3)
            for (box in nineBoxesText) {
                row1col1.text = " "
                row1col2.text = " "
                row1col3.text = " "
                row2col1.text = " "
                row2col2.text = " "
                row2col3.text = " "
                row3col1.text = " "
                row3col2.text = " "
                row3col3.text = " "
            }
        }
    }

    private fun newGame(buttons: Array<Button>) {
        for (button in buttons) {
            button.setText("")
        }
        currentPlayerX = true
    }
    fun btnClick(view: View) {
        val buttonSelected = view as Button
        playGame(buttonSelected)
    }

    fun playGame(buttonSelected: Button) {
        if (buttonSelected.text.equals("")) {
            if (currentPlayerX) {
                buttonSelected.text = "X"
                currentPlayerX = false
            } else {
                buttonSelected.text = "O"
                currentPlayerX = true
            }
        }
    }
    // check winner
}