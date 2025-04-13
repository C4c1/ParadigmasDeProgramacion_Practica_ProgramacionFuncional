
def ejercicio11(): Unit ={

  val lista1 = List('A', 'B', 'C')
  val lista2 = List('D', 'E', 'F')


  // ES UNA FUNCION PURA
  // -siempre le meto lo mismo => devuelve lo mismo => es determinista
  // -no modifica ni utiliza variables o constantes fuera de su scope
  // y no tiene efectos secundarios.
  // -devuelve un valor distinto que se
  // guarda en un lugar distinto => no modifica lo que se ingresa
 //

  def merge[A](list1: List[A], list2: List[A]): List[A] = {
    //el operador ::: es el que concatena las listas
    list1 ::: list2
  }

  val listaNueva = merge(lista1,lista2)

  print(listaNueva)

}

