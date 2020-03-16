package com.example.recyclerthree.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerthree.R
import com.example.recyclerthree.model.ShoppingCart
import kotlinx.android.synthetic.main.item_shoppingcart.view.*

class ShoppingCartAdapter(private var shoppingCartList: List<ShoppingCart>): RecyclerView.Adapter<ShoppingCartAdapter.ShoppingCartViewHolder>() {
    inner class ShoppingCartViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(shoppingCart: ShoppingCart) {
            itemView.imgCartItem.setImageResource(shoppingCart.image)
            itemView.txtItemName.text = shoppingCart.name
            itemView.txtItemPrice.text = shoppingCart.price.toString()
            itemView.txtWeight.text = shoppingCart.weight.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingCartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_shoppingcart, parent, false)
        return ShoppingCartViewHolder(view)
    }

    override fun getItemCount(): Int = shoppingCartList.size

    override fun onBindViewHolder(holder: ShoppingCartViewHolder, position: Int) {
        holder.bind(shoppingCartList[position])
    }

}