package domain.medios.adapters;

import domain.Notificacion;

public interface AdapterSMS {
    void enviarSMS(Notificacion notificacion);
}
