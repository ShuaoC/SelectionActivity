package edu.temple.selectionactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gameName = resources.getStringArray(R.array.game_name)
        val gameDes = resources.getStringArray(R.array.game_description)

        val games = arrayOf(
            ImageObject(gameName[0], R.drawable.horizon,gameDes[0]),
            ImageObject(gameName[1], R.drawable.godofwar,gameDes[1]),
            ImageObject(gameName[2], R.drawable.blackmyth,gameDes[2]),
            ImageObject(gameName[3], R.drawable.darksouls,gameDes[3]),
            ImageObject(gameName[4], R.drawable.genshin,gameDes[4]),
            ImageObject(gameName[5], R.drawable.ghost,gameDes[5]),
            ImageObject(gameName[6], R.drawable.mafia,gameDes[6]),
            ImageObject(gameName[7], R.drawable.monster,gameDes[7]),
            ImageObject(gameName[8], R.drawable.spiderman,gameDes[8]),
            ImageObject(gameName[9], R.drawable.wolfenstein,gameDes[9]),
            ImageObject(gameName[10], R.drawable.zelda,gameDes[10]),
            ImageObject(gameName[11], R.drawable.readdead,gameDes[11])
        )



        val myRecyclerViewFunc = {ImageObject: ImageObject ->
            val intent = Intent(this, DisplayActivity::class.java)
            intent.putExtra("games",ImageObject)
            startActivity(intent)
        }

        val recyclerView = findViewById<RecyclerView>(R.id.RecyclerView)

        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = ImageAdapter(games, myRecyclerViewFunc)

    }
}