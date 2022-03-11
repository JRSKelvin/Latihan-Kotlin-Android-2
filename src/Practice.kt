package NamaPackage
import java.util.Date

abstract class Product {
    abstract fun getNama(): String
    abstract fun getInfoProduk()
}

abstract class Kadaluarsa: Product() {
    abstract fun getKadaluarsa(): Date
}

class Susu(var namaProduk: String, var tglKadaluarsa: Date): Kadaluarsa() {
    override fun getNama(): String {
        return namaProduk
    }
    override fun getInfoProduk() {
        println("ini adalah produk susu $namaProduk")
    }
    override fun getKadaluarsa(): Date {
        return tglKadaluarsa
    }
}

class Smartphone(var nameProduk: String) : Product() {
    override fun getNama(): String {
        return nameProduk
    }

    override fun getInfoProduk() {
        println("Produk smartphone: $nameProduk")
    }
}

fun main(){
//    val hp: Product = Smartphone("Samsung S21")
//    println(hp.name)
//    hp.getInfoProduk()
//
//    val ultra: Kadaluarsa = Susu("Ultra Milk", Date())
//    println(ultra.getKadaluarsa())
//    println(ultra.name)
//    ultra.getInfoProduk()
}