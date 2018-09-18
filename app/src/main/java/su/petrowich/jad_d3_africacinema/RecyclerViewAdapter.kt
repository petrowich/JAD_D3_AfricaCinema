package su.petrowich.jad_d3_africacinema

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import android.widget.RatingBar
import android.widget.TextView
import com.makeramen.roundedimageview.RoundedImageView

class RecyclerViewAdapter : RecyclerView.Adapter<RecyclerViewHolder>() {

    private var items: MutableList<GalleryItem> = mutableListOf()

    fun setItems(newItems: List<GalleryItem>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_gallery_item, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {

        val galleryItem = items[position]

        holder.roundedImageViewGalleryItemPoster.setImageResource(galleryItem.galleryItemPoster)
        holder.textViewGalleryItemName.text = galleryItem.galleryItemName
        holder.ratingBarGalleryItemRatingBar.rating = galleryItem.galleryItemRating

        //для анонсируемых фильмов скрываем рейтинг бар и капсы в названиях
        if(!galleryItem.Active){
            holder.ratingBarGalleryItemRatingBar.visibility = View.GONE
            holder.textViewGalleryItemName.setAllCaps(false)
        }
    }
}

class RecyclerViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val roundedImageViewGalleryItemPoster: RoundedImageView = itemView.findViewById(R.id.roundedImageView_GalleryItemPoster)
    val textViewGalleryItemName: TextView = itemView.findViewById(R.id.textView_GalleryItemName)
    val ratingBarGalleryItemRatingBar: RatingBar = itemView.findViewById(R.id.ratingBar_GalleryItemRatingBar)
}