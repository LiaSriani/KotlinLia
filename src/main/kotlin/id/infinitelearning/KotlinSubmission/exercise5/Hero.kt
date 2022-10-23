package id.infinitelearning.KotlinSubmission.exercise5

import java.io.StreamTokenizer

class Hero {

    private var nama: String? = null
    private var usia = 0
    private var tinggi = 0

    private var kesehatan = 20

    fun setProfile(nama: String?, age: Int, height: Int) {
        this.nama = nama
        this.usia = age
        this.tinggi = height
    }

    fun profile() {
        println("========= Profile =========")
        println("Nama: $nama")
        println("Usia: $usia")
        println("Tinggi: $tinggi")
        println("Kesehatan: $kesehatan")
        println("===========================")
    }

    private fun checkHealth() {
        if (kesehatan <= 0) {
            println("Anda telah mati $nama")
        }
    }

    fun jalan() {
        checkHealth()
        println("$nama sedang berjalan...")
        kesehatan -= 1
    }


    /**
     * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
     - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
     - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
     - ubah nilai variable health sesuai kegiatan yang dilakukan:
      * lari = -2
      * makan = +2
      * minum = +2
      * lompat = -2
      * duduk = +1

      Contoh fungsi bisa mengikuti fungsi jalan() diatas.

    */
    fun checkHealth(run: Int, eat: Int, drink: Int, jump: Int, sit: Int, Street: Int) {
        val energy = run + eat + drink + jump + sit + Street
        kesehatan = energy
    }


}