package domain;

public class Hambrienta extends Estado{


    @Override
    public void come(Mascota mascota) {
        mascota.setEstado(new Contenta());
    }

    @Override
    public void juga(Mascota mascota) {

    }

    @Override
    public Boolean podesJugar(Mascota mascota) {
        return false;
    }
}
