package ejerciciosAvanzados


//Escribir una función que reciba un entero n y una lista l y retorne una lista con la diferencia
// de cada uno de la lista a n. Solo debe tener en cuenta los números para los cuales la diferencia
// es mayor a 10, ignorar el resto.

def ejercicio19():Unit =  {


  // yo entiendo que dice 'diferencia de numero de lista a n' con 'n - lista[i]'
  // y que devuelva el numero que haya cumplido (sin la modificacion)
  def elementosConDiferenciaDeDiez( numero: Int, lista: List[Int]): List[Int] = {
    lista.filter(x => (numero - x) > 10 )
  }

  //en clase lo hicieron pero devolvieron el resultado de esa resta

  def elementosCorregido(numero: Int, lista:List[Int]): List[Int] = {
    lista.map( x => x - numero ).filter( x => x > 10)
  }

  val lista = List(1,5,10,15,20,30,40)
  val numeroAComparar = 20

  print(elementosConDiferenciaDeDiez(numeroAComparar,lista))
  print("\n")
  print(elementosCorregido(numeroAComparar, lista))

}