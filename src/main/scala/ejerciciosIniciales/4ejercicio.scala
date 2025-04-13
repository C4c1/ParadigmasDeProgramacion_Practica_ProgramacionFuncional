//Escribir una función
//aplicar(lista: List[Int], f: (Int, Int) =¿Int): List[Int]
//retorne una nueva lista que
//contenga los resultados de aplicar f a cada elemento de lista


def ejercicio4(): Unit ={


  //aca NO ESPECIFICA qué funcion aplicar, simplemente que se aplique
  // y devuelva una lista.

  print("\n")
  val lista = List(1,2,3,4,5,6,7,8,9,10)

  // aplicar que por cada elemento de la lista aplica la funcion
  def aplicar(lista: List[Int], f: (Int,Int) => Int) : List[Int] ={
    lista.map( a => f(a,a))
  }

  val listaNueva = aplicar(lista, (x,y) => x*2)
  print(listaNueva)

  print("\n")
  //variacion
  def aplicar1(lista: List[Int], f: (Int, Int) => Int): List[Int] = {
    lista.map { a => f(a, a + 1)    }
  }
  val listaNueva1 = aplicar(lista, (x,y) => x+y)
  print(listaNueva1)


  print("\n")

  def aplicar2(lista: List[Int], f: (Int, Int) => Int): List[Int] = {
    lista.map { a => f(a*2, a*1) }
  }

  val listaNueva2 = aplicar(lista, (x,y) => y)
  print(listaNueva2)



}