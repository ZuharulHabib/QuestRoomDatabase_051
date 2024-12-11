package com.example.pertemuan10.repository

import com.example.pertemuan10.Data.entity.Mahasiswa

interface RepositoryMhs {

    suspend fun insertMhs(mahasiswa: Mahasiswa)
}