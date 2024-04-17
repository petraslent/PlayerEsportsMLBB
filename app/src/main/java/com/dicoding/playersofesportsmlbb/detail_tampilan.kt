package com.dicoding.playersofesportsmlbb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class detail_tampilan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tampilan)

        val hero = intent.getParcelableExtra<Hero>(PARCELABLE_HERO) as Hero

        findViewById<TextView>(R.id.nama_player).text = hero.name
        findViewById<TextView>(R.id.data_deskripsi).text = hero.description
        findViewById<ImageView>(R.id.image_photo).setImageResource(hero.photo)
        findViewById<TextView>(R.id.data_role).text = hero.role
        findViewById<TextView>(R.id.data_team).text = hero.team_esports

    }
    companion object{
        const val PARCELABLE_HERO = "parcelable_hero"
    }
}