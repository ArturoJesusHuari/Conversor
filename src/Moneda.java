import java.util.HashMap;
public class Moneda extends Magnitud{
    private HashMap<String,Float> cambio = new HashMap<>();
    public Moneda(float numero, String unidad){
        super(numero, unidad);
    }
    private void equivalentesADolar(){
    	//Actualizado el 19/03/20023
        this.cambio.put("sol",3.77f);
        this.cambio.put("dolar", 1f);
        this.cambio.put("euro", 0.94f);
        this.cambio.put("libras esterlinas", 0.82f);
        this.cambio.put("yen japonés", 131.85f);
        this.cambio.put("won sul-coreano", 1311.70f);
    }
    public static String[] unidadesMonedas() {
    	String[] monedas = {"sol","dolar","euro","libras esterlinas","yen japonés","won sul-coreano"};
    	return monedas;
    }
    protected Moneda convertir(String nuevaMoneda){
        equivalentesADolar();
        return convertirACualquiera(valorADolar(), nuevaMoneda);
    }
    private float valorADolar(){
        for (String moneda:cambio.keySet()) {
            if(moneda.equals(this.getUnidad())){
                float valorADolares = cambio.get(moneda);
                return this.getNumero()/valorADolares;
            }
        }
        return 0;
    }
    private Moneda convertirACualquiera(float valor, String nuevaMoneda){
        for (String moneda:cambio.keySet()) {
            if(moneda.equals(nuevaMoneda)){
                float valorDeDolarANuevaMoneda = cambio.get(moneda);
                return new Moneda(valor*valorDeDolarANuevaMoneda, nuevaMoneda);
            }
        }
        return null;
    }
}
