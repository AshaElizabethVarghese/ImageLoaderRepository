package com.example.imageloader

import java.io.InputStream
import java.io.OutputStream

object Utils {
    fun CopyStream(`is`: InputStream, os: OutputStream) {
        val buffer_size = 1024
        try {
            val bytes = ByteArray(buffer_size)
            while (true) {

                //Read byte from input stream
                val count: Int = `is`.read(bytes, 0, buffer_size)
                if (count == -1) break

                //Write byte from output stream
                os.write(bytes, 0, count)
            }
        } catch (ex: Exception) {
        }
    }
}