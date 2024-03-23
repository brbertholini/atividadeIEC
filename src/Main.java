import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao conversos de Temperatura");
        System.out.println("Escolha a opção desejada");
        System.out.println("1. Converter Celcius para Fahrenheit");
        System.out.println("2. Converter Fahrenheit para Celsius");

        int opcao = scanner.nextInt();

        double temperatura;

        switch (opcao) {
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                temperatura = scanner.nextDouble();
                double fahrenheit = celsiusParaFahrenheit(temperatura);
                System.out.println("Aa temperatura em Fahrenheit é: " + fahrenheit);
                break;
            case 2:
                System.out.print("Digite a temperatura em Fahrenheit: ");
                temperatura = scanner.nextDouble();
                double celsius = fahrenheitParaCelsius(temperatura);
                System.out.println("Aa temperatura em Celsius é: " + celsius);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
        
        public static double celsiusParaFahrenheit(double celsius){
            return (celsius * 9 / 5) + 32;
        }

        public static double fahrenheitParaCelsius(double fahrenheit){
            return (fahrenheit - 32) * 5 / 9;
        }


}