package com.example.stickyheader

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.stickyheader.databinding.P2CellFragmentBinding

class P2CellFragment : PnCellFragmentBase() {

    companion object {
        fun newInstance() = P2CellFragment()
    }

    private lateinit var binding: P2CellFragmentBinding

    override fun isStickyHeader() = false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = P2CellFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var c = 0
        binding.btn.setOnClickListener {
            c++
            binding.view.layoutParams?.let {
                it.height = if (c % 2 == 0) 100 else 300
                binding.view.layoutParams = it
            }
        }
    }
}
