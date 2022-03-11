interface VehicleInterface {
    fun drive()
    fun stop()
    fun refuel()
}

interface VehicleDoorInterface {
    fun openDoor()
}

class Motorcycle : VehicleInterface {
    override fun drive() {
        println("Motor Dikendarai")
    }

    override fun stop() {
        println("Motor Berhenti")
    }

    override fun refuel() {
        println("Motor Mengisi Ulang Bensin")
    }
}

class Car : VehicleInterface, VehicleDoorInterface {
    override fun drive() {
        println("Mobil Dikendarai")
    }

    override fun stop() {
        println("Mobil Berhenti")
    }

    override fun refuel() {
        println("Mobil Mengisi Ulang Bensin")
    }

    override fun openDoor() {
        println("Mobil Bisa Buka Pintu")
    }
}

fun main(){
    val objectMotor = Motorcycle()
    objectMotor.drive()
    objectMotor.stop()
    objectMotor.refuel()

    val objectCar = Car()
    objectCar.drive()
    objectCar.stop()
    objectCar.refuel()
    objectCar.openDoor()
}