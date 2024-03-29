public class Masa extends Magnitud{
    public Masa(float numero, String unidad) {
        super(numero, unidad);
    }
    protected Masa convertir(String nuevaUnidad) {
    	if (nuevaUnidad.equals(super.getUnidad())) {
    		return new Masa(super.getNumero(),nuevaUnidad);
    	} else if(nuevaUnidad.equals("kg")){
            return new Masa(super.getNumero()/2.20462f,nuevaUnidad);
        } else if (nuevaUnidad.equals("libras")) {
            return new Masa(super.getNumero()*2.20462f,nuevaUnidad);
    	}
        return null;
    	}
    public static String[] unidadesMasa() {
    	String[] masas = {"kg","libras"};
    	return masas;
    }
}
