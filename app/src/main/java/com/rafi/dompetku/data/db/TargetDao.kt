package com.rafi.dompetku.data.db

import androidx.room.*
import com.rafi.dompetku.data.model.Target
import kotlinx.coroutines.flow.Flow

@Dao
interface TargetDao {
    @Insert
    suspend fun insert(target: Target)

    @Update
    suspend fun update(target: Target)

    @Delete
    suspend fun delete(target: Target)

    @Query("SELECT * FROM Target ORDER BY deadline ASC")
    fun getAll(): Flow<List<Target>>
}
