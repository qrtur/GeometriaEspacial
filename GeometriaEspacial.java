public class GeometriaEspacial{
    private GeometriaEspacial() {}

    public static double calcularAreaPrisma(double perimetroBase, double areaBase, double altura) {
        return 2 * areaBase + perimetroBase * altura;
    }

    public static double calcularVolumePrisma(double areaBase, double altura) {
        return areaBase * altura;
    }

    public static double calcularAreaCilindro(double raio, double altura) {
        double areaBase = GeometriaPlana.calcularAreaCircunferencia(raio);
        double perimetroBase = GeometriaPlana.calcularPerimetroCircunferencia(raio);
        return 2 * areaBase + perimetroBase * altura;
    }

    public static double calcularVolumeCilindro(double raio, double altura) {
        return GeometriaPlana.calcularAreaCircunferencia(raio) * altura;
    }

    public static double calcularAreaPiramide(double perimetroBase, double areaBase, double apotema) {
        return areaBase + (perimetroBase * apotema) / 2;
    }

    public static double calcularVolumePiramide(double areaBase, double altura) {
        return (areaBase * altura) / 3;
    }

    public static double calcularAreaCone(double raio, double altura) {
        double geratriz = Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
        return Math.PI * raio * (raio + geratriz);
    }

    public static double calcularVolumeCone(double raio, double altura) {
        return (Math.PI * Math.pow(raio, 2) * altura) / 3;
    }

    public static double calcularAreaTroncoCone(double raioMaior, double raioMenor, double altura) {
        double geratriz = Math.sqrt(Math.pow((raioMaior - raioMenor), 2) + Math.pow(altura, 2));
        return Math.PI * (Math.pow(raioMaior, 2) + Math.pow(raioMenor, 2) + (raioMaior + raioMenor) * geratriz);
    }

    public static double calcularVolumeTroncoCone(double raioMaior, double raioMenor, double altura) {
        return (Math.PI * altura * (Math.pow(raioMaior, 2) + Math.pow(raioMenor, 2) + raioMaior * raioMenor)) / 3;
    }

    public static double calcularAreaTroncoPiramide(double areaBaseMaior, double areaBaseMenor, double altura, double apotema) {
        double perimetroBaseMaior = 4 * Math.sqrt(areaBaseMaior);
        double perimetroBaseMenor = 4 * Math.sqrt(areaBaseMenor);
        return areaBaseMaior + areaBaseMenor + (perimetroBaseMaior + perimetroBaseMenor) * apotema / 2;
    }

    public static double calcularVolumeTroncoPiramide(double areaBaseMaior, double areaBaseMenor, double altura) {
        return (altura * (areaBaseMaior + areaBaseMenor + Math.sqrt(areaBaseMaior * areaBaseMenor))) / 3;
    }

    public static double calcularVolumeEsfera(double raio) {
        return (4 * Math.PI * Math.pow(raio, 3)) / 3;
    }

    public static double calcularAreaEsfera(double raio) {
        return 4 * Math.PI * Math.pow(raio, 2);
    }
}
