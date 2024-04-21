package com.aliemressman.classes.Class

abstract class MCDonals(val burgersayisi : Int) {
    abstract val fridge : Fridge
    abstract val superVisior : SuperVisor
    abstract val employeeOne : Employee
    abstract val employeeTwo : Employee
    abstract val employeeThree : Employee
    abstract val menuList : List<McHamburger>

    // val specialBrachName : String = "Taksim"  -> abstract classlarda ilk deger ataması yapamıyoruz

    abstract fun clean(clock : Int)
    // abstract infix fun clean(clock : Int)

    open val policeOfficer : Police = Police()
}

abstract class MCDonalsExpress : MCDonals(2) {
    abstract fun sellCoffee() : MCCoffee
    //  miras aldigimiz abstract bir child classımızda farklı bir fonksiyon oluşturmak
    //  istediğimzde abstract olarak tanımlamamız gerekiyor.

    override fun clean(clock: Int) {
        println("Cleaning time $clock")
    }

    override val fridge: Fridge
        get() = TODO("Not yet implemented")
}

// NORMAL BİR CLASS OLUŞTURDUĞUMUZ İÇİN MİRAS ALDIĞIMIZ ABSTRACT CLASSLARIN
// TÜM DEĞİŞKENLERİNİ VE FONKSİYONLARINI OVEERRİDE ETMEMİZ GEREKİYOR.
class MCDonalsAvcilar : MCDonals(6) {
    override val fridge: Fridge
        get() = Fridge()

    override val superVisior: SuperVisor
        get() = SuperVisor()

    override val employeeOne: Employee
        get() = Employee()

    override val employeeTwo: Employee
        get() = Employee()

    override val employeeThree: Employee
        get() = Employee()

    override val menuList: List<McHamburger>
        get() = listOf(McHamburger())

    override fun clean(clock: Int) {
        println("Cleaning time $clock")
    }
}

class McDonaldsKadikoy : MCDonals(6) {
    override val fridge: Fridge
        get() = Fridge()

    override val superVisior: SuperVisor
        get() = SuperVisor()

    override val employeeOne: Employee
        get() = Employee()

    override val employeeTwo: Employee
        get() = Employee()

    override val employeeThree: Employee
        get() = Employee()

    override val menuList: List<McHamburger>
        get() = listOf(McHamburger())

    override fun clean(clock: Int) {
        println("Cleaning time $clock")
    }

    // open olarak tanımlanmış olmasına rağmen opsiyonel olarak override edebiliriz.
    override val policeOfficer: Police
        get() = Police()
}

class McDonalsAvcilarExpress : MCDonalsExpress() {
    override val fridge: Fridge
        get() = Fridge()

    override val superVisior: SuperVisor
        get() = SuperVisor()

    override val employeeOne: Employee
        get() = Employee()

    override val employeeTwo: Employee
        get() = Employee()

    override val employeeThree: Employee
        get() = Employee()

    override val menuList: List<McHamburger>
        get() = listOf(McHamburger())

    override fun sellCoffee(): MCCoffee {
        return MCCoffee()
    }
}
fun main() {
    val mcDonalsAvcilar = MCDonalsAvcilar()
    val mcDonalsKadikoy = McDonaldsKadikoy()
    val mcDonalsAvcilarExpress = McDonalsAvcilarExpress()

    mcDonalsAvcilar.clean(12)
    mcDonalsKadikoy.clean(13)
    mcDonalsAvcilarExpress.clean(14)

    println(mcDonalsAvcilar.burgersayisi)
    println(mcDonalsAvcilarExpress.burgersayisi)
}

class Fridge

class SuperVisor

class McHamburger

class Police

class MCCoffee

class Employee
