package funciones;

import funciones.EnviarCorreo;

/**
 *
 * @author M Fer
 */

public class mainEmail {
  public static void main( String... aArguments ){
    EnviarCorreo correoNuevo = new EnviarCorreo();
    correoNuevo.SendMail();
  }
}
