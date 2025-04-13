package ejerciciosIniciales

def ejercicio1(): Unit = {
  //esta es una forma de declarar la funcion anonima en una variable
  val listaFuncion0: (Int, Int) => List[Int] = (inicio, fin) => (inicio to fin).toList;

  //esta es otra de hacer lo mismo pero menos explicito que la anterior
  val listaFuncion1 = (inicio: Int, fin: Int) => List(inicio, fin)

  //aca directamente ejecuto y guardo el resultado de las funciones
  val listaCreada0 = listaFuncion0(5, 2) // ERROR: aca aparece empty
  val listaCreada1 = listaFuncion1(5, 2)

  def entreNumeros(inicio: Int, fin: Int): List[Int] = {
    List(inicio, fin)
  }

  //este ejemplo es distinto porque cree una funcion
  val listaCreada2 = entreNumeros(5, 2)

  print(listaCreada0)
  print("\n")
  print(listaCreada1)
  print("\n")
  print(listaCreada2)
}



