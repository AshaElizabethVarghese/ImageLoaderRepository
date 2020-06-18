package com.example.greedyimage.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.greedyimage.R
import com.example.imageloader.ImageLoader
import com.example.kotlindemo.model.Data_
import kotlinx.android.synthetic.main.fragment_detail.*
import kotlinx.android.synthetic.main.item_view.*
import kotlinx.android.synthetic.main.item_view.view.*
import kotlinx.android.synthetic.main.item_view.view.imageview

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailFragment : Fragment() {
 var data :Data_?=null
    lateinit var imageLoader: ImageLoader
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments.let {
            data= it?.let { it1 -> DetailFragmentArgs.fromBundle(it1).imageData }
        }
        imageLoader= context?.let { ImageLoader(it) }!!
        data?.thumbnail?.let { imageLoader.DisplayImage(it,imageView,R.drawable.posterthatismissing) }

    }

}