import java.time.LocalDate
import java.time.format.DateTimeFormatter

def ejercicio7(): Unit = {

  // NO ES UNA FUNCION PURA
  // esto porque si la llamo varias veces va a cambiar
  // el resultado en algun momento
  // en este caso seria al dia siguiente
  // esto es porque DEPENDE de algo externo para
  // procesar asi que esto hace que no sea puro
  // Incluso si le metiese parametros para cambiar
  // el formato en como muestra la fecha
  // por mas que fuesen siempre los mismos el resultado
  // va  a cambiar porque depende del tiempo que indique
  // el sistema. No esta cerrado al scope al que
  // pertenece la funcion.


  def fecha(): String = {
    LocalDate.now.format(DateTimeFormatter.ofPattern("yyyyMMdd "))
  }

  println(fecha())

}

