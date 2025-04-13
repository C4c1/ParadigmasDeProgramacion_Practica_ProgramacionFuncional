
//Escribir una función que junte los números de una lista sin usar métodos
// de ordenamiento. Ej: (1, 2, 3,4, 1, 3) => (2, 1, 1, 3, 3, 4).


def ejercicio20(): Unit = {

  def listaAgrupadaPorNumeros( lista: List[Int]): List[Int]={
//    lista.groupBy(x => x).values.toList.flatten

    lista.distinct.flatMap( num => lista.filter( x => x == num))
  }

  val lista = List(1, 2, 3,4, 1, 3)

  print(listaAgrupadaPorNumeros(lista))

}