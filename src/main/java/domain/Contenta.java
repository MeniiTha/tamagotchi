package domain;

public class Contenta extends  Estado{
    @Override
    public void come(Mascota mascota) {
        mascota.incrementarNivelDefelicidad(1);
    }

    @Override
    public void juga(Mascota mascota) {
        mascota.incrementarNivelDefelicidad(2);
        if(juegaMasDe5Veces(mascota)){
            mascota.setEstado(new Hambrienta());
        }
    }

    private boolean juegaMasDe5Veces(Mascota mascota) {
        return mascota.getCantidadDeVecesQueJuega() > 5;
    }

    @Override
    public Boolean podesJugar(Mascota mascota) {
        return true;
    }
}
