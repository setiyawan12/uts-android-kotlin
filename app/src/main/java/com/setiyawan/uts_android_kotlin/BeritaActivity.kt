package com.setiyawan.uts_android_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.setiyawan.uts_android_kotlin.adapter.ImageAdapter

class BeritaActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)
        val imageList = listOf(
            Image(
                R.drawable.greet1,
                "Hero Virtual\n Run",
                "Untuk meningkatkan kepedulian terhadap akses buku anak, sekaligus memperingati Hari Pahlawan Nasional, Universitas Pertamina (UP) menggelar kegiatan Hero Run UP Virtual Run 2020. Lewat program ini, masyarakat diajak menyumbang buku melalui kegiatan berlari. Roji mengucapkan apresiasi kepada Universitas Pertamina dan para pelari yang memberikan perhatian bagi pendidikan.\n" +
                        "\n" +
                        "Artikel ini telah tayang di Kompas.com dengan judul \"Lewat “Hero Virtual Run”, Pelari Bisa Jadi Pahlawan Pendidikan\", Klik untuk baca: https://edukasi.kompas.com/read/2020/11/10/173647971/lewat-hero-virtual-run-pelari-bisa-jadi-pahlawan-pendidikan.\n"
            ),
            Image(
                R.drawable.greet1,
                "Ruang Guru",
                    "Pendiri dan Direktur Utama Ruangguru, Belva Devara mengatakan, lewat situs web ruangpeduli.org, Ruangguru mengajak mitra individu dan lembaga untuk ikut serta berkontribusi menyelesaikan berbagai tantangan pendidikan. Para mitra, kata Belva, dapat menyalurkan bantuan akses, dukungan fasilitas belajar, serta konten pendidikan yang berkualitas. Masyarakat juga dapat mengajukan penggalangan bantuan pendidikan bagi pihak yang berhak menerimanya. Keabsahan informasi pihak yang menggalang donasi dan penerima bantuan pendidikan menjadi prioritas. Ruangpeduli memiliki manajemen platform yang tersentralisasi, terkurasi, dan terverifikasi, sehingga memberikan kenyamanan dan keamanan bagi setiap donatur yang peduli.\n" +
                            "\n" +
                            "Artikel ini telah tayang di Kompas.com dengan judul \"Ruangguru Bantu Ketimpangan Pendidikan lewat RuangPeduli\", Klik untuk baca: https://www.kompas.com/edu/read/2020/11/10/164013371/ruangguru-bantu-ketimpangan-pendidikan-lewat-ruangpeduli.\n"
            ),
            Image(
                R.drawable.greet1,
                "Program Guru \n Penggerak",
                    "Program Guru Penggerak yang diluncurkan Kemendikbud akan memasuki tahap kedua, mendapatkan tanggapan positif dari berbagai komunitas dan organisasi pendidikan. Salah satunya datang dari Komunitas Guru Nusantara melalui ketua umumnya, Usman Djabbar Mappison, berharap Program Guru Penggerak (PGP) bisa menjadi salah satu strategi pemerintah melakukan transformasi pendidikan. Ia juga berharap materi pelatihan dalam program ini diambil dari berbagai praktik sukses yang telah berhasil diterapkan berbagai lembaga pendidikan. “Modul-modul guru penggerak itu bukan sesuatu yang tidak bisa dilakukan. Ini merupakan suatu yang sudah terbukti, sesuatu yang sudah jelas,” ungkap Usman melalui rilis resmi, Senin (2/11/2020). Menurutnya, PGP harus menjadi kompilasi dari berbagai keberhasilan sekolah yang telah menerapkan model pendidikan masa kini. Ia pun berharap PGP dapat terus berlanjut dan menjangkau seluruh guru di Indonesia\n" +
                            "\n" +
                            "Artikel ini telah tayang di Kompas.com dengan judul \"Program Guru Penggerak Diharapkan Perkuat Praktik Baik Pendidikan\", Klik untuk baca: https://edukasi.kompas.com/read/2020/11/03/121740871/program-guru-penggerak-diharapkan-perkuat-praktik-baik-pendidikan.\n"
            ),
            Image(
                R.drawable.greet1,
                "Bom Bunuh Diri",
                    " Bom bunuh diri di sebuah pusat pendidikan di ibu kota Afghanistan, Kabul, menewaskan 24 orang dan melukai puluhan lainnya, termasuk pelajar remaja, pada Sabtu (24/10/2020), kata para pejabat. Seorang juru bicara Kementerian Dalam Negeri, Tariq Arian, mengatakan penjaga keamanan telah mengidentifikasi seorang tersangka yang menyalakan bahan peledak di jalan di luar pusat Kawsar-e Danish. Melansir Reuters pada Minggu (25/10/2020), sebagian besar korban adalah pelajar berusia antara 15 dan 26 tahun, menurut kementerian kesehatan. Kementerian kesehatan juga menyebutkan bahwa ada 57 orang lainnya yang terluka dalam serangan itu.\n" +
                            "\n" +
                            "Artikel ini telah tayang di Kompas.com dengan judul \"Bom Bunuh Diri Serang Pusat Pendidikan di Afghanistan, Tewaskan 24 Orang \", Klik untuk baca: https://www.kompas.com/global/read/2020/10/25/171752270/bom-bunuh-diri-serang-pusat-pendidikan-di-afghanistan-tewaskan-24-orang.\n"
            ),
            Image(
                  R.drawable.greet1,
                "Siswi SMA Bunuh \n diri",
                    "Komisioner Komisi Perlindungan Anak Indonesia ( KPAI) Retno Listyarti mendorong Dinas Pendidikan Sulawesi Selatan mengevaluasi pelaksanaan pembelajaran jarak jauh ( PJJ). Hal ini dikatakan terkait adanya siswi SMA di Kabupaten Gowa, Sulawesi Selatan, berinisial MI yang bunuh diri diduga karena depresi dengan tugas sekolah daring. \"KPAI mendorong Dinas Pendidikan Sulawesi Selatan melakukan evaluasi menyeluruh dari pelaksanaan PJJ secara daring dan luring,\" kata Retno melalui keterangan tertulis, Kamis (23/10/2020). Menurut Retno, evaluasi menyeluruh itu bisa dilakukan dengan memeriksa kepala sekolah, guru yang mengajar dan guru bimbingan konseling.\n" +
                            "\n" +
                            "Artikel ini telah tayang di Kompas.com dengan judul \"Siswi SMA Bunuh Diri, KPAI Dorong Disdik Sulsel Evaluasi PJJ\", Klik untuk baca: https://nasional.kompas.com/read/2020/10/23/12413381/siswi-sma-bunuh-diri-kpai-dorong-disdik-sulsel-evaluasi-pjj.\n"
            ),
            Image(
                R.drawable.greet1,
                "8 Siswa Suku Sawai",
                    "Delapan siswa dari Suku Sakai di Kandis, Riau, mendapatkan beasiswa berupa bantuan Sumbangan Pembinaan Pendidikan (SPP) 2020 dari Sinar Mas Agribusiness and Food untuk melanjutkan pendidikannya ke jenjang perguruan tinggi. Sinar Mas Agribusiness and Food memberikan beasiswa ini karena mereka percaya bahwa pendidikan sangat penting untuk generasi muda, terutama yang tinggal di perdesaan. Lewat beasiswa ini, CEO Perkebunan Sinar Mas Agribusiness and Food Wilayah Riau Franciscus Costan berharap agar siswa dari Suku Sakai dapat meraih mimpi dan memiliki kehidupan yang lebih baik di masa depan.\n" +
                            "\n" +
                            "Artikel ini telah tayang di Kompas.com dengan judul \"8 Siswa Suku Sakai Kandis Raih Impian lewat Beasiswa Sinar Mas\", Klik untuk baca: https://edukasi.kompas.com/read/2020/10/14/211241171/8-siswa-suku-sakai-kandis-raih-impian-lewat-beasiswa-sinar-mas.\n"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}