
//Escribir una función contar(palabras: List[String]): Map[String, Int] retorne
// un mapa donde las claves sean las palabras de la lista pasada por parámetro
// y los valores la cantidad de apariciones que tiene dicha palabra en la lista

def ejercicio13(): Unit = {

  def contar(palabras: List[String]): Map[String, Int] = {

    //      palabras.groupBy(identity).view.mapValues(_.size).toMap

//    palabras.groupBy(cosa => cosa).view.mapValues(valor => valor.size).toMap
    palabras.groupBy(valor => valor) // esto hace // ⇒ Map("hola" -> List("hola", "hola"), "chau" -> List("chau"))
                    .view   //esto no se :c
                    .mapValues(grupo => grupo.size) // pero sirve para esto que modifica el numero de clave y decirle que sea el valor del size de valores
                    .toMap // y esto transforma el MapView en Map

  }

  val lista = List("manzana","manzana","manzana","pera","pera",
                    "pera","pera","durazno","durazno")
  print("\n")
  print(contar(lista))


// ESTOS FUERON INTENTOS PERO ENCIMA LO HICE AL REVES Y MAL JAJAJ
//  def listaAMap( lista: List[String]) : Map[Int,String] = {
//     lista.zipWithIndex.map {
//       case (palabra, i) => (i,palabra)
//     }.toMap
//  }
//
//  print("\n SOLO lista a map ")
//  print(contar(lista))
//  print("\n")
//
//
//  def mapamodif(mapita : Map[Int,String]): Map[Int,String] = {
//      mapita.map{
//        case (k,v) => (v.size,v)
//      }
//  }
//
//  val listaNueva = (mapamodif(listaAMap(lista)))
//  print(listaNueva)

  // FORMA MAS FACIL


  print("\n ESTE ES DISTINTO Y MAS SIMPLE \n ")
  print(contarGrupos(listaAMapita(lista)))


  def listaAMapita( lista:List[String]): Map[String,List[String]]= {
    lista.groupBy(x => x)
  }

  def contarGrupos( mapita: Map[String,List[String]]): Map[String,Int] ={
    mapita.map{
      case (palabra, grupo) => (palabra, grupo.length)
    }
  }

  // resolucion final

  def contar2(lista: List[String]): Map[String, Int] = {

    val listaMapeada = lista.groupBy(x => x)

    listaMapeada.map {
      (palabra, grupo) => (palabra, grupo.length)
    }

  }

  print("\n RESOLUCION FINAL (solo lo meti adentro de una funcion todo) \n ")
  print(contar2(lista))

}