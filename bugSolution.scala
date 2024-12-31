```scala
import scala.collection.mutable.ListBuffer

class MyClass {
  private val buffer = new ListBuffer[Int]()

  def add(x: Int): Unit = {
    buffer += x 
  }
  def get(index: Int): Int = {
    if(index < 0 || index >= buffer.length){
        return -1 //Or throw a custom exception
    }
    return buffer(index)
  }
}

object Main extends App{
  val obj = new MyClass()
  obj.add(1)
  obj.add(2)
  obj.add(3)
  println(obj.get(5)) //This will print -1
  println(obj.get(1)) //This will print 2
}
```