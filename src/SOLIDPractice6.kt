package topicSOLID

interface EngineConnect {
    fun start(){}
}

class Car(private val engine:EngineConnect){
    fun start(){
        engine.start()
    }
}

class DieselEngine: EngineConnect{
    override fun start(){
        println("Panggil Engine Diesel")
    }
}

class HybridEngine : EngineConnect{
    override fun start(){
        println("Panggil Engine Hybrid")
    }
}

fun main(){
    val jenisEngineHybrid : EngineConnect = HybridEngine()
    val jenisEngineDiesel : EngineConnect = DieselEngine()
    Car(jenisEngineHybrid).start()
    Car(jenisEngineDiesel).start()
}