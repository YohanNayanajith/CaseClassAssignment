object CaseClassAssignment {
  case class Point(x:Int,y:Int){
    def + :Int = x+y

    def multi(a:Int,b:Int):Int={
      a*b
    }
    def move(d:Int):Unit = {
      println("Move x distance: "+multi(x,d))
      println("Move x distance: "+multi(y,d))
    }
    def distance():Int={
      x-y
    }

    def invert():Unit={
      println("Invert X and Y points: "+Point(y,x))
    }
  }

  def main(args:Array[String]): Unit ={
    val p1 = Point(10,8)
    println(p1.+)
    p1.move(5)
    println("Differenet between given distance : "+p1.distance())
    p1.invert()
  }

}
