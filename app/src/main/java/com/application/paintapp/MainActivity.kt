package com.application.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.application.paintapp.Paintview.Companion.colorList
import com.application.paintapp.Paintview.Companion.currentBrush
import com.application.paintapp.Paintview.Companion.pathList

class MainActivity : AppCompatActivity() {
    companion object{
        var path = Path()
        var paintbrush = Paint()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val red = findViewById<ImageButton>(R.id.redcolor)
        val black = findViewById<ImageButton>(R.id.blackcolor)
        val blue = findViewById<ImageButton>(R.id.bluecolor)
        val eraser = findViewById<ImageButton>(R.id.eraser)

        red.setOnClickListener {
            paintbrush.color = Color.RED
            currentcolor(paintbrush.color)
        }
        black.setOnClickListener {
            paintbrush.color = Color.WHITE
            currentcolor(paintbrush.color)
        }
        blue.setOnClickListener {
            paintbrush.color = Color.BLUE
            currentcolor(paintbrush.color)
        }
        eraser.setOnClickListener {
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }
    private fun currentcolor(color: Int){
        currentBrush = color
        path = Path()
    }
}