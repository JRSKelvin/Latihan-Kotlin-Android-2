package topicSOLID

//Catatan Kode:
interface HotelData {
    fun getPrice(): Int
}

class Mariott : HotelData {
    private val basePrice = 2000
    private val tax = 500
    override fun getPrice(): Int {
        return basePrice + tax
    }
}

class Merdeka : HotelData {
    private val basePrice = 3000
    override fun getPrice(): Int {
        return basePrice
    }
}

class Amaris : HotelData {
    private val basePrice = 4000
    private val tax = 1000
    private val biayaKebersihan = 500
    private val hargaAkhir = basePrice + tax + biayaKebersihan
    override fun getPrice(): Int {
        return hargaAkhir
    }
}

class HotelFactory {
    fun calculatePrices(hotels: List<HotelData>): Int {
        var totalPrice = 0
        hotels.forEach {
            totalPrice += it.getPrice()
        }
        return totalPrice
    }
}

fun main() {
    print(HotelFactory().calculatePrices(listOf(Mariott(), Merdeka(), Amaris())))
}
