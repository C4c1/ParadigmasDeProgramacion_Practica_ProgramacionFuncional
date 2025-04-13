import scala.collection.mutable.Map

def ejercicio10(): Unit = {

  // NO ES PURA
  // devuelve un valor distinto por mas que
  // meta los mismos valores.
  // significa que no es DETERMINISTA

  //"Una función pura siempre devuelve el
  // mismo resultado para los mismos parámetros
  // y no tiene efectos secundarios."

  def randomEntre(a: Int, b: Int): Int = {
    val rand = new scala.util.Random
    rand.between(a, b)
  }

  println(randomEntre(1,30))
}

