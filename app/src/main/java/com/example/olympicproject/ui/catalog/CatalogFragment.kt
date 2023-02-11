package com.example.olympicproject.ui.catalog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.olympicproject.databinding.FragmentCatalogBinding


class CatalogFragment : Fragment() {

    private var _binding: FragmentCatalogBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentCatalogBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }
}