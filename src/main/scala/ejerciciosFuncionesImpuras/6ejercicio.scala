
def ejercicio6(): Unit = {


  //es una funcion pura porque si le meto
  // f(5,5) siempre va  a dar lo mismo
  // no importa cuantas veces, ni cuando,
  // cambia el resultado segun cambien los valores
  // pero es funcional ya que no modifica nada externo
  // solo devuelve un resultado en base a lo que recibe
  // por eso es pura

  val x = 5
  val y = 5

  def f(x: Int, y: Int): Int = {
    x + y
  }

  val total = f(5,5)
  println(total)
}

