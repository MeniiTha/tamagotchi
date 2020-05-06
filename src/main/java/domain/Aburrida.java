package domain;

public class Aburrida extends Estado{
    private Integer tiempoEstimado;

    public Aburrida() {
        this.tiempoEstimado = 80;
    }

    @Override
    public void come(Mascota mascota) {
        if (estaAburridaMasDe80Min(mascota)) {
            mascota.setEstado(new Contenta());
        }
    }

    private boolean estaAburridaMasDe80Min(Mascota m) {
        return m.getTiempoAburrido()>tiempoEstimado;
    }
    @Override
    public void juga(Mascota mascota) {
        mascota.setEstado(new Contenta());
    }

    @Override
    public Boolean podesJugar(Mascota mascota) {
        return true;
    }
}
