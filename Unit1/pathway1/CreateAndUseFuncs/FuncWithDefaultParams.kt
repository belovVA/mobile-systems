fun main() {
  println(birthdayGreeting(name = "Rover", age = 5))

  println(birthdayGreeting(age = 2, name = "Rex"))
}

fun birthdayGreeting(name: String = "Rover", age: Int): String {
  return "Happy Birthday, $name! You are now $age years old!"
}