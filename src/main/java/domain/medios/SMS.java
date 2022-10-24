package domain.medios;

import domain.Notificacion;
import domain.medios.adapters.AdapterSMS;

public class SMS implements MedioDeNotificacion{
    private AdapterSMS adapter;
    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        this.adapter.enviarSMS(notificacion);
    }
}
