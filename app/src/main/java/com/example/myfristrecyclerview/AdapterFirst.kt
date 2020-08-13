package com.example.myfristrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.andres_wordlist.view.*

class AdapterFirst (private val andresWordList:MutableList<String>):RecyclerView.Adapter<AdapterFirst.FirstViewHolder>(){

    class FirstViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
         var textView : TextView = itemView.word_list_layout

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.andres_wordlist, parent, false)

        return FirstViewHolder(view)
    }

    override fun getItemCount(): Int {
        return andresWordList.size

    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.textView.text = andresWordList[position]

    }
}