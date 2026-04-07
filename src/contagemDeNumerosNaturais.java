public class contagemDeNumerosNaturais {

    public static void main(String[] args) {

        for (var i = 1;i <= 100;i++ ) {  // for ( 1º-declarar variável ; 2º Define quando o laço termina ; 3º incrementar );
            System.out.println(i); // Vai imprimir os números de 1 a 100
        }

        for (var i = 1;i <= 100;i+=2 ) {
            System.out.println(i); // Imprimir os numeros ímpares somente
        }

        for (var i = 2;i <= 100;i+=2 ) {
            System.out.println(i); // Imprimir os numeros pares somente
        }

    }

}
