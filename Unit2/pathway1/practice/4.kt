
class Song(
val name: String,
val nameSonger: String,
val yearPublic: Int,
val countRepeat: Int
){
val isPopular: Boolean 
  get() = countRepeat >= 1000


fun printInfo(){
  println("«$name, исполненное $nameSonger, было выпущено в $yearPublic.")
}
}

fun main() {    
  val example = Song("Lalala", "bybyby", 2022, 3500)
  example.printInfo()
  println(example.isPopular)
}

