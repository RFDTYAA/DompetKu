package com.rafi.dompetku.ui.dashboard

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.rafi.dompetku.data.db.AppDatabase
import com.rafi.dompetku.data.model.Transaksi
import kotlinx.coroutines.launch

class DashboardViewModel(application: Application) : AndroidViewModel(application) {

    private val _saldo = MutableLiveData<Double>()
    val saldo: LiveData<Double> get() = _saldo

    private val _pemasukan = MutableLiveData<Double>()
    val pemasukan: LiveData<Double> get() = _pemasukan

    private val _pengeluaran = MutableLiveData<Double>()
    val pengeluaran: LiveData<Double> get() = _pengeluaran

    init {
        loadData()
    }

    private fun loadData() {
        val dao = AppDatabase.getDatabase(getApplication()).transaksiDao()
        viewModelScope.launch {
            val transaksiList = dao.getAll()
            val totalMasuk = transaksiList.filter { it.tipe == "Pemasukan" }.sumOf { it.jumlah }
            val totalKeluar = transaksiList.filter { it.tipe == "Pengeluaran" }.sumOf { it.jumlah }

            _saldo.postValue(totalMasuk - totalKeluar)
            _pemasukan.postValue(totalMasuk)
            _pengeluaran.postValue(totalKeluar)
        }
    }
}
