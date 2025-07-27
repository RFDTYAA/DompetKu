package com.rafi.dompetku.ui.tambahtransaksi

import android.os.Bundle
import android.view.*
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.rafi.dompetku.R
import com.rafi.dompetku.data.db.AppDatabase
import com.rafi.dompetku.data.model.Transaksi
import kotlinx.coroutines.launch

class TambahTransaksiFragment : Fragment() {

    private lateinit var etNama: EditText
    private lateinit var etJumlah: EditText
    private lateinit var etTanggal: EditText
    private lateinit var rgTipe: RadioGroup
    private lateinit var btnSimpan: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_tambah_transaksi, container, false)

        etNama = view.findViewById(R.id.etNama)
        etJumlah = view.findViewById(R.id.etJumlah)
        etTanggal = view.findViewById(R.id.etTanggal)
        rgTipe = view.findViewById(R.id.rgTipe)
        btnSimpan = view.findViewById(R.id.btnSimpan)

        val db = AppDatabase.getDatabase(requireContext())

        btnSimpan.setOnClickListener {
            val nama = etNama.text.toString()
            val jumlah = etJumlah.text.toString().toDoubleOrNull() ?: 0.0
            val tanggal = etTanggal.text.toString()
            val tipe = if (rgTipe.checkedRadioButtonId == R.id.rbPemasukan) "Pemasukan" else "Pengeluaran"

            if (nama.isEmpty() || tanggal.isEmpty()) {
                Toast.makeText(requireContext(), "Harap lengkapi data", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val transaksi = Transaksi(nama = nama, jumlah = jumlah, tanggal = tanggal, tipe = tipe)

            lifecycleScope.launch {
                db.transaksiDao().insert(transaksi)
                Toast.makeText(requireContext(), "Berhasil disimpan", Toast.LENGTH_SHORT).show()

                // Bersihkan input
                etNama.text.clear()
                etJumlah.text.clear()
                etTanggal.text.clear()
                rgTipe.check(R.id.rbPemasukan)
            }
        }

        return view
    }
}
