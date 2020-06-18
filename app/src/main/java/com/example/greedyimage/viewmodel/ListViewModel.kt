package com.example.kotlindemo.viewmodel

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.greedyimage.model.ApiService
import com.example.kotlindemo.model.Data_
import com.example.kotlindemo.model.Posters
import com.google.gson.Gson
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import java.util.*
import javax.inject.Inject
import kotlin.collections.ArrayList


class ListViewModel(application: Application) : AndroidViewModel(application) {
    val comedyList by lazy {
        MutableLiveData<Posters>()
    }
    val loading by lazy {
        MutableLiveData<Boolean>()
    }
   private val api =ApiService()
    private val disposable = CompositeDisposable()

    fun refresh() {
        loading.value=true
        disposable.add(
            api.getThumpnail()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<Posters>(){
                    override fun onSuccess(t: Posters) {
                        comedyList.value = t
                        loading.value=false
                    }

                    override fun onError(e: Throwable) {
                    loading.value=false
                    }

                })
        )

    }


    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}