import java.io.PrintWriter


def ejercicio12(): Unit ={

  // NO ES UNA FUNCION PURA
  // no devuelve un dato nuevo, si no que modifica algo existente
  // esa modificacion se debe a un efecto secundario que es que un
  // archivo es sobreescrito
  // no cumple con ser funcion pura ya que ademas lo que utiliza no se encuentra
  // adentro del scope, si no que le ingresa parametros para
  // encontrar el recurso por fuera en el sistema (la ruta).

  // en si el hecho de que dependa de factores externos (que
  // exista la ruta, que se abra el archivo y se cree uno o se
  // modifique, etc) hace que pierda ser pura

// (Esto sacado de chatgpt)
//  ❗ Tiene efectos secundarios :
//    Escribe en el sistema de archivos
//  , lo cual cambia el estado del mundo exterior
//.Es un efecto visible más allá del resultado que retorna (y en este caso, ni siquiera retorna algo útil: Unit).
//
//    ❗ Depende del entorno externo:
//    La ruta apunta a un archivo que podría no existir
//  , tener permisos diferentes
//  , estar ocupado
//  , etc.Eso la hace dependiente de recursos fuera del control de la función
//.
//
//  ❗ No es determinista :
//    Si bien con los mismos parámetros en condiciones ideales podría funcionar igual
//  , factores externos(como el sistema de archivos, permisos, espacio en disco) podrían hacer que falle o se comporte distinto.
//
//    ❗ No retorna un nuevo valor :
//    Modifica el sistema de archivos y retorna Unit
//.Esto rompe la idea de que una función pura es como una fórmula matemática
//.

  val texto = "Holaa, quiero recibirme por favor"
  val ruta = "src/main/scala/ejerciciosFuncionesImpuras/archivoNuevo.txt"

  def guardarEnArchivo(texto: String, ruta: String): Unit = {
    val escritor = new PrintWriter(ruta)
    try {
      escritor.write(texto)
    } finally {
//      writer.close()
      escritor.close()
    }
  }

  guardarEnArchivo(texto,ruta)

}