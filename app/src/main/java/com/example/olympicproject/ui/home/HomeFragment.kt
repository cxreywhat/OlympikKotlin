package com.example.olympicproject.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.olympicproject.R
import com.example.olympicproject.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val mBinding get() = _binding!!

    lateinit var adapter : CarsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    fun init()
    {
        adapter = CarsAdapter()
        ofers.adapter = adapter
        ofers.layoutManager = GridLayoutManager(activity, 2)
        var i = 0
        while (i < 20)
        {
            val cars_fin = Cars(R.drawable.ic_user, "Тестовое объявление", "Тестовый текст")
            adapter.addCars(cars_fin)
            i++
        }
    }
}