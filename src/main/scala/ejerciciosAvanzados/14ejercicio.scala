
//Escribir una función
// topK(numeros: List[Int], k: Int, f: (Int, Int) => Int): List[Int]
// que retorne una lista con los k elementos de números mas grandes según
// la función f. La respuesta debe estar ordenada según el criterio de la
// función f.

def ejercicio14(): Unit = {



  //forma corta pero hay que saber como funcionan estos metodos
  def topK_Corto(numeros: List[Int], k:Int, f:(Int,Int) => Int): List[Int] ={
      numeros.sortWith((a,b) => f(a,b) > 0).take(k)
  }

  def topK(numeros: List[Int], k:Int, f: (Int, Int) => Int): List[Int] = {

//   este me filtra y deja los que quiero pero evalua valor por valor
//   entonces no me sirve para evaluar toda la lista
//    val totalNumeros = numeros.filter( x => x >= f(x,x))

//  sortWith si me sirve para este caso porque ademas de aplicar algo con
//  doble parametro y anonimo, lo reordena de la forma ascendiente o
//  descendiente segun requiera
//  y asi solo tengo que tomar luego los primeros que requiera con take()

    // sort necesita tener un booleano, por eso el >0
    val listaReordenada = numeros.sortWith((a,b) => f(a,b) > 0) //haciendo esto digo que la ordene descendiente
                                                                    // el mayor primero

    def sacarValores(lista: List[Int], tope: Int): List[Int] = {

      lista match
        case Nil => List()
        case lista if lista.length < tope => lista
        case lista if lista.length == tope => lista
        case lista if lista.length > tope => lista.take(k)
    }

    //sacarValores(totalNumeros, k)
    sacarValores(listaReordenada, k)

  }

  val lista = List(5, 2, 9, 1, 7)
  print("\n")
  print(lista)
  print("\n")
  print( topK(lista, 3, (a, b) => a - b))

}