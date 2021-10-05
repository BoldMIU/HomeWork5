package com.example.problem3

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_item_list.*

class Item_List : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_list)

        val product = intent.getSerializableExtra("product") as Product

        imageView.setImageResource(product.image)
        prod_title.text = product.title
        prod_color.text = "Color: ${product.color}"
        prod_id.text = "Walmart #: ${product.itemId}"
        prod_price.text = "Price: ${product.price}"
        prod_desc.text = "Item Description : ${product.desc}"

    }


}