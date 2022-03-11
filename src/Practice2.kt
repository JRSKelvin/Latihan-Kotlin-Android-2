interface namaClass {
    fun makan()
    fun minum()
}

class Kelly : namaClass {
    override fun makan() {
        TODO("Not yet implemented")
    }

    override fun minum() {
        TODO("Not yet implemented")
    }
}

fun main(){
    var namac : namaClass
    namac = Kelly()
}
