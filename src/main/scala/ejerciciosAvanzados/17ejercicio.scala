
// Generar la lista de los primeros mil números primos.

def ejercicio17(): Unit = {



// --------------------------------------------------------
//------------------------- ACA SE LOGRO ALGO PERO NO ERA LO QUE PEDIA
// --------------------------------------------------------

//  def primerosMilNumPrimos_NoMeDaMil(): List[Int] = {
//
//    def criba(tope: Int): List[Int] = {
//      val lista = (2 to tope).toList
//
//      def cribarRecursivo(lista: List[Int], primos: List[Int]): List[Int] = {
//        lista match
//          case Nil => primos
//          case x :: xs => cribarRecursivo( xs.filter(numero => numero % x != 0), primos :+ x)
//      }
//
//      cribarRecursivo(lista,List())
//    }
//
//    criba(5000).take(1000)
//
//  }

//  print(primerosMilNumPrimos_NoMeDaMil().length)
//  print("\n")
//  print(primerosMilNumPrimos_NoMeDaMil())



// --------------------------------------------------------
//------------------------- ACA QUISE INTENTAR ALGO PERO ERA MUY COMPLEJO PARA SEGUIRLO
// --------------------------------------------------------



//      val lista = List()
//      val primerNumeroPrimo = 2
//
//      def conseguirSiguienteNumeroPrimo(numero : Int): Int = {
//
//        // planteo lista de numeros de 0 hasta numero-1
//        // reviso si es divisible por alguno ( numero % n == 0)
//        //  -> si es divisible hago conseguirSiguienteNumeroPrimo(numero+1)
//        // --> si no es divisible por (numero % n == 0) sigo al siguiente numero
//        // si ya recorri toda la lista y no hay numero devuelvo el numero
//        // si ya recorri toda la lista y hubo coincidencia
//        val tope = numero -1
//        val iterador = 2
//        val listaNumeros = (2 to tope).toList
//
//        evaluoSiEsPrimo(numero, iterador, listaNumeros) match
//          case
//
//
//      }
//
//      def cargarNumerosRecursivo(lista: List[Int], accum: Int): List[Int] = {
//
//        val nuevaLista = lista ::: List(accum)
//        val numeroPrimo = conseguirSiguienteNumeroPrimo( accum+1)
//
//        lista match
//          //      case Nil => lista ::: List(accum)
//          case lista if lista.length > 100 => lista
//          case lista if lista.length < 100 => cargarNumerosRecursivo(lista,numeroPrimo)
//      }
//
//      cargarNumerosRecursivo(lista,primerNumeroPrimo)


  // --------------------------------------------------------
  //-------------------------  ESTE SI FUNCA, ME QUIERO M*R#R, no lo sacaba nunca (no use nada de eso)
  // --------------------------------------------------------


  def primerosMilPrimos(): List[Int] = {
    def esPrimo(n: Int): Boolean = {
      n match
        case n if n < 2 => false
        case n => !(2 to math.sqrt(n).toInt).exists(n % _ == 0)
    }

//    def esPrimo(n: Int): Boolean = {
//      val posiblesDivisores = 2 to math.sqrt(n).toInt
//      val tieneDivisor = posiblesDivisores.exists(divisor => n % divisor == 0)
//      !tieneDivisor
//    }

    LazyList.from(2).filter(esPrimo).take(1000).toList
  }

  print(primerosMilPrimos().length)
  print("\n")
  print(primerosMilPrimos())

}

