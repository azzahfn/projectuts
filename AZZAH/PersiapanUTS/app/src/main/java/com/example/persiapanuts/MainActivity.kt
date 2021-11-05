package com.example.persiapanuts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()


        //Simpan data

        data?.add(DataModel(R.drawable.posyandu,"Desa Kebasen","Posyandu (PMT)","Posyandu adalah pusat pelayanan keluarga berencana dan Kesehatan yang di Kelola dan di selenggarakan untuk dan oleh masyarakat drngan dukungan teknis dari petugas Kesehatan dalam rangka memenuhi NKKBS (Norma Keluarga Kecil Bahagia Dan Sejahtera."))

        data?.add(DataModel(R.drawable.posbindu,"Desa Kebasen","Posbindu (PTM)", "Posbindu merupakan peran serta masyarakat dalam melakukan kegiatan deteksi dini dan pemantauan factor resiko PTM utama yang di laksanakan secara terpadu dan rutin."))

        data?.add(DataModel(R.drawable.lansia,"Desa Kebasen","Lansia", "Pos pelayanan terpadu untuk masyarakat yang lanjut usia di Desa Kebasen. Pelayanan Kesehatan ini melibatkan peran serta para lansia, keluarga, tokoh masyarakat dan organisasi sosial dalam penyelenggaraannya. Bertujuan untuk membantu memudahkan pelayanan Kesehatan bagi lansia, dengan mudah dan nyaman."))

        data?.add(DataModel(R.drawable.ibuhamil,"Desa Kebasen","Ibu Hamil", "Pos pelayanan terpadu untuk Ibu Hamil merupakan pelayanan untuk memudahkan masyarakat terutama ibu hamil agar memperoleh pelayanan kesehatan ibu dan anak. Tujuannya untuk mencegah peningkatan angka kematian ibu dan bayi saat kehamilan, persalinan, atau setelahnya melalui pemberdayaan masyarakat."))

        data?.add(DataModel(R.drawable.vaksin,"Desa Kebasen","Vaksinasi", "Vaksinasi adalah pemberian vaksin yang khusus diberikan dalam rangka meningkatkan kekebalan seseorang secara aktif terhadap suatu penyakit. Berkaitan dengan pandemi ini, ada empat tujuan vaksinasi COVID-19. Pertama, mengurangi penularan COVID-19. Kedua, menurunkan angka kesakitan dan kematian akibat COVID-19. Ketiga, mencapai herd immunity. Terakhir, melindungi masyarakat agar tetap produktif. Meski telah divaksin, sahabat sehat bukan berarti dapat abai dalam menerapkan protokol kesehatan. Tetap jaga kesehatan dan tetap ikuti protokol kesehatan 3M serta siap saat menerima vaksin nanti ya, sahabat sehat."))

        data?.add(DataModel(R.drawable.penyuluhan,"Desa Kebasen","Penyuluhan & Kegiatan", "penyuluhan Kesehatan yaitu kegiatan yang dilakukan untuk menyebarkan informasi-informasi mengenai Kesehatan ditujukan untuk seluruh masyarakat Desa Kebasen. Sehingga masyarakat sadar, mengerti dan mau melakukan anjuran yang berhubungan dengan Kesehatan."))
        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("harga", item?.lokasi)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}