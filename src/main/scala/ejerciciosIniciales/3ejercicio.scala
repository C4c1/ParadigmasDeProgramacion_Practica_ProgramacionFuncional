
//Escribir una función eliminarRepetidos(lista: List[Int]): List[Int]
// que retorne una nueva lista que contenga los mismos elementos que
// la original pero sin elementos repetidos.

def ejercicio3(): Unit = {

  def eliminarRepetidos(lista: List[Int]): List[Int] = {
    lista.distinct
  }

  val listaNueva = eliminarRepetidos(List(1,2,3,3,4,4,5,5,6,6,7,7))

  print(listaNueva)

  val eliminarRepes = (lista: List[Int]) => lista.distinct

  val listaNueva2 = eliminarRepes(List(1,2,3,3,4,4,5,5,6,6,7,7))


}

