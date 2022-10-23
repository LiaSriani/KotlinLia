package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun profilSaya() {
    val namaDepan:String = "LIA"
    println("namaDepan adalah : $namaDepan")

    val namaBelakang: String = "Asriani"
    println("Nama Belakang Adalah : $namaBelakang")

    val sex: String = "Permpuan"
    println("Jenis Kelamin Saya adalah : $sex")

    val age: Int = 21
    println("Umur Saya adalah : $age")

    val Singgle1: Boolean = false
    val Singgle2: Boolean = true

    println("hubungansaya adalah = $Singgle1 && $Singgle2")
    println("statussaya adalah = $Singgle1")


}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {

    println(groupId)
    println(groupMember)
    println(session)
    return arrayOf(groupId, groupMember, session)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myName ini
 *
 */
fun namaSaya(): String {
    return "Lia Asriani"


}

/**
 * Latihan 4
 * Ubah nilai kembalian untuk fungsi totalMember ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Dian", "Sani", "Reza", "Ardy")
    val countOfGroup = 5

    return mentor.count() + countOfGroup;

}

fun main() {

    profilSaya()

    val namaSaya = namaSaya()
    println("Nama Saya Adalah: $namaSaya")

    val totalMember = totalMember()
    println("Total Member group + Mentor: $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Group 1",listOf("5 member", "Infinite Learning", "Lifestyle & Fashion"), "Siang")

}