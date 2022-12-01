def whileLoop(condition: => Boolean)(expression: => Any): Unit = {
  if (condition) {
    expression
    whileLoop(condition)(expression)
  }
}


var i = 0;
whileLoop(i < 3) {
  i = i + 1
  println(i)
}