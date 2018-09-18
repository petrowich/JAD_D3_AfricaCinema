package su.petrowich.jad_d3_africacinema

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_gallery.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCinema1 = findViewById<Button>(R.id.buttonCinema1)
        val buttonGallery = findViewById<Button>(R.id.buttonGallery)

        buttonCinema1.setOnClickListener{
            val intent = Intent(applicationContext, CinemaActivity::class.java)
            startActivity(intent)
        }

        buttonGallery.setOnClickListener{
            val intent = Intent(applicationContext, GalleryActivity::class.java)
            startActivity(intent)
        }
    }
}
