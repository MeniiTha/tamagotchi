package domain;

public abstract class Estado {

    public abstract void come(Mascota mascota);
    public abstract void juga(Mascota mascota);
    public abstract Boolean podesJugar(Mascota mascota);
}
