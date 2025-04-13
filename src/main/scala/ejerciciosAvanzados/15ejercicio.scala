
//Definir la función curry, que dada una función de dos argumentos,
// devuelve su equivalente currificada.

def ejercicio15(): Unit = {


  def curry[A,B,C](f: (A,B) => C ): A => B => C = {
    a => b => f(a,b)
  }

  def curryDeTresArgumentos[A,B,C,D](f:(A,B,C) => D): A => B => C => D = {
    a => b => c => f(a,b,c)
  }

  def unCurry[A,B,C](f:(A) => (B) => (C)): (A,B) => C ={
    (a,b) => f(a)(b)
  }

  val suma = (a:Int,b: Int) => a+b

  val sumaCurried = curry(suma)

  print("\n")

  //  Eso pasa porque sumaCurried(2) devuelve una función, no un valor entero.
  //Es decir, sumaCurried(2) es de tipo Int => Int, o sea, una función que
  // espera el segundo parámetro. Como no se la estás aplicando,
  // Scala simplemente imprime su representación interna de la función
  // (el Lambda...@hexadecimal que ves).
  // CONSOLA DEVUELVE : 15ejercicio$package$$$Lambda$20/0x000002489e096488@b684286
  print(sumaCurried(2))
  print("\n" + sumaCurried(2)(5)) // devuelve 7

  print("\n")
  val sumaCon2 = sumaCurried(2)
  print( sumaCon2(5)) // este si devuelve 7

  // estaria bueno probar que pasa si le mando un suma de 3 parametros
  // y si rompe cuando le mando a un curry de solo dos parametros
  // supuestamente hay forma de hacer curry para que reciba funciones
  // de parametros indefinidos pero se mete con otros temas mas complejos
  // pero queda tambien la duda y de probar luego (aun no porque no entra
  // en el examen y me quedo sin tiempo aaaa)
}