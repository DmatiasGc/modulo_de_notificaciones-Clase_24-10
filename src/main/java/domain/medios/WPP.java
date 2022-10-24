package domain.medios;

import domain.Notificacion;
import domain.medios.adapters.AdapterTwilioWPP;
import domain.medios.adapters.AdapterWPP;

public class WPP implements MedioDeNotificacion {
    private AdapterWPP adapter = new AdapterTwilioWPP();

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        this.adapter.enviarWPP(notificacion);
    }
}
