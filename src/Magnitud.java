import java.util.HashMap;

public abstract class Magnitud {
    private float numero;
    private String unidad;
    public Magnitud(float numero, String unidad){
        this.numero=numero;
        this.unidad=unidad;
    }
    protected float getNumero() {
        return numero;
    }
    protected String getUnidad() {
        return unidad;
    }
    protected void setNumero(float numero) {
        this.numero = numero;
    }
    protected void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    @Override
    public String toString() {
        return Math.round(getNumero() * 100.0) / 100.0 + " " + this.getUnidad();
    }
}
