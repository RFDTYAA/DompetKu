# 💰 DompetKu

![Kotlin](https://img.shields.io/badge/Kotlin-1.9.0-purple?style=for-the-badge&logo=kotlin)
![Android](https://img.shields.io/badge/Platform-Android-green?style=for-the-badge&logo=android)
![Architecture](https://img.shields.io/badge/Architecture-MVVM-blue?style=for-the-badge)
![Database](https://img.shields.io/badge/Database-Room-lightgrey?style=for-the-badge&logo=sqlite)
![UI](https://img.shields.io/badge/UI-XML_%2B_Compose-orange?style=for-the-badge)

> **Kendalikan Keuanganmu, Wujudkan Impianmu.**
>
> *Aplikasi manajemen keuangan pribadi yang simpel, cepat, dan modern.*

---

## 📱 Tentang Aplikasi

**DompetKu** adalah aplikasi Android *native* yang dirancang untuk membantu pengguna melacak pemasukan dan pengeluaran sehari-hari dengan mudah. Dibangun dengan bahasa **Kotlin** dan menerapkan arsitektur **MVVM (Model-View-ViewModel)**, aplikasi ini menawarkan performa yang stabil, kode yang rapi, dan mudah dikembangkan.

Aplikasi ini menggunakan pendekatan **Hybrid UI**, menggabungkan fleksibilitas XML layout klasik dengan modernitas **Jetpack Compose** untuk pengalaman pengguna yang lebih baik.

## ✨ Fitur Unggulan

* **📊 Dashboard Interaktif:** Pantau saldo terkini, total pemasukan, dan pengeluaran secara *real-time*.
* **💸 Pencatatan Transaksi:** Tambah transaksi (masuk/keluar) dengan cepat dan kategori yang jelas.
* **🎯 Target Finansial:** Tetapkan target tabungan (misal: "Beli Laptop", "Liburan") dan pantau progres pencapaiannya.
* **💾 Offline First:** Data tersimpan aman di perangkatmu menggunakan **Room Database**, aplikasi dapat berjalan penuh tanpa koneksi internet.
* **🎨 Hybrid UI:** Implementasi antarmuka yang menggabungkan View System (XML) dan Jetpack Compose.

---

## 🛠️ Teknologi yang Digunakan (Tech Stack)

Proyek ini dibangun dengan standar pengembangan Android modern:

* **Bahasa:** [Kotlin](https://kotlinlang.org/)
* **Arsitektur:** MVVM (Model-View-ViewModel)
* **UI Framework:**
    * XML Layouts (Legacy views)
    * Jetpack Compose (Modern toolkit)
* **Database:** [Room Database](https://developer.android.com/training/data-storage/room) (SQLite abstraction layer)
* **Concurrency:** Kotlin Coroutines & Flow
* **Build System:** Gradle Kotlin DSL

## 📂 Struktur Proyek

Berikut adalah gambaran umum struktur *package* dalam proyek ini:

```text
com.rafi.dompetku
├── data            # Layer Data (Sumber kebenaran data)
│   ├── db          # Konfigurasi Room Database & DAO
│   └── model       # Data Classes (Entity: Transaksi, Target)
├── ui              # Layer Tampilan (UI & Logic Tampilan)
│   ├── dashboard   # ViewModel & UI untuk halaman Dashboard
│   ├── tambahtransaksi # Halaman input transaksi
│   └── theme       # Konfigurasi Tema (Type, Color, Theme)
└── MainActivity.kt # Entry point aplikasi
```

## 🚀 Cara Menjalankan (Getting Started)

Ingin mencoba atau mengembangkan aplikasi ini di komputermu? Ikuti langkah berikut:

### Prasyarat
* Android Studio (versi terbaru disarankan)
* JDK 17 atau yang lebih baru

### Langkah Instalasi

1.  **Clone repositori ini:**
    ```bash
    git clone [https://github.com/username-kamu/dompetku.git](https://github.com/username-kamu/dompetku.git)
    ```
2.  **Buka di Android Studio:**
    * Jalankan Android Studio.
    * Pilih `Open` dan arahkan ke folder `dompetku` yang baru saja di-clone.
3.  **Sync Gradle:**
    * Biarkan Android Studio mengunduh dependency yang dibutuhkan (proses *Gradle Sync*).
4.  **Run:**
    * Sambungkan HP Android (aktifkan USB Debugging) atau gunakan Android Emulator.
    * Klik tombol ▶️ (Run) di toolbar atas.

---

## 🤝 Kontribusi

Kontribusi sangat terbuka! Jika kamu ingin memperbaiki bug, menambahkan fitur baru, atau meningkatkan dokumentasi:

1.  *Fork* repositori ini.
2.  Buat *branch* fitur baru (`git checkout -b fitur-keren`).
3.  *Commit* perubahanmu (`git commit -m 'Menambahkan fitur keren'`).
4.  *Push* ke branch (`git push origin fitur-keren`).
5.  Buat **Pull Request** di GitHub.

---

## ✍️ Author

Dibuat oleh **Muhammad Rafi Aditya**. </br>
Merupakan sebuah projek Mata Kuliah Rekayasa Perangkat Lunak. **Coming Soon iOS Version**

*stay tuned, tunggu di projek selanjutnya!* </br>
*Jangan lupa kasih ⭐️ (Star) jika proyek ini bermanfaat!*
