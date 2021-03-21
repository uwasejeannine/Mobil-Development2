import java.util.*

fun main() {
 names("Jeannine","Uwase","Janet","Jean")
  countryCities()
    numArrays()
    fullNames("Jeannine")
}
fun names(a:String, b:String,c:String,d:String){
var nameArray = arrayOf(a,b,c,d)
println(Arrays.toString(nameArray))
}
fun countryCities(){
    var cities= arrayOf("Harare","Mumbai","Dodoma","Jakarta")
    cities.forEach{ cities->
        println(cities.capitalize())


    }
}

fun numArrays() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 159, 62)
    var sumOfNumber = numbers[1].plus(numbers[4])
    println(sumOfNumber)
    println(numbers.indexOf(159))
    val sortedNums = numbers.sortedArray()
    println(Arrays.toString(sortedNums))
}
fun fullNames(names:String):String{
    var names=arrayOf("Gentille","Giselle","Fille")
   println(Arrays.toString(names))
    return Arrays.toString(names)

}