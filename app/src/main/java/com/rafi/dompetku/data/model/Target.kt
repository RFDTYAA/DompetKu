package com.rafi.dompetku.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Target(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nama: String,
    val jumlahTarget: Double,
    val jumlahTerkumpul: Double = 0.0,
    val deadline: Long? = null
)
