import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static double obtenerCantidad(Scanner teclado) {

        System.out.println("Por favor ingrese la cantidad a convertir: ");
        double cantidad = teclado.nextDouble();
        return cantidad;

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ConsultaConversion consulta = new ConsultaConversion();

        int opcion = 0;

        System.out.println("*****************************************************");
        System.out.println("\nBienvenido/a al Conversor de Moneda =]");

        String menu = """
                \n1) Dólar =>> Peso Argentino
                2) Peso Argentino =>> Dólar
                3) Dólar =>> Real Brasileño
                4) Real Brasileño =>> Dólar
                5) Dólar =>> Peso Colombiano
                6) Peso Colombino =>> Dólar
                7) Salir
                
                Elija una opción valida:
                """;

        System.out.println("\n*****************************************************");

        while (opcion != 7) {

            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    double cantidadOne = obtenerCantidad(teclado);
                    String responseOne = consulta.seleccionOpcion(1);
                    double dolarAPesoArgentino = Conversor.conversionAPesoArgentino(cantidadOne, responseOne);
                    System.out.println("El resultado de la conversión de " + cantidadOne + " [USD] corresponde al valor final de =>>> " + dolarAPesoArgentino + " [ARS]");
                    teclado.nextLine();
                    break;

                case 2:
                    double cantidadTwo = obtenerCantidad(teclado);
                    String responseTwo = consulta.seleccionOpcion(2);
                    double pesoArgentinoADolar = Conversor.conversionAAmericanDolar(cantidadTwo, responseTwo);
                    System.out.println("El resultado de la conversión de " + cantidadTwo + " [ARS] corresponde al valor final de =>>> " + pesoArgentinoADolar + " [USD]");
                    teclado.nextLine();
                    break;

                case 3:
                    double cantidadThree = obtenerCantidad(teclado);
                    String responseThree = consulta.seleccionOpcion(1);
                    double dolarAReal = Conversor.conversionARealBrasileiro(cantidadThree, responseThree);
                    System.out.println("El resultado de la conversión de " + cantidadThree + " [USD] corresponde al valor final de =>>> " + dolarAReal + " [BRL]");
                    teclado.nextLine();
                    break;

                case 4:
                    double cantidadFour = obtenerCantidad(teclado);
                    String responseFour = consulta.seleccionOpcion(3);
                    double realADolar = Conversor.conversionAAmericanDolar(cantidadFour, responseFour);
                    System.out.println("El resultado de la conversión de " + cantidadFour + " [BRL] corresponde al valor final de =>>> " + realADolar + " [USD]");
                    teclado.nextLine();
                    break;

                case 5:
                    double cantidadFive = obtenerCantidad(teclado);
                    String responseFive = consulta.seleccionOpcion(1);
                    double dolarAPesoColombiano = Conversor.conversionAPesoColombiano(cantidadFive, responseFive);
                    System.out.println("El resultado de la conversión de " + cantidadFive + " [USD] corresponde al valor final de =>>> " + dolarAPesoColombiano + " [COP]");
                    teclado.nextLine();
                    break;

                case 6:
                    double cantidadSix = obtenerCantidad(teclado);
                    String responseSix = consulta.seleccionOpcion(4);
                    double pesoColombianoADolar = Conversor.conversionAAmericanDolar(cantidadSix, responseSix);
                    System.out.println("El resultado de la conversión de " + cantidadSix + " [COP] corresponde al valor final de =>>> " + pesoColombianoADolar + " [USD]");
                    teclado.nextLine();
                    break;

                case 7:
                    System.out.println("Gracias por utilizar nuestro conversor de moneda.");
                    break;

                default:
                    System.out.println("La opción ingresada no es valida.");
            }
        }

        try {
            var opcionConversion = Integer.valueOf(teclado.nextLine());
            String moneda = consulta.seleccionOpcion(opcionConversion);
            System.out.println(moneda);

        } catch (NumberFormatException e){

            if (opcion != 7) {

                System.out.println("Número no encontrado" + e.getMessage());

            }

        } catch (RuntimeException e){

            System.out.println(e.getMessage());
            System.out.println("Se ha finalizado la aplicación");

        }

    }

}
