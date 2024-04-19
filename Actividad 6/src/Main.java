import java.util.InputMismatchException;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        double[] Array = new double[i+1];
        boolean R= true;

        while (R) {
            try {
                System.out.println("Seleccione la figura geométrica:");
                System.out.println("1. Círculo");
                System.out.println("2. Cuadrado");
                System.out.println("3. Triángulo");
                System.out.println("4. Rectángulo");
                System.out.println("5. Pentágono");

                short e = sc.nextShort();

                switch (e) {
                    case 1:
                        System.out.println("Seleccione 'p' para calcular el perímetro o 'a' para calcular el área:");
                        char a;
                        a = sc.next().charAt(0);
                        if (a == 'p') {
                            System.out.println("Introduzca el valor del diametro(cm)");
                            double d = sc.nextDouble();
                            d = 3.1416 * d;
                            Array[i] = d;
                            System.out.println("El valor del perimetro es: " + d + "cm");
                        } else {
                            System.out.println("Introduzca el valor del radio(cm)");
                            double r = sc.nextDouble();
                            r = 3.1416 * (r * r);
                            Array[i] = r;
                            System.out.println("El valor del area es: " + r + "cm2");
                        }
                        break;
                    case 2:
                        System.out.println("Seleccione 'p' para calcular el perímetro o 'a' para calcular el área:");
                        a = sc.next().charAt(0);
                        if (a == 'p') {
                            System.out.println("Introduzca el valor del lado del cuadrado(cm)");
                            double d = sc.nextDouble();
                            d = d + d + d + d;
                            Array[i] = d;
                            System.out.println("El valor del perimetro es: " + d + "cm");
                        } else {
                            System.out.println("Introduzca el valor del lado del cuadrado(cm)");
                            double r = sc.nextDouble();
                            r = r * r;
                            Array[i] = r;
                            System.out.println("El valor del area es: " + r + "cm2");
                        }
                        break;
                    case 3:
                        System.out.println("Seleccione 'p' para calcular el perímetro o 'a' para calcular el área:");
                        a = sc.next().charAt(0);
                        if (a == 'p') {
                            System.out.println("Introduzca el valor del primer lado(cm)");
                            double d = sc.nextDouble();
                            System.out.println("Introduzca el valor del segundo lado(cm)");
                            double t = sc.nextDouble();
                            System.out.println("Introduzca el valor del tercer lado(cm)");
                            double f = sc.nextDouble();
                            d = d + t + f;
                            Array[i] = d;
                            System.out.println("El valor del perimetro es: " + d + "cm");
                        } else {
                            System.out.println("Introduzca el valor de la base(cm)");
                            double r = sc.nextDouble();
                            System.out.println("Introduzca el valor de la altura(cm)");
                            double h = sc.nextDouble();
                            r = (r * h) / 2;
                            Array[i] = r;
                            System.out.println("El valor del area es: " + r + "cm2");
                        }
                        break;
                    case 4:
                        System.out.println("Seleccione 'p' para calcular el perímetro o 'a' para calcular el área:");
                        a = sc.next().charAt(0);
                        if (a == 'p') {
                            System.out.println("Introduzca el valor del lado horizontal(cm)");
                            double d = sc.nextDouble();
                            System.out.println("Introduzca el valor del lado vertical(cm)");
                            double t = sc.nextDouble();
                            d = (d * 2) + (t * 2);
                            Array[i] = d;
                            System.out.println("El valor del perimetro es: " + d + "cm");
                        } else {
                            System.out.println("Introduzca el valor de la base(cm)");
                            double r = sc.nextDouble();
                            System.out.println("Introduzca el valor de la altura(cm)");
                            double h = sc.nextDouble();
                            r = r * h;
                            Array[i] = r;
                            System.out.println("El valor del area es: " + r + "cm2");
                        }
                        break;
                    case 5:
                        System.out.println("Seleccione 'p' para calcular el perímetro o 'a' para calcular el área:");
                        a = sc.next().charAt(0);
                        if (a == 'p') {
                            System.out.println("Introduzca el valor de los lados(cm)");
                            double d = sc.nextDouble();
                            d = d * 5;
                            Array[i] = d;
                            System.out.println("El valor del perimetro es: " + d + "cm");
                        } else {
                            System.out.println("Introduzca el valor del perimetro(cm)");
                            double r = sc.nextDouble();
                            System.out.println("Introduzca el valor de la apotema(cm)");
                            double h = sc.nextDouble();
                            r = (r * h) / 2;
                            Array[i] = r;
                            System.out.println("El valor del area es: " + r + "cm2");
                        }
                        break;
                    default:
                        System.out.println(("Por favor, introduzca una opcion valida"));
                }
            }
            catch (InputMismatchException x) {
                System.out.println("Por favor, ingresa una opcion valida");
            }
            i++;
            sc.nextLine();
            System.out.println("Desea realizar otra accion? (y/n): ");
            char a = sc.next().charAt(0);
            if (a == 'n')
            {R = false;}
        }
    }
}
