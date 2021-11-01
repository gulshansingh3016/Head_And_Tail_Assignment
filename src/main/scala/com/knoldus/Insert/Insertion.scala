package com.knoldus.Insert

class Insertion {
  def isort(xs: List[Int]): List[Int] =
    if (xs.isEmpty) Nil
    else insert(xs.head, isort(xs.tail))

  def insert(x:Int, xs:List[Int]): List[Int]={
    if(xs.isEmpty || x < xs.head)
      x::xs

    else
      xs.head :: insert(x, xs.tail)
  }
}

object InsertionTest extends App{
  val list1: List[Int] = List()
  val list2: List[Int] = List(1,12,16,19,18)
   val insert = new Insertion
   println(insert.insert(2, list2))
  println(insert.insert(19, list2))
  println(insert.insert(5, list2))

}