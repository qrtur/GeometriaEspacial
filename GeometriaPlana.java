public class GeometriaPlana  {
    private GeometriaPlana() {}

    public static double calcularAreaQuadrado(double lado) {
        return lado * lado;
    }
    public static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    public static double calcularAreaParalelogramo(double base, double altura) {
        return base * altura;
    }
    public static double calcularAreaLosango(double diagonalMaior, double diagonalMenor) {
        return (diagonalMaior * diagonalMenor) / 2;
    }
    public static double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) {
        return ((baseMaior + baseMenor) * altura) / 2;
    }
    public static double calcularAreaCircunferencia(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }
    public static double calcularPerimetroQuadrado(double lado) {
        return 4 * lado;
    }
    public static double calcularPerimetroRetangulo(double base, double altura) {
        return 2 * (base + altura);
    }
    public static double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }
    public static double calcularPerimetroCircunferencia(double raio) {
        return 2 * Math.PI * raio;
    }
}
