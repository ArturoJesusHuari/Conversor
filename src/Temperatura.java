public class Temperatura extends Magnitud {
    public Temperatura(float numero, String unidad) {
        super(numero, unidad);
    }
    protected Temperatura convertir(String nuevaUnidad) {
        switch (this.getUnidad()) {
            case "K":
                return kelvinTo(nuevaUnidad);
            case "C":
                return celsiusTo(nuevaUnidad);
            case "F":
                return farenheitTo(nuevaUnidad);
        }
        return null;
    }
    public static String[] unidadesTemperatura() {
    	String[] temperaturas = {"K","C","F"};
    	return temperaturas;
    }
    private Temperatura kelvinTo(String nuevaUnidad) {
        float nuevoNumero = 0;
        if(nuevaUnidad.equals("C")){
            nuevoNumero = this.getNumero()-273.15f;
        } else if (nuevaUnidad.equals("F")) {
            nuevoNumero = (this.getNumero()-273.15f)*9/5f+32;
        }
        return new Temperatura(nuevoNumero, nuevaUnidad);
    }
    private Temperatura celsiusTo(String nuevaUnidad) {
        float nuevoNumero = 0;
        if(nuevaUnidad.equals("K")){
            nuevoNumero = this.getNumero()+273.15f;
        } else if (nuevaUnidad.equals("F")) {
            nuevoNumero = this.getNumero()*9/5f+32;
        }
        return new Temperatura(nuevoNumero, nuevaUnidad);
    }
    private Temperatura farenheitTo(String nuevaUnidad) {
        float nuevoNumero = 0;
        if(nuevaUnidad.equals("C")){
            nuevoNumero = 5/9f*(this.getNumero()-32);
        } else if (nuevaUnidad.equals("K")) {
            nuevoNumero = (this.getNumero()-32)*5/9+273.15f;
        }
        return new Temperatura(nuevoNumero, nuevaUnidad);
    }
}