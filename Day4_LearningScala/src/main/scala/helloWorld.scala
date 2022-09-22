object helloWorld {

  def main(args: Array[String]): Unit = {
    println("Hello World")
//    println("Hello World * 1000")

    val result = add(2, 5)
    println("Addition of 2 and 5 is " + result)

    println("Addition of 10 and 10 is " + add_a(10, 10))

    println("Addition of 100 and 100 is " + add_b(100, 100))
  }

  def add( x:Int, y:Int): Int = {
    val z = x + y
    return z
  }

  def add_a(x: Int, y: Int): Int = {
    val z = x + y
    z // not mandatory to specify return keyword
  }

  def add_b(x: Int, y: Int) = { // not mandatory to specify return type
    val z = x + y
     z // not mandatory to specify return keyword
  }

//  def add_c(x: Int, y: Int) = { // IF YOU SPECIFY RETURN KEYWORD YOU NEED TO SPECIFY RETURN TYPE
//    var z = x + y
//    return z // not mandatory to specify return keyword
//  }

  def add_d(x:Int, y:Int) = x + y
  // you can ignore the return type and the return keyword. If it's a single line you may also ignore the bracket!



}
