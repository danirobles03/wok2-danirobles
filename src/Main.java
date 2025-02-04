import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double fix = scan.nextDouble();
        double ventas = scan.nextDouble();
        double porcentaje = scan.nextDouble();
        double resultat1 = aplica_percentatge(ventas, porcentaje);
        double bonus5 = scan.nextDouble();
        int any1 = scan.nextInt();
        int any2 = scan.nextInt();
        int resultat2 = quinquenis(any1, any2);
        double resultatfinal = sou(fix, resultat1, resultat2, bonus5);
        System.out.print(resultatfinal);
    }
    public static double aplica_percentatge(double ventas, double porcentaje) {
        return (ventas*porcentaje/100);
    }
    public static int quinquenis(int any1, int any2) {
        return (any2-any1)/5;
    }
    public static double sou(double fix, double resultat1, int resultat2, double bonus5) {
        return fix+resultat1+resultat2*bonus5;
    }
}
