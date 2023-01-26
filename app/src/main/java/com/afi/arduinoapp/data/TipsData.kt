package com.afi.arduinoapp.data;

import com.afi.arduinoapp.R
import com.afi.arduinoapp.model.Tips

object TipsData {
private val articleTitle = arrayOf(
        "Fakta Menarik Biji kopi Arabika",
        "Manfaat Kafein Bagi Kesehatan",
        "Jenis Kopi di Indonesia yang Sukses Mendunia",
        "Apa itu French Press",
        "Negara Penghasil Kopi Terbesar",
        "Kebiasaan Ngopi Orang Aceh"


        )

private val articleContent = arrayOf(
        "Robusta Lebih Pahit dan Punya Efek yang Lebih Kuat\n" +
        "Robusta dan Arabika adalah dua jenis biji kopi yang paling umum dikonsumsi dan diproduksi di seluruh dunia. Keduanya memiliki kualitas yang tinggi dan nikmat buat dikonsumsi sehari-hari.\n" +
        "\n" +
        "Tapi, rupanya terdapat salah satu perbedaan kopi Robusta dan Arabika yang paling penting, yaitu yang terletak pada cita rasanya. Kopi Arabika memiliki rasa yang lebih lembut dan manis, sedangkan Robusta memiliki rasa yang cenderung kuat dan pahit.\n" +
        "\n" +
        "Hal ini bukan berarti Robusta nggak lebih oke. Rasa yang dimiliki Robusta nyatanya disukai banyak banget penikmat kopi yang lebih pahit. Terlebih lagi, rasa pahit itu sebenarnya juga menandakan kadar kafein pada Robusta yang tinggi, yaitu 1.5-3.3%, atau 2 kali lipat dari kandungan kafein Arabika.\n" +
        "\n" +
        "Bentuk yang Berbeda dengan Arabika\n" +
        "Perbedaan kopi Robusta dan Arabika kedua ada pada bentuknya. Bentuk dari biji kopi yang dihasilkannya pun juga berbeda. Biji Arabika berbentuk lonjong dengan belahan di tengah yang bergelombang. Tetapi pada Robusta, bentuk biji lebih bulat dan belahan yang dimiliki juga cenderung lebih lurus.\n" +
        "\n" +
        "Biji Robusta Gampang Tumbuh di Dataran Rendah\n" +
        "Dataran rendah dengan ketinggian 100-800 meter di atas permukaan laut merupakan lingkungan yang tepat buat biji kopi Robusta tumbuh. Nah, kebetulan, Indonesia punya banyak dataran rendah seperti ini. Jadi nggak heran kalau beberapa kebun di Indonesia, seperti di Provinsi Lampung dan Sumatera Selatan, mampu menghasilkan biji Robusta dalam jumlah yang banyak.\n" +
        "\n" +
        "Biji Robusta Mampu Tumbuh di Cuaca Lebih Panas\n" +
        "Kopi robusta mampu beradaptasi dengan baik pada kondisi iklim yang hangat. Sementara kopi Arabica dapat tumbuh baik pada suhu yang lebih rendah antara 18-22°C , dengan temperatur maksimal tidak melebihi 30°C.\n" +
        "\n" +
        "Ini jelas membuat perbedaan kopi Robusta dan Arabika dalam tingkat produksi jadi lebih signifikan di Indonesia. Kopi Arabika lebih bisa tumbuh di daerah yang lebih sejuk dengan suhu 18-22° C, sedangkan daerah Indonesia bersuhu rata-rata di atas angka itu.\n" +
        "\n" +
        "Indonesia Merupakan Salah Satu Produsen Terbesar Kopi Robusta\n" +
        "Seperti yang dilaporkan Kementerian Perdagangan RI, Indonesia saat ini menempati posisi ke-4 negara produsen Robusta setelah Brazil, Vietnam, dan juga Kolombia. Mengingat terdapat jutaan penikmat Robusta di seluruh dunia, posisi ini pun patut diacungi jempol.\n" +
        "\n" +
        "Eits, tapi, bukan cuma itu. Produksi biji Robusta ini ternyata juga memiliki andil besar dalam membuat Indonesia jadi salah satu negara eksportir biji kopi terbesar di dunia, yaitu pada posisi 13. Pada tahun 2018–2019 aja, Indonesia berhasil memproduksi 10,6 juta karung biji kopi (berukuran 60 kg) dan sekitar 9,4 juta dari angka tersebut adalah kopi robusta. Menakjubkan, bukan?",
        "Manfaat Kafein untuk Kesehatan\n" +
        "Berikut adalah beragam manfaat kafein untuk kesehatan yang bisa Anda peroleh:\n" +
        "\n" +
        "1. Meningkatkan fokus dan kewaspadaan\n" +
        "Kafein merupakan stimulan alami yang mampu meningkatkan fokus dan kewaspadaan diri. Berkat manfaat kafein ini pula, Anda bisa merasa lebih berenergi dan bersemangat.\n" +
        "\n" +
        "2. Menurunkan risiko sakit jantung dan diabetes\n" +
        "Kopi adalah sumber kafein yang paling umum dikonsumsi. Dengan mengonsumsi kafein dari kopi, Anda bisa mendapatkan berbagai macam antioksidan, seperti asam klorogenat, yang diketahui dapat menurunkan risiko menderita penyakit jantung dan diabetes.\n" +
        "\n" +
        "Meski begitu, kafein dalam kopi diketahui dapat meningkatkan tekanan darah dan mungkin mendorong jantung bekerja lebih berat. Meminum kopi yang mengandung banyak gula juga akan meningkatkan kadar gula darah. Jadi, konsumsilah kopi beserta gula dan krimernya dalam jumlah yang wajar.\n" +
        "\n" +
        "3. Menurunkan berat badan\n" +
        "Beberapa penelitian menemukan bahwa kafein dapat meningkatkan pembakaran kalori dan lemak. Hal ini pada akhirnya bisa menurunkan berat badan berlebih, kadar lemak tubuh, dan lingkar pinggang, sehingga Anda terhindar dari banyak risiko kesehatan.\n" +
        "\n" +
        "4. Meningkatkan performa olahraga\n" +
        "Mengonsumsi sedikit kafein sekitar 1 jam sebelum olahraga disebut bisa meningkatkan kekuatan otot, stamina, dan daya tahan tubuh seseorang saat berolahraga. Hal ini karena kafein dapat memaksimalkan penggunaan lemak sebagai sumber energi. Selain itu, efek stimulan kafein juga dapat meningkatkan motivasi untuk berolahraga.",
        "Kopi Arabika Kintamani Bali\n" +
        "Beralih ke wilayah tengah Indonesia, kita akan menemukan jenis kopi Arabika lain, yaitu yang berasal dari wilayah Bali. Kopi ini merupakan jenis kopi di Indonesia yang eksotis. Sebab, karakteristik rasa yang dimiliki merupakan perpaduan antara rasa pahit dengan sensasi citrus yang nikmat. Kemudian, setelah diminum, para penikmat kopi akan dimanjakan dengan aftertaste yang manis yang sangat memuaskan.\n" +
        "\n" +
        "Kopi Robusta Lampung\n" +
        "Jenis kopi di Indonesia bukan hanya Arabika saja, melainkan juga Robusta dari wilayah Provinsi Lampung. Sama seperti Robusta lainnya, tanaman kopi Robusta Lampung memiliki karakteristik yang kuat dan sangat mudah dirawat. Namun, lantaran Lampung memiliki kisaran suhu 24–30° Celsius dan dataran yang strategis, jenis kopi ini bisa tumbuh subur dan memproduksi biji kopi dalam jumlah yang banyak.\n" +
        "\n" +
        "Menurut Kementerian Pertanian RI, sebagai produsen kopi Lampung berada di posisi kedua di seluruh Indonesia. Setidaknya ada sekitar 106 juta ton Robusta yang dihasilkan pada tahun 2018 saja!\n" +
        "\n" +
        "Kopi Liberika Riau\n" +
        "Kamu tahu nggak, selain Robusta dan Arabika, ada juga kopi jenis Liberika? Salah satu kopi yang cukup langka di dunia ini rupanya juga diproduksi di Indonesia, tepatnya di wilayah Rangsang, Kepulauan Meranti, Provinsi Riau.\n" +
        "\n" +
        "Kopi ini memiliki aroma seperti coklat. Namun saat meminumnya, kamu akan merasakan profil rasa yang cukup berbeda dari kopi biasanya sebab kopi Liberika Riau memberikan sensasi rasa buah nangka. Cukup menarik, ya!\n" +
        "\n" +
        "Kopi Arabika Mandailing\n" +
        "Jenis kopi di Indonesia yang satu ini merupakan hasil dari Suku Mandailing yang umumnya tersebar di wilayah Pulau Sumatra. Namun begitu, kopi ini bisa dibilang cukup spesial hingga terkenal di kancah dunia dengan nama Sumatra Mandheling coffee.\n" +
        "\n" +
        "Hal ini tidak lain karena karakteristik body yang tegas, sensasi yang smooth, dan juga cita rasa yang kompleks. Saat meminumnya, kamu akan merasakan aroma herbal yang eksotis dan rasa yang bervariasi, seperti coklat dan rempah-rempah.",
        "French Press biasa disebut dengan coffee press. Teknik dalam penyajian kopinya dibuat menggunakan gelas khusus. Jika akan melihat bentuk gelas yang ada alat penekan di bagian tutup gelasnya, maka itu alat yang disebut French Press. Cara menyeduhnya dengan mendiamkan kopi sebentar selama kurang lebih 4 menit, dengan takaran 60 gr untuk 1 liter air. Setelah itu, tekan bagian atasnya perlahan hingga ampas kopi tertekan ke dasar. Setelah itu segera tuangkan kopi ke dalam cangkir selagi masih fresh.\n" +
        "\n",
        "Brazil\n" +
        "\n" +
        "Brazil menempati posisi pertama sebagai penghasil kopi terbesar di dunia. Sejak awal abad ke-18, kopi telah menjadi keunggulan Brazil, bahkan hingga sekarang. Sebanyak 300,000 bibit tanaman kopi ditanam di atas lahan seluas 2,600,000 hektar. Kebanyakan perkebunan kopi terletak di Minas Gerais, Sao Paulo, dan Parana. Tiga negara bagian ini memiliki suhu yang ideal dan bagus untuk memproduksi tanaman kopi. Menurut Dinas Pertanian Luar Negeri, kopi Arabika merupakan jenis kopi yang banyak dihasilkan oleh negara ini, dengan jumlah panen mencapai 3,05 juta ton kopi pada tahun 2017-2018. Jumlah ini yang menjadikan negara Brazil sebagai penghasil kopi terbesar. Brazil menguasai sekitar 30% pasar kopi di dunia.\n" +
        "\n" +
        "Vietnam\n" +
        "\n" +
        "Vietnam termasuk negara baru dalam dunia perdagangan kopi global. Meskipun begitu, Vietnam sudah bisa menjadi negara penghasil kopi terbesar kedua di dunia. Tanaman kopi pertama kali tumbuh di Vietnam ketika bangsa Prancis menjajah pada abad ke-19. Setelah berakhirnya perang pada tahun 1975, produksi kopi di Vietnam kian berkembang. Perkebunan kopi di negara ini hanya terfokus pada kopi jenis robusta saja. Jumlah panen kopi yang diperoleh Vietnam pada tahun 2017-2018 mencapai sekitar 1,76 juta ton.\n" +
        "\n" +
        "Kolombia\n" +
        "\n" +
        "Kolombia memang terkenal sebagai negara yang penuh dengan konflik. Namun, negara ini menduduki peringkat ke-3 sebagai penghasil kopi terbesar di dunia. Tanaman kopi telah dikembangkan di Kolombia sejak tahun 1790. Akan tetapi, negara ini baru dapat mengekspornya pada tahun 1835, dan hingga sekarang kopi menjadi sumber pendapatan yang penting di Kolombia. Pada tahun 2016, jumlah produksi biji kopi di Kolombia mencapai 810,000 ton.\n" +
        "\n" +
        "Indonesia\n" +
        "\n" +
        "Lokasi Indonesia yang strategis dan iklimnya yang tropis menjadikan negara kita ini sebagai tempat yang cocok untuk pertumbuhan tanaman kopi. Jumlah produksi kopi Indonesia pada tahun 2017-2018 mencapai 636,000 ton. Jumlah panen ini diperoleh dari lahan perkebunan seluas 1 juta hektar. Beberapa daerah penghasil kopi terbesar di Indonesia antara lain adalah Sumatera, Jawa, Sulawesi, Nusa Tenggara Timur, serta Papua. Salah satu jenis kopi asal Indonesia yang menjadi favorit dunia adalah kopi luwak. Kopi luwak banyak diburu oleh para petani kopi, karena diyakini sebagai biji kopi terbaik. Tidak heran jika biji kopi luwak ini merupakan biji kopi yang termahal di dunia, mencapai 100 USD atau Rp 1,4 juta per 450 gram.",
        "minum kopi ini telah berkembang turun temurun seiring perkembangan Aceh sebagai salah satu daerah produsen kopi kelas dunia. Sejak era kolonial Belanda hingga sekarang, setidaknya ada dua daerah sentra produksi kopi di Aceh, yaitu Ulee Kareng dan Gayo. Kopi Ulee Kareng yang termasuk jenis kopi Robusta dihasilkan dari Kecamatan Ulee Kareng.\n" +
        "\n" +
        "Sementara, kopi Gayo yang termasuk jenis Kopi Arabika di pasar dunia termasuk kelas kopi premium. Kedua jenis kopi inilah yang mengharumkan nama Aceh sebagai salah satu produsen kopi terbaik di Tanah Air yang merajai 40% pasar dalam negeri.\n" +
        "\n" +
        "Khusus untuk Kopi Ulee Kareng, bisa dikatakan hampir semua kedai kopi di Banda Aceh menyuguhkan kopi produksi daerah ini. Proses pengolahan bubuk kopi di kedai-kedai kopi ini menyimpan keunikan tersendiri.\n" +
        "\n" +
        "Bubuk kopi tidak sekedar diseduh dengan air panas tetapi dimasak, sehingga aroma dan citarasa kopi yang keluar benar-benar kuat. Kopi yang telah dimasak ini kemudian mengalami beberapa kali proses penyaringan menggunakan saringan berbentuk kerucut.\n" +
        "\n" +
        "Di kedai-kedai kopi ini, umumnya kopi ditawarkan dalam tiga variasi penyajian, yaitu kopi hitam, kopi susu dan sanger. Kopi hitam dan kopi susu mungkin sudah sering kita temui di daerah-daerah lain di Indonesia, tapi Sanger adalah racikan yang khas dan orisinil dari Aceh.\n" +
        "\n" +
        "Sepintas melihat tampilannya, kopi ini mirip dengan kopi susu. Tetapi yang khas dari Sanger adalah komposisi susu dan gulanya yang tidak dominan membuat keharuman dan citarasa kopinya lebih terasa. Campuran kopi saring, susu kental dan gula ini kemudian dikocok hingga berbusa.\n" +
        "\n" +
        "Meskipun zaman telah berubah, budaya minum kopi di tengah masyarakat Aceh tetap terjaga. Tradisi ini tetap menurun hingga ke generasi muda mereka saat ini. Yang membuatnya berbeda, saat ini kenyamanan dan fasilitas yang ditawarkan pengelola ikut menentukan ramai tidaknya suatu kedai kopi di Banda Aceh. Kini, tata ruang yang nyaman dan fasilitas internet hotspot (wifi) gratis umumnya menarik lebih banyak kalangan muda untuk betah berlama-lama di kedai kopi.\n" +
        "\n" +
        "Meski demikian, bagi mereka yang benar-benar penikmat kopi tulen, warung yang sederhana namun menyajikan salah satu racikan kopi terbaik di Aceh seperti Kedai Solong di Ulee Kareng, tetap menjadi tujuan nomor satu saat bertandang ke Banda Aceh."

        )

private val articleImage = arrayOf(
        R.drawable.thumnail,
        R.drawable.thumnail,
        R.drawable.thumnail,
        R.drawable.thumnail,
        R.drawable.thumnail,
        R.drawable.thumnail,
        R.drawable.thumnail


        )

        val listTips: ArrayList<Tips>
        get() {
                val listAtcls = arrayListOf<Tips>()
        for (position in articleTitle.indices) {
        val articles = Tips()
        articles.title = articleTitle[position]
        articles.content = articleContent[position]
        articles.image = articleImage[position]
        listAtcls.add(articles)
        }
        return listAtcls
        }
        }
