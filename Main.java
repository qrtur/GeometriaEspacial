import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int escolha;
        do {
            mostrarMenu();
            escolha = scanner.nextInt();
            String resultado = switch (escolha) {
                case 1 -> calcularAreaQuadrado(scanner);
                case 2 -> calcularAreaRetangulo(scanner);
                case 3 -> calcularAreaTriangulo(scanner);
                case 4 -> calcularAreaParalelogramo(scanner);
                case 5 -> calcularAreaLosango(scanner);
                case 6 -> calcularAreaTrapezio(scanner);
                case 7 -> calcularAreaCircunferencia(scanner);
                case 8 -> calcularAreaEVolumePrisma(scanner);
                case 9 -> calcularAreaEVolumeCilindro(scanner);
                case 10 -> calcularAreaEVolumePiramide(scanner);
                case 11 -> calcularAreaEVolumeCone(scanner);
                case 12 -> calcularAreaEVolumeTroncoCone(scanner);
                case 13 -> calcularAreaEVolumeTroncoPiramide(scanner);
                case 14 -> calcularAreaEVolumeEsfera(scanner);
                case 15 -> "caregandooo... tchau";
                default -> "Comando nãoo reconhecido :(";
            };
            System.out.println(resultado);
        } while (escolha != 15);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("=====> Operações <=====");
        System.out.println("(1)  Area do Quadrado!");
        System.out.println("(2)  Area do Retangulo!");
        System.out.println("(3)  Area do Triangulo!");
        System.out.println("(4)  Area do Paralelogramo!");
        System.out.println("(5)  Area do Losango!");
        System.out.println("(6)  Area do Trapezio!");
        System.out.println("(7)  Area da Circunferencia!");
        System.out.println("(8)  Area e Volume do Prisma!");
        System.out.println("(9)  Area e Volume do Cilindro!");
        System.out.println("(10) Area e Volume da Piramide!");
        System.out.println("(11) Area e Volume do Cone!");
        System.out.println("(12) Area e Volume do Tronco do Cone!");
        System.out.println("(13) Area e Volume do Tronco da Piramide!");
        System.out.println("(14) Area e Volume da Esfera!");
        System.out.println("(15) sair do programa :(");
        System.out.print("Escolha uma das opções: ");
    }

    private static String calcularAreaQuadrado(Scanner scanner) {
        System.out.println("Area do Quadrado");
        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaQuadrado(lado);
        return "A Area do quadrado e: " + area;
    }

    private static String calcularAreaRetangulo(Scanner scanner) {
        System.out.println("Area do Retangulo");
        System.out.print("Digite a base do retangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do retangulo: ");
        double altura = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaRetangulo(base, altura);
        return "A Area do retangulo e: " + area;
    }

    private static String calcularAreaTriangulo(Scanner scanner) {
        System.out.println("Area do Triangulo");
        System.out.print("Digite a base do triangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do triangulo: ");
        double altura = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaTriangulo(base, altura);
        return "A Area do triangulo e: " + area;
    }

    private static String calcularAreaParalelogramo(Scanner scanner) {
        System.out.println("Area do Paralelogramo");
        System.out.print("Digite a base do paralelogramo: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura do paralelogramo: ");
        double altura = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaParalelogramo(base, altura);
        return "A Area do paralelogramo e: " + area;
    }

    private static String calcularAreaLosango(Scanner scanner) {
        System.out.println("Area do Losango");
        System.out.print("Digite a diagonal maior do losango: ");
        double diagonalMaior = scanner.nextDouble();
        System.out.print("Digite a diagonal menor do losango: ");
        double diagonalMenor = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaLosango(diagonalMaior, diagonalMenor);
        return "A Area do losango e: " + area;
    }

    private static String calcularAreaTrapezio(Scanner scanner) {
        System.out.println("Area do Trapezio");
        System.out.print("Digite a base maior do trapezio: ");
        double baseMaior = scanner.nextDouble();
        System.out.print("Digite a base menor do trapezio: ");
        double baseMenor = scanner.nextDouble();
        System.out.print("Digite a altura do trapezio: ");
        double altura = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaTrapezio(baseMaior, baseMenor, altura);
        return "A Area do trapezio e: " + area;
    }

    private static String calcularAreaCircunferencia(Scanner scanner) {
        System.out.println("Area da Circunferencia");
        System.out.print("Digite o raio da circunferencia: ");
        double raio = scanner.nextDouble();
        double area = GeometriaPlana.calcularAreaCircunferencia(raio);
        return "A Area da circunferencia e: " + area;
    }

    private static String calcularAreaEVolumePrisma(Scanner scanner) {
        System.out.println("Area e Volume do Prisma");
        System.out.print("Digite o perímetro da base do prisma: ");
        double perimetroBase = scanner.nextDouble();
        System.out.print("Digite a Area da base do prisma: ");
        double areaBase = scanner.nextDouble();
        System.out.print("Digite a altura do prisma: ");
        double altura = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaPrisma(perimetroBase, areaBase, altura);
        double volume = GeometriaEspacial.calcularVolumePrisma(areaBase, altura);
        return "A Area do prisma e: " + area + "\nO volume do prisma e: " + volume;
    }

    private static String calcularAreaEVolumeCilindro(Scanner scanner) {
        System.out.println("Area e Volume do Cilindro");
        System.out.print("Digite o raio do cilindro: ");
        double raio = scanner.nextDouble();
        System.out.print("Digite a altura do cilindro: ");
        double altura = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaCilindro(raio, altura);
        double volume = GeometriaEspacial.calcularVolumeCilindro(raio, altura);
        return "A Area do cilindro e: " + area + "\nO volume do cilindro e: " + volume;
    }

    private static String calcularAreaEVolumePiramide(Scanner scanner) {
        System.out.println("Area e Volume da Piramide");
        System.out.print("Digite o perímetro da base da piramide: ");
        double perimetroBase = scanner.nextDouble();
        System.out.print("Digite a Area da base da piramide: ");
        double areaBase = scanner.nextDouble();
        System.out.print("Digite a altura da piramide: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite o apótema da piramide: ");
        double apotema = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaPiramide(perimetroBase, areaBase, apotema);
        double volume = GeometriaEspacial.calcularVolumePiramide(areaBase, altura);
        return "A Area da piramide e: " + area + "\nO volume da piramide e: " + volume;
    }

    private static String calcularAreaEVolumeCone(Scanner scanner) {
        System.out.println("Area e Volume do Cone");
        System.out.print("Digite o raio da base do cone: ");
        double raioBase = scanner.nextDouble();
        System.out.print("Digite a altura do cone: ");
        double altura = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaCone(raioBase, altura);
        double volume = GeometriaEspacial.calcularVolumeCone(raioBase, altura);
        return "A Area do cone e: " + area + "\nO volume do cone e: " + volume;
    }

    private static String calcularAreaEVolumeTroncoCone(Scanner scanner) {
        System.out.println("Area e Volume do Tronco do Cone");
        System.out.print("Digite o raio maior da base do tronco do cone: ");
        double raioMaior = scanner.nextDouble();
        System.out.print("Digite o raio menor da base do tronco do cone: ");
        double raioMenor = scanner.nextDouble();
        System.out.print("Digite a altura do tronco do cone: ");
        double altura = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaTroncoCone(raioMaior, raioMenor, altura);
        double volume = GeometriaEspacial.calcularVolumeTroncoCone(raioMaior, raioMenor, altura);
        return "A Area do tronco do cone e: " + area + "\nO volume do tronco do cone e: " + volume;
    }

    private static String calcularAreaEVolumeTroncoPiramide(Scanner scanner) {
        System.out.println("Area e Volume do Tronco da Piramide");
        System.out.print("Digite a Area da base maior do tronco da piramide: ");
        double areaBaseMaior = scanner.nextDouble();
        System.out.print("Digite a Area da base menor do tronco da piramide: ");
        double areaBaseMenor = scanner.nextDouble();
        System.out.print("Digite a altura do tronco da piramide: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite o apótema do tronco da piramide: ");
        double apotema = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaTroncoPiramide(areaBaseMaior, areaBaseMenor, altura, apotema);
        double volume = GeometriaEspacial.calcularVolumeTroncoPiramide(areaBaseMaior, areaBaseMenor, altura);
        return "A Area do tronco da piramide e: " + area + "\nO volume do tronco da piramide e: " + volume;
    }

    private static String calcularAreaEVolumeEsfera(Scanner scanner) {
        System.out.println("Area e Volume da Esfera");
        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();
        double area = GeometriaEspacial.calcularAreaEsfera(raio);
        double volume = GeometriaEspacial.calcularVolumeEsfera(raio);
        return "A Area da esfera e: " + area + "\nO volume da esfera e: " + volume;
    }
}
