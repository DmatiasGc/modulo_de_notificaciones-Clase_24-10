package test;

import domain.Notificacion;
import domain.Notificador;
import domain.medios.Email;
import domain.medios.SMS;
import domain.medios.WPP;

public class MainTest {
    public static void main(String[] args) {
        Notificador notificador = new Notificador();

        Notificacion unaNotificacion = new Notificacion();

        unaNotificacion.setMensaje("Hola, este es un mensaje de prueba");
        unaNotificacion.setDestinatario("abcd@gmail.com");
        unaNotificacion.setRemitente("Curso LUJU Credicoop");

        notificador.enviarNotificacion(unaNotificacion, new WPP());

        notificador.enviarNotificacion(unaNotificacion, new SMS());

        notificador.enviarNotificacion(unaNotificacion, new Email());


    }
}
