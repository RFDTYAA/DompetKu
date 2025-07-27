package com.rafi.dompetku.ui.dashboard

import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DashboardScreen() {
    // Dummy data
    val totalPemasukan = 700000.0
    val totalPengeluaran = 350000.0
    val saldo = totalPemasukan - totalPengeluaran

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Text(
            text = "Saldo Saat Ini",
            style = MaterialTheme.typography.titleMedium.copy(fontWeight = FontWeight.Bold),
            color = Color.Black
        )

        Text(
            text = "Rp ${saldo.toInt()}",
            fontSize = 32.sp,
            color = Color(0xFF1565C0),
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 8.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(horizontalAlignment = Alignment.Start) {
                Text(text = "Pemasukan", color = Color(0xFF2E7D32))
                Text(text = "Rp ${totalPemasukan.toInt()}", fontSize = 18.sp)
            }

            Column(horizontalAlignment = Alignment.End) {
                Text(text = "Pengeluaran", color = Color(0xFFC62828))
                Text(text = "Rp ${totalPengeluaran.toInt()}", fontSize = 18.sp)
            }
        }
    }
}
