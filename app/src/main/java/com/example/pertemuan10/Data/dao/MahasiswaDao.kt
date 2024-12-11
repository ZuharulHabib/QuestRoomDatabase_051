package com.example.pertemuan10.Data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.pertemuan10.Data.entity.Mahasiswa

@Dao

interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
}