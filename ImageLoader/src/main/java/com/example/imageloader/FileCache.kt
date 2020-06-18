package com.example.imageloader

import android.content.Context
import android.os.Environment
import java.io.File

class FileCache(context: Context) {
    private var cacheDir: File? = null
    fun getFile(url: String): File {
        //Identify images by hashcode or encode by URLEncoder.encode.
        val filename = url.hashCode().toString()
        return File(cacheDir, filename)
    }

    fun clear() {
        // list all files inside cache directory
        val files: Array<File> = cacheDir?.listFiles() ?: return
        //delete all cache directory files
        for (f in files) f.delete()
    }

    init {

        //Find the dir at SDCARD to save cached images
        if (Environment.getExternalStorageState() ==
            Environment.MEDIA_MOUNTED
        ) {
            //if SDCARD is mounted (SDCARD is present on device and mounted)
            cacheDir = File(
                Environment.getExternalStorageDirectory(), "LazyList"
            )
        } else {
            // if checking on simulator the create cache dir in your application context
            cacheDir = context.getCacheDir()
        }
        if (!cacheDir?.exists()!!) {
            // create cache dir in your application context
            cacheDir!!.mkdirs()
        }
    }
}