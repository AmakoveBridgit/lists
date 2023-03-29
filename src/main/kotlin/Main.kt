fun main() {
//1. Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc

    personObject()
    height()
    var a = Vehicles("KBD020F",50)
    var b = Vehicles("KDA230G",60)
    var c= Vehicles("KFC374P",80)
    var d = Vehicles("KAC354V",65)
    var listVehicles= listOf(a,b,c,d)
    println(vehicleList(listVehicles))


   }
fun  listNames(Name:List<String>):List<String> {
    Name.forEachIndexed { index, s ->
        if (index % 2 == 0) {
            println(s)
        }
    }
    return Name


}



//2.Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

fun height(){
    var num= mutableListOf(3,1,2,8,7)
    println(num.average())
    println(num.sum())

}


//3.Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var name:String,var age:Int,var height:Int,var weight:Int)
fun personObject(){
    val persona1=Person("Mercy",23,6,40)
    val persona2=Person("Shiro",20,7,50)
    val persona3=Person("Bree",25,8,60)
    val persona4=Person("Brenda",22,7,45)
    val persona5=Person("Belyse",21,6,35)
    val personalist=listOf(persona1,persona2,persona3,persona4,persona5)
    println(personalist)
    val sortedDesc=personalist.sortedByDescending { persona-> persona.age}
    println(sortedDesc)


}

//4.Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
fun addList():String{
    val persona5=Person("Mano",25,6,70)
    val persona6=Person("Shiko",28,7,55)
    return

}




//5.Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

data class Vehicles(var registration:String, var mileage:Int)
fun vehicleList(vehicle:List<Vehicles>):Int{
    var average=0
    vehicle.forEach { new->new.mileage
        average+=new.mileage
    }
    var totalAverage=vehicle.count()
    return totalAverage
}
