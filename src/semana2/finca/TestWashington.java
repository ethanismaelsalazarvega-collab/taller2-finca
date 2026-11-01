public class TestWashington {
    public static void main(String[] args) {
        Producto urea = new Producto("PR-001", "Urea", 32.50, 40);
        double valor = Valorador.valor(urea);
        if (valor == 1300.0) {
            System.out.println("✅ Washington verificó con éxito: Cálculo USD " + valor);
        }
    }
}
