package oops_1
import scala.collection.mutable.ListBuffer
object DriverQueue extends App{

  val list = ListBuffer(5, 3, 1, 4, 6, 10)
  println(list)

  var doubledList = new DoubleQueue(list)  //Doubled the elements in the queue.
  println(list)

  var squareQueue = new SquareQueue(list)   //Squaring the elements in queue.
  println(list)

  squareQueue.dequeue(list)
  println(list)

  squareQueue.enqueue(list)
  println(list)
}
