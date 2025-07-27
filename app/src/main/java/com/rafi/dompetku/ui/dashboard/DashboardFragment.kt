package com.rafi.dompetku.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.rafi.dompetku.R
import com.rafi.dompetku.ui.tambahtransaksi.TambahTransaksiFragment

class DashboardFragment : Fragment() {

    private lateinit var tvJumlahSaldo: TextView
    private lateinit var tvJumlahPemasukan: TextView
    private lateinit var tvJumlahPengeluaran: TextView
    private lateinit var fabTambah: FloatingActionButton
    private lateinit var viewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvJumlahSaldo = view.findViewById(R.id.tvJumlahSaldo)
        tvJumlahPemasukan = view.findViewById(R.id.tvJumlahPemasukan)
        tvJumlahPengeluaran = view.findViewById(R.id.tvJumlahPengeluaran)
        fabTambah = view.findViewById(R.id.fabTambah)

        // Inisialisasi ViewModel
        viewModel = ViewModelProvider(this)[DashboardViewModel::class.java]

        // Observe LiveData dari ViewModel
        viewModel.saldo.observe(viewLifecycleOwner) {
            tvJumlahSaldo.text = "Rp ${it.toInt()}"
        }

        viewModel.pemasukan.observe(viewLifecycleOwner) {
            tvJumlahPemasukan.text = "Rp ${it.toInt()}"
        }

        viewModel.pengeluaran.observe(viewLifecycleOwner) {
            tvJumlahPengeluaran.text = "Rp ${it.toInt()}"
        }

        // Navigasi ke TambahTransaksiFragment
        fabTambah.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.nav_host, TambahTransaksiFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}
