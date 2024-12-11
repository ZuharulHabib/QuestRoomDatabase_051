package com.example.pertemuan10.Data.database

import android.content.Context
import android.provider.CalendarContract.Instances
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pertemuan10.Data.dao.MahasiswaDao
import com.example.pertemuan10.Data.entity.Mahasiswa

@Database (entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class  KrsDatabase : RoomDatabase() {

    //Mendefenisikan fungsi untuk mengakses data mahasiswa
    abstract fun  mahasiswaDao(): MahasiswaDao

    companion object {
        @Volatile  //memastikan bahwa nilai variabel instance selalu sama di semua
        private var Instance: KrsDatabase? = null

        fun getDatabase(context: Context): KrsDatabase {
            return  (Instance ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    KrsDatabase::class.java, //Class Database
                    "krs_database" //nama database
                )
                    .build().also { Instance = it }
            })
        }
    }
}