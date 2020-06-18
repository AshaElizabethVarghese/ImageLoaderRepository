package com.example.greedyimage.view

import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.greedyimage.R
import com.example.kotlindemo.model.Posters
import com.example.kotlindemo.viewmodel.ListViewModel
import kotlinx.android.synthetic.main.fragment_list.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListFragment : Fragment() {
    private lateinit var vieModel: ListViewModel

    private val listAdapter = ListAdapter(arrayListOf())
    private val imageObserver = Observer<Posters> { list ->
        list?.let {
            recyclerView.visibility = View.VISIBLE
            listAdapter.updateList(it.data!!.children!!)
        }
    }

    private val loaderObsever = Observer<Boolean> {loading->
        if(loading){
            progressBar.visibility=View.VISIBLE
            recyclerView.visibility = View.GONE
        }else{
            progressBar.visibility=View.GONE
            recyclerView.visibility = View.VISIBLE
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as MainActivity).title = "Comedy Posters"
        vieModel = ViewModelProviders.of(this).get(ListViewModel::class.java)
        vieModel.comedyList.observe(this, imageObserver)
        vieModel.loading.observe(this,loaderObsever)
        vieModel.refresh()
        recyclerView.apply {
            if (this.getResources()
                    .getConfiguration().orientation === Configuration.ORIENTATION_PORTRAIT
            ) {
                layoutManager = GridLayoutManager(context, 2)
            } else {
                layoutManager = GridLayoutManager(context, 4)
            }
            adapter = listAdapter
        }



    }
}