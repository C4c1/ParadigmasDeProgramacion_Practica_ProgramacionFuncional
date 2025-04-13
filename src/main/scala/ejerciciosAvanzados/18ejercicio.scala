

//Dado un texto, crear una función que tome el texto como entrada y devuelva un mapa
// que muestre la frecuencia de cada palabra en el texto. Los espacios no deben ser
// considerados



// ESTO PUEDE SERVIR PARA EL TP, usa expresiones regulares (de stackOverflow)
//val str = "one,two,(three,four), five"
//val re = """\(.*?\)|[^, ]+""".r
//for(m <- re.findAllIn(str)) println(m)

def ejercicio18():Unit={

  val texto = "Hola. Este texto tiene nombres como vaca y pato pero tambien otra vaca y gallina y me olvide de otro pero"
  val texto2 = "prueba prueba gato gato gato perro , , , : hola un un dos"

  def mapaDePalabrasFrecuentes(texto: String): Map[String,Int] ={
    texto.split("\\s").toList.groupBy(x => x).view.mapValues(grupo => grupo.size).toMap
  }

  def mapaDePalabrasFrecuentes_otroRegex(texto: String): Map[String, Int] = {
    texto.split("[\\d\\,\\.\\:\\ ]+").toList.groupBy(x => x).view.mapValues(grupo => grupo.size).toMap
  }

  print(mapaDePalabrasFrecuentes(texto2))
  print("\n")
  print(mapaDePalabrasFrecuentes_otroRegex(texto2)) // con este regex no cuenta ni las ',' ni las ':' y posibles "."

  //estaria bueno ver si hay una inversa (que devuelva un Map[Int,String] pero creo que es lo siguiente

  def mapInvertido(mapita:Map[String, Int]): Map[Int,String] = {

    mapita.map {
      case (palabra,numero) => (numero,palabra)
    }

  }
  print("\n")
  print(mapInvertido(mapaDePalabrasFrecuentes_otroRegex(texto2)))

  // no funciono, cierto que los maps reservan una clave para cada valor jijij

  // esto no es exactamente pero es la unica manera de no perder datos y saber cuantos hay segun clave
  def mapInvertidoAgrupado(mapita: Map[String, Int]): Map[Int, List[String]] = {
    mapita.toList.groupBy{
      case (clave, numero) => numero
    }.map{
      (numero,valores) => (numero, valores.map( x => x._1)) // me re confundio el ._1 pero se refiere al primer elemento que coincida con el numero x
    }
  }


  print("\n")
  print(mapInvertidoAgrupado(mapaDePalabrasFrecuentes_otroRegex(texto2)))

}