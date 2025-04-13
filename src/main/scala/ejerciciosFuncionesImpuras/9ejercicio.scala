import scala.collection.mutable.Map


def ejercicio9(): Unit ={

  // NO ES FUNCION PURA porque modifica
  // algo fuera de su scope, no devuelve algo
  // nuevo. Esto va en contra del paradigma
  // funcional

  val mapita = Map(1 -> 10, 2 -> 20, 3 -> 30)
  print(mapita)
  print("\n")

  def actualizarAUno(mapa: Map[Int, Int]) = {
    for (k, v) <- mapa do
      mapa(k) = 1
  }

  actualizarAUno(mapita)

  print(mapita)

  //una version funcional pura
  // por defecto los maps no se pueden modificar
  // a menos que agreguemos una libreria extra.

  def actualizarAUnoPuro(mapa: Map[Int,Int]) = {
    mapa.map{
      case (k, _) => (k,1)
    }
  }

}
