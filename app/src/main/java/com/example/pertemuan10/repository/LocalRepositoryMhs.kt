package com.example.pertemuan10.repository

import com.example.pertemuan10.Data.dao.MahasiswaDao
import com.example.pertemuan10.Data.entity.Mahasiswa

class LocalRepositoryMhs(
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs {

    override suspend fun  insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }
}
