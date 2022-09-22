// access level in scala:
//  public: anywhere
//  private: can access only in class is defined
//  protected: can access in class it is defined as well as in subclass extending the given class using inheritance

// you need to specify only the private and protected classes

class Car{
  var topClassExtraCost = 0
  var roadTax = 100
  private var otherTaxes = 100
  protected var finalTax = 100

  def cost(basicCost:Int): Int = basicCost + topClassExtraCost + roadTax + otherTaxes
  // a method is defined inside a class

  // Method with side effect
  def checkTax(): Int = {
    otherTaxes = 200 // if a function changes it by mistake it changes the value of the object
    otherTaxes
    // this is called a method side effect
  }

  def printTax = roadTax

}

class smallCar extends Car {
  println(roadTax)
  // println(otherTaxes) // not accessible
  println(finalTax)
}


object demoClassObject {

  // Class = Collection of variables and methods
  // Object = instance of a class

  def main(args: Array[String]): Unit = {
    printHello()

    // to create an object of a class we need to:
    var bmw = new Car
    println(bmw.roadTax)
    // and we can access the vars and methods inside it

    bmw.roadTax = 200
    println(bmw.roadTax)
    // it only changes on the obj of that class
    // because it's a public variable
    // println(bmw.otherTaxes) // not accessible



    bmw.topClassExtraCost = 500

    var bmw_cost = bmw.cost(basicCost = 100000)
    println("Bmw cost " + bmw_cost)
    println("other taxes are " + bmw.checkTax)
    println("road tax is " + bmw.printTax)

    var a = new Car
    println(a.roadTax)


  }

  def printHello() = {
    println("Hello")
  }
  // a function is not defined inside a class but out of it


}
