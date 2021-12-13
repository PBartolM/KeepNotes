package com.example.keepnotes

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val notas = ArrayList<Nota>()

        notas.add(Nota(R.string.note1))
        notas.add(Nota(R.string.note2))
        notas.add(Nota(R.string.note3))
        notas.add(Nota(R.string.note4))
        notas.add(Nota(R.string.note5))
        notas.add(Nota(R.string.note6))
        notas.add(Nota(R.string.note1))
        notas.add(Nota(R.string.note2))
        notas.add(Nota(R.string.note3))

      
        val recView = findViewById<RecyclerView>(R.id.recyclerView)
        recView.setHasFixedSize(true)

        val adaptador = NotaAdapter(notas)
        recView.adapter = adaptador
        recView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setImageResource(R.drawable.ic_corazon)

        fab.setOnClickListener {
            val rotar = getDrawable(R.drawable.ad_rotation) as AnimatedVectorDrawable
            fab.setImageDrawable(rotar)
            rotar.start()
        }
    }


}

