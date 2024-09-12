fun main() {
  var timeSpentToday : Int
  var timeSpentYesterday : Int
  timeSpentToday = 300
  timeSpentYesterday = 250
  println(timeSpentChecker(timeSpentToday, timeSpentYesterday))

  timeSpentToday = 300
  timeSpentYesterday = 300
  println(timeSpentChecker(timeSpentToday, timeSpentYesterday))

  timeSpentToday = 200
  timeSpentYesterday = 220
  println(timeSpentChecker(timeSpentToday, timeSpentYesterday))
}

fun timeSpentChecker(timeSpentToday :Int, timeSpentYesterday :Int) :Boolean {
  return timeSpentToday > timeSpentYesterday
}