//Escribir una función sumar(lista: List[Int]): Int
//que retorne la suma de todos los elementos de la lista.

def ejercicio5(): Unit = {

  val lista = List(1,1,1,1,1,1,1,1,1,1)

  def sumar(lista: List[Int]): Int ={
    lista.sum
  }

  val total = sumar(lista)
  print("\n")
  print(total)


  //esta aplica crryng en 'foldLeft'
  //el 0 significa desde donde suma, y el resto es lo que
  // va acumulando
  //'foldLeft' en esencia recorre una coleccion y la 'reduce'
  // a un solo elemento.
  //Puedo decir que aplica curryng porque puedo mandarle
  // un solo parametro y luego la funcion ya que sus parametros
  // estan separados en parentesis dsitintos
  def sumarConFold(lista: List[Int]): Int = {

//    lista.foldLeft(0)((acum, elem) => acum + elem)

    val listanueva = lista.foldLeft(0)
    listanueva((acum,elem) => acum + elem)
  }

  print("\n")
  val total2 = sumarConFold(lista)
  print(total2)

}