package Calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        // Cria uma instância da classe Calculadora
        Calculadora calc = new Calculadora();

        // Chamadas normais aos métodos da calculadora usando o método "calcular"
        System.out.println(calc.calcular(2, 3,  "+"));  // Soma
        System.out.println(calc.calcular( 10, 4,  "-")); // Subtração
        System.out.println(calc.calcular( 3, 5,  "*"));  // Multiplicação
        System.out.println(calc.calcular( 8, 2,  "/"));  // Divisão

        // Teste de exceção: divisão por zero
        try {
            System.out.println(calc.calcular( 8, 0,  "/"));
        } catch (IllegalArgumentException e) {
            // Mostra a mensagem da exceção lançada pela Calculadora
            System.out.println(e.getMessage());
        }

        // Teste de exceção: operador inválido
        try {
            System.out.println(calc.calcular( 5,  5,  "x")); // operador inexistente
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
