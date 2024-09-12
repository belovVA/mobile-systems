fun main() {
  val firstNumber = 10
  val secondNumber = 5
  val thirdNumber = 8
  
  var result = add(firstNumber, secondNumber)
  var anotherResult = add(firstNumber, thirdNumber)

  println("$firstNumber + $secondNumber = $result")
  println("$firstNumber + $thirdNumber = $anotherResult")

  result = subtract(firstNumber, secondNumber)
  anotherResult = subtract(firstNumber, thirdNumber)

  println("$firstNumber + $secondNumber = $result")
  println("$firstNumber + $thirdNumber = $anotherResult")

  
}

// Define add() function below this line
fun add(numb1 : Int, numb2:Int) :Int {
  return numb1 + numb2
}

fun subtract(numb1 : Int, numb2:Int) :Int {
  return numb1 - numb2
}