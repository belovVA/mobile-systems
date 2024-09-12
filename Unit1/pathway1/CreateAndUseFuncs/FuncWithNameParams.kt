fun main() {
  println(birthdayGreeting(name = "Rover", age = 5))
  println(birthdayGreeting(age = 2, name = "Rex"))
}

fun birthdayGreeting(name: String, age: Int): String {
  val nameGreeting = "Happy Birthday, $name!"
  val ageGreeting = "You are now $age years old!"
  return "$nameGreeting\n$ageGreeting"
}