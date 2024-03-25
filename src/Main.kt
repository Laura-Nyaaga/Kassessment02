//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
exclude("Barnie bakes brown bagels and buns")
    numbers(arrayOf(2,3,4))
    // volume(0.75, 3.14159, 7.0)
    var sphere = Volume (3.14159, 0.75, 7.00)
    sphere.volume()
    isPalindrome("madam")
    isPalindrome("laura")
}
fun exclude( word: String){
    var sentence = word
    println( sentence.split('b'))

}
class Voulume(val pie: Double, val fraction:Double, var radius: Double){
    fun volume(){
        var total = pie*fraction*(radius*radius*radius)
        println(total)
    }
}
fun numbers(digit: Array<Int>){
    var operation = arrayOf(digit)
    println (operation.count())
    println(operation.size())
}
fun volume(a: Double, pie:Double, r: Double){
    var sphere = a*pie*(r*r*r)
    println(sphere)

}
fun isPalindrome(word: String){
    if (word==word.reversed()){
        println("True")
    }
    else{
        println("False")
    }
}
