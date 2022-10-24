package domain;

import domain.medios.MedioDeNotificacion;

public class Notificador {

    public void enviarNotificacion(Notificacion notificacion, MedioDeNotificacion medio){
        medio.enviarNotificacion(notificacion);

    }
}
