fun main(){

    var myCar: Car = Car("camry",2021, "blue", 1988, "felix" )
    myCar.setModel(2021)
    var myCarModel: Int = myCar.getModel()

    println(myCar.color)
    println(myCar.dateOfMan)
    println(myCar.owner)
    println(myCarModel)
}
class Car{
     var name: String =" "
    private var model: Int = 0
     var color: String = " "
     var dateOfMan: Int = 0
     var owner: String = " "

    constructor(name: String, model: Int, color: String, dateOfMan: Int, owner: String){
        this.name = name
        this.model = model
        this.color = color
        this.dateOfMan = dateOfMan
        this.owner = owner
    }
fun getModel(): Int {
    return this.model
}
    fun setModel(model: Int ){
        this.model = model
    }

}

class Dog{
    var name: String = " "
    var bark: Boolean = true
    var eat: Boolean = true
    var type: String = " "
    var sex: String = " "

    constructor(name: String, bark: Boolean, eat: Boolean, type: String, sex: String){
        this.name = name
        this.bark = bark
        this.eat = eat
        this.type = type
        this.sex = sex
    }
}

class Laptop{
    var name: String = " "
    var model: String = " "
    var color: String = " "
    var price: Int = 0
    var size: Int = 0

    constructor(name: String, model: String, color: String, price: Int, size: Int){
        this.name = name
        this.model = model
        this.color = color
        this.price = price
        this.size = size
    }
}

class Family{
    var husband: String = " "
    var wife: String = " "
    var noOfChildren: Int = 0
    var socialStatus: String = " "
    var noOfRelative: Int = 0

    constructor(husband: String, wife: String, noOfChildren: Int, socialStatus: String, noOfRelative: Int){
        this.husband = husband
        this.wife = wife
        this.noOfChildren = noOfChildren
        this.socialStatus = socialStatus
        this.noOfRelative = noOfRelative
    }
}

class Phone{
    var name: String = " "
    var type: String = " "
    var color: String = " "
    var price: Int = 0
    var dateOfProduction: Int = 0

    constructor(name: String, type: String, color: String, price: Int, dateOfProduction: Int){
        this.name = name
        this.type = type
        this.color = color
        this.price = price
        this.dateOfProduction = dateOfProduction
    }
}