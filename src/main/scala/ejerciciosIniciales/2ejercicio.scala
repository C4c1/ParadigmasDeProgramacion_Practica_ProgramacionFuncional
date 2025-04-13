def ejercicio2(): Unit ={
  print("Escribir una función repetidos(lista1: List[Int], lista2: List[Int]): L" +
    "ist[Int] que retorne una nueva lista que contenga los elementos que " +
    "están presentes en ambas listas.")
  print("\n")

  def repetidos(lista1: List[Int], lista2: List[Int]): List[Int] = {
      lista1.filter( p => lista2.contains(p))
  }

  val listaNueva1 = repetidos(List(1,2,3,4,5), List(1,77,2,88,4,4,7))

  val listaNueva2 = List(1,2,3,4,5).intersect(List(1,77,2,88,4,4,7))

  println(listaNueva1)
  print("\n")
  println(listaNueva1)

}