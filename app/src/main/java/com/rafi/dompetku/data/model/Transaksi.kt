package com.rafi.dompetku.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "transaksi")
data class Transaksi(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nama: String,
    val jumlah: Double,
    val tanggal: String,
    val tipe: String // "Pemasukan" atau "Pengeluaran"
)
