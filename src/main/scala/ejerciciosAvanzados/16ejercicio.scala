
//Definir la función uncurry, que dada una función currificada de dos
// argumentos, devuelve su versión no currificada equivalente. Es la
// inversa de la anterior.

// hice sin querer la curryficada en el ejercicio15 lmao, pero lo repito aca

def ejercicio16():Unit = {
    
  def unCurry[A,B,C](f: (A) => (B) => (C) ): (A,B) => C ={
    (a,b) => f(a)(b)
  }
  
  val sumaCurried = (a:Int) => (b:Int) => a + b
  
  val sumaUnCurried = unCurry(sumaCurried)
  
  print(sumaUnCurried(5,3))
  
}