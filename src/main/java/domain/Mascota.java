package domain;

public class Mascota {
    private Estado estado;
    private Integer gradoDeFelicidad;
    private Integer cantidadDeVecesQueJuega;
    private Integer tiempoAburrido;

    public Mascota() {
        this.tiempoAburrido = 0;
        this.estado = new Contenta();
        this.gradoDeFelicidad = 10;
        this.cantidadDeVecesQueJuega = 0;
    }

    public void juga(){
        estado.juga(this);
    }
    public void come(){
        estado.come(this);
    }
    public Boolean podesJugar(){
        return estado.podesJugar(this);
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getGradoDeFelicidad() {
        return gradoDeFelicidad;
    }

    public void setGradoDeFelicidad(int gradoDeFelicidad) {
        this.gradoDeFelicidad = gradoDeFelicidad;
    }

    public int getCantidadDeVecesQueJuega() {
        return cantidadDeVecesQueJuega;
    }

    public void setCantidadDeVecesQueJuega(int cantidadDeVecesQueJuega) {
        this.cantidadDeVecesQueJuega = cantidadDeVecesQueJuega;
    }

    public Integer getTiempoAburrido() {
        return tiempoAburrido;
    }

    public void setTiempoAburrido(Integer tiempoAburrido) {
        this.tiempoAburrido = tiempoAburrido;
    }

    public void incrementarNivelDefelicidad(int i) {
        this.gradoDeFelicidad += i;
    }
}
