package edu.temple.selectionactivity

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.temple.selectionactivity.ImageAdapter
import edu.temple.selectionactivity.ImageObject

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val image = findViewById<ImageView>(R.id.image)
        val name = findViewById<TextView>(R.id.title)
        val des = findViewById<TextView>(R.id.desription)
        val button = findViewById<Button>(R.id.button)
        val obj = intent.extras?.get("games") as ImageObject

        image.setBackgroundResource(obj.drawable)
    }
}