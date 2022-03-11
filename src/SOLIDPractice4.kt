package topicSOLID

import java.util.*

interface Produk {
    interface NamaProduk {
        fun getNama() : String
    }

    interface TanggalKadaluarsaProduk{
        fun getTanggalKadaluarsa() : Date
    }

    interface InformasiProduk{
        fun getInfoProduk()
    }
}

class Susu : Produk.NamaProduk, Produk.TanggalKadaluarsaProduk  {
    override fun getNama(): String {
        return "Nama Produk Susu"
    }

    override fun getTanggalKadaluarsa(): Date {
        return Calendar.getInstance().time
    }
}

class Smartphone : Produk.NamaProduk, Produk.InformasiProduk {
    override fun getNama(): String {
        return "Nama Produk Smartphone"
    }

    override fun getInfoProduk() {
        println("Informasi Smartphone Google Pixel 5")
    }
}

fun main(){
    val runSusu = Susu()
    val hasilReturn1 = runSusu.getNama()
    val hasilReturn2 = runSusu.getTanggalKadaluarsa()
    println(hasilReturn1)
    println(hasilReturn2)

    val runSmartPhone = Smartphone()
    val hasilReturn3 = runSmartPhone.getNama()
    println(hasilReturn3)
    runSmartPhone.getInfoProduk()
}