package com.rafi.dompetku.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.rafi.dompetku.data.model.Transaksi

@Dao
interface TransaksiDao {
    @Insert
    suspend fun insert(transaksi: Transaksi)

    @Query("SELECT * FROM transaksi ORDER BY id DESC")
    suspend fun getAll(): List<Transaksi>
}
