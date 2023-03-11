public class Main {
    public static void main(String[] args) {
        Moneda m = new Moneda(1f, "sol");
        Moneda n = m.convertir("libras esterlinas");
        System.out.println(n);
    }
}

