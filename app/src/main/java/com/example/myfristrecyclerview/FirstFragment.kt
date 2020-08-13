package com.example.myfristrecyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapterFirst: AdapterFirst
    lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_first, container, false)
            recyclerView = view.findViewById(R.id.recycler_first)
            adapterFirst = AdapterFirst(listaElementos.toMutableList())
            layoutManager = LinearLayoutManager(context)
            recyclerView.layoutManager = layoutManager
            recyclerView.adapter = adapterFirst

        // Inflate the layout for this fragment
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

    }
    private val listaElementos: Array<String> = arrayOf(
        "palabra1",
        "palabra2",
        "palabra3",
        "palabra4",
        "palabra5",
        "palabra6",
        "palabra7",
        "palabra8")
}