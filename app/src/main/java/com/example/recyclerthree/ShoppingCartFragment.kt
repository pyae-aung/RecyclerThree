package com.example.recyclerthree

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.recyclerthree.adapter.ShoppingCartAdapter
import com.example.recyclerthree.model.ShoppingCart
import kotlinx.android.synthetic.main.fragment_shopping_cart.*
import kotlinx.android.synthetic.main.fragment_shopping_cart.view.*

/**
 * A simple [Fragment] subclass.
 */
class ShoppingCartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_shopping_cart, container, false)

        val shoppingCartlist = ArrayList<ShoppingCart>()
        shoppingCartlist.add(ShoppingCart(R.drawable.dawat_rice, "Dawat Rice", 20.0, 1.0))
        shoppingCartlist.add(ShoppingCart(R.drawable.sugar, "Fine Grain Sugar", 30.0, 3.0))
        shoppingCartlist.add(ShoppingCart(R.drawable.peanut, "Peanuts", 80.0, 5.0))


        val shoppingCartAdapter = ShoppingCartAdapter(shoppingCartlist)

        root.recyclerShoppingCart.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = shoppingCartAdapter
        }

        return root
    }

}
