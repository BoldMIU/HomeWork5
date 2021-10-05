package com.example.problem3
import java.io.Serializable

class Product (
        val title: String,
        val price: Double,
        val color: String,
        val image: Int,
        val itemId: Int,
        val desc: String,
    ): Serializable