import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();
        int opcion = 0;

        String menu = """
                ************************************************
                Sea bienvenido/a al Conversor de Moneda =]
                                
                1) Dólar =>> Peso Argentino
                2) Peso Argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso Chileno
                6) Peso Chileno =>> Dólar
                7) Salir
                Elija una opción válida
                ************************************************
                """;

        while (opcion != 7) {
            System.out.println(menu);
            try {
                opcion = lectura.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese el valor que desea convertir");
                        var cantidad = lectura.nextInt();
                        System.out.println("El valor " + cantidad +
                                " [USD] corresponde al valor final de =>>>>> " +
                                consulta.conversorMoneda("USD", "ARS", cantidad) + " [ARS]");
                        break;
                    case 2:
                        System.out.println("Ingrese el valor que desea convertir");
                        var cantidad2 = lectura.nextInt();
                        System.out.println("El valor " + cantidad2 +
                                " [ARS] corresponde al valor final de =>>>>> " +
                                consulta.conversorMoneda("ARS", "USD", cantidad2) + " [USD]");
                        break;
                    case 3:
                        System.out.println("Ingrese el valor que desea convertir");
                        var cantidad3 = lectura.nextInt();
                        System.out.println("El valor " + cantidad3 +
                                " [USD] corresponde al valor final de =>>>>> " +
                                consulta.conversorMoneda("USD", "BRL", cantidad3) + " [BRL]");
                        break;
                    case 4:
                        System.out.println("Ingrese el valor que desea convertir");
                        var cantidad4 = lectura.nextInt();
                        System.out.println("El valor " + cantidad4 +
                                " [BRL] corresponde al valor final de =>>>>> " +
                                consulta.conversorMoneda("BRL", "USD", cantidad4) + " [USD]");
                        break;
                    case 5:
                        System.out.println("Ingrese el valor que desea convertir");
                        var cantidad5 = lectura.nextInt();
                        System.out.println("El valor " + cantidad5 +
                                " [USD] corresponde al valor final de =>>>>> " +
                                consulta.conversorMoneda("USD", "CLP", cantidad5) + " [CLP]");
                        break;
                    case 6:
                        System.out.println("Ingrese el valor que desea convertir");
                        var cantidad6 = lectura.nextInt();
                        System.out.println("El valor " + cantidad6 +
                                " [CLP] corresponde al valor final de =>>>>> " +
                                consulta.conversorMoneda("CLP", "USD", cantidad6) + " [USD]");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un numero valido");
                break;
            }
        }
    }
}
