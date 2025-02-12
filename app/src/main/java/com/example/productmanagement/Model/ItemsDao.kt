package com.example.productmanagement.Model

import androidx.room.*
import java.sql.Time
import java.sql.Timestamp

@Dao
interface ItemsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item: Item)

    @Update
    suspend fun updateItem(item: Item)

    @Query("SELECT * FROM items WHERE items = :itemName LIMIT 1")

    suspend fun getItemByName(itemName: String): Item?

    @Query("SELECT * FROM items")
    suspend fun getAllItems(): List<Item>

}


