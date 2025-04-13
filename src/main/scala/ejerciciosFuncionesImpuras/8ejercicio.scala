def ejercicio8(): Unit = {


  // ES FUNCION PURA porque si le meto los mismos
  // parametros a 'contar' siempre da el mismo resultado
  // y me devuelve otro valor que no modifica algo fuera
  // de su scope.
  // no tiene efectos secundarios ni requiere de
  // variables o constantes que se encuentran afuera
  // de 'contar'

  val lista = List(1,2,2,3,4,5)

  def contar(l: List[Int], e: Int): Int = {
    var cont = 0;
    l.foreach(elemento => {
      if (elemento == e) {
        cont = cont + 1
      }
    })
    cont
  }

  val totalSimbolo2 = contar(lista, 2)
  print(totalSimbolo2)


  // formas mas cortas de hacer lo mismo
  def contar2(l: List[Int], e: Int): Int = {
    l.count(_ == e)
  }

  def contar3(l:List[Int], e:Int): Int ={
    l.filter(_ == e).length
  }

}