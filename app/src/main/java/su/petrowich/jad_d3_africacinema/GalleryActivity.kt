package su.petrowich.jad_d3_africacinema

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView

class GalleryActivity : AppCompatActivity() {

    var listInCinema: MutableList<GalleryItem> = mutableListOf()
    var listComingSoon: MutableList<GalleryItem> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        listInCinema.add(GalleryItem(R.drawable.movie01,"Gringo",4.0.toFloat(), true))
        listInCinema.add(GalleryItem(R.drawable.movie02,"Everest",4.0.toFloat(), true))
        listInCinema.add(GalleryItem(R.drawable.movie03,"Mountain Apart",4.0.toFloat(), true))
        listInCinema.add(GalleryItem(R.drawable.movie04,"Rio 2",4.0.toFloat(), true))

        listComingSoon.add(GalleryItem(R.drawable.movie05,"Avengers 2",4.0.toFloat(), false))
        listComingSoon.add(GalleryItem(R.drawable.movie06,"Game of Trons",4.0.toFloat(), false))

        val recyclerViewInCinema = findViewById<RecyclerView>(R.id.recyclerView_InCinema)
        val recyclerViewComingSoon = findViewById<RecyclerView>(R.id.recyclerView_ComingSoon)

        val recyclerViewAdapterInCinema = RecyclerViewAdapter()
        recyclerViewAdapterInCinema.setItems(listInCinema)

        val recyclerViewAdapterComingSoon = RecyclerViewAdapter()
        recyclerViewAdapterComingSoon.setItems(listComingSoon)

        recyclerViewInCinema.layoutManager = GridLayoutManager(this, 2)
        recyclerViewInCinema.adapter = recyclerViewAdapterInCinema


        recyclerViewComingSoon.layoutManager = GridLayoutManager(this, 2)
        recyclerViewComingSoon.adapter = recyclerViewAdapterComingSoon

    }
}