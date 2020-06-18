package com.example.greedyimage.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.greedyimage.R
import com.example.imageloader.ImageLoader
import com.example.kotlindemo.model.Child
import com.example.kotlindemo.model.Data_
import kotlinx.android.synthetic.main.item_view.view.*
import java.util.*

class ListAdapter(private val comedyPosters: ArrayList<Child>) :
    RecyclerView.Adapter<ListAdapter.AnimalViewHolder>() {
    lateinit var imageLoader:ImageLoader
    private var context: Context? = null


    class AnimalViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    fun updateList(animalsUpdated: List<Child>) {
        if (animalsUpdated.isNotEmpty()) {
            comedyPosters.clear()
            comedyPosters.addAll(animalsUpdated)
            notifyDataSetChanged()
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        context = parent.getContext();
        val view = inflater.inflate(R.layout.item_view, parent, false)
        return AnimalViewHolder(view)
    }

    override fun getItemCount(): Int = comedyPosters.size

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        var test = comedyPosters[position].data?.thumbnail.toString()
        imageLoader= context?.let { ImageLoader(it) }!!
        imageLoader.DisplayImage(test,holder.view.imageview,R.drawable.posterthatismissing)
        holder.view.layout.setOnClickListener {
            val action = comedyPosters[position].data?.let { it1 ->
                ListFragmentDirections.actiontoDetail(
                    it1
                )
            }
            action?.let { it1 -> Navigation.findNavController(it).navigate(it1) }
        }

    }

}