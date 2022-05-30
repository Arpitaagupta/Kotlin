package inheritanceCodingPractice

import inheritanceCodingPractice.*

fun main() {

    val bmw = Car1("BMW","White")
    bmw.Brand()
    bmw.speedUp()
    bmw.applyBrake()
    bmw.Colour()
    bmw.maxSpeed()

    var mer = car2("Mercedes Benz","Black")
    mer.Brand()
    mer.speedUp()
    mer.applyBrake()
    mer.Colour()
    mer.maxSpeed()

    var hyd = Hyundai("Hyundai", "Black")
    hyd.Brand()
    hyd.speedUp()
    hyd.applyBrake()
    hyd.Colour()
    hyd.maxSpeed()

    var hon = Honda("Honda", "White")
    hon.Brand()
    hon.speedUp()
    hon.applyBrake()
    hon.Colour()
    hon.maxSpeed()



}