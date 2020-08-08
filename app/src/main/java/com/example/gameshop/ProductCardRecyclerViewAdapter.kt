package com.example.gameshop

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gameshop.network.ImageRequester
import com.example.gameshop.network.ProductEntry

class ProductCardRecyclerViewAdapter(private val productList: List<ProductEntry>) :
    RecyclerView.Adapter<ProductCardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductCardViewHolder {
        val layoutView =
            LayoutInflater.from(parent.context).inflate(R.layout.mer_product_card, parent, false)
        return ProductCardViewHolder(layoutView)
    }

    override fun onBindViewHolder(holder: ProductCardViewHolder, position: Int) {
        if (position < productList.size) {
            val product = productList[position]
            holder.productTitle.text = product.title
            holder.productPrice.text = product.price
//            holder.productAddtoWishList = product.AddtoWishList
//            holder.productpreorder = product.Preorder
            ImageRequester.setImageFromUrl(holder.productImage, product.url)

        }
    }

    override fun getItemCount(): Int {
        return productList.size
    }

}