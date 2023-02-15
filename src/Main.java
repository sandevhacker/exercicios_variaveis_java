

/* 1. Escreva um programa Java que faça o seguinte: declare uma variável do tipo int N, uma variável A do tipo double e uma variável C do
tipo char e atribui a cada um valor. Abaixo mostra na tela:
O valor de cada variável.
A soma de N + A
A diferença de A - N
O valor numérico correspondente ao caractere que contém a variável C. */


public class Main {

    public static void main (String [] args){


        /* 1. Escreva um programa Java que faça o seguinte: declare uma variável do tipo int N, uma variável A do tipo double e uma variável C do
tipo char e atribui a cada um valor. Abaixo mostra na tela:
O valor de cada variável.
A soma de N + A
A diferença de A - N
O valor numérico correspondente ao caractere que contém a variável C.
Se, por exemplo, dermos a N o valor 5, A o valor 4,56 e C o valor 'a', deve aparecer na tela:
Variavel N = 5
Variavel A = 4.56
Variavel C = a
5 + 4.56 = 9.559999999999999
4.56 - 5 = -0.4400000000000004
Valor numérico do carácter a = 97*/


        int ns = 20;
        double a = 5.0;
        char c = 'a';


        System.out.println(ns + a);
        System.out.println(a - ns);
        System.out.println(c);

       /* 2. Escreva um programa Java que faça o seguinte: declare duas variáveis X e Y de tipo int, duas variáveis N e M do tipo double e atribui
        um valor a cada uma. Abaixo mostra na tela:
        O valor de cada variável.
                A soma X + Y A diferença X - Y Produto X * Y A relação X / Y
        O resto X% Y A soma N + M A diferença N - M O produto N * M
        A relação N / M O resto N% M A soma X + N A relação Y / M
        O resto Y% M Dobre cada variável A soma de todas as variáveis O produto de todas as variáveis */

        int x = 10;
        int y = 2;
        double m = 7.5;
        double n = 5.5;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        System.out.println(n + m);
        System.out.println(n - m);
        System.out.println(n * m);
        System.out.println(n / m);
        System.out.println(n % m);
        System.out.println(x + n);
        System.out.println(y / m);
        System.out.println(y % m);
        System.out.println(x + y + m + n);


        /* 3. Escreva um programa Java que declare uma variável inteira N e atribua um valor a ela.
        Em seguida, escreva as instruções que executam o seguinte:

        Valor inicial de N Aumente N em 77. Diminua em 3. Dobre seu valor.
        Se, por exemplo, N = 1, a saída do programa será:
        Valor inicial de N = 1 N + 77 = 78 N - 3 = 75 N * 2 = 150

        Crie um programa Java que declara quatro variáveis inteiras A, B, C e D e
        atribui um valor a cada uma. Em seguida, siga as instruções necessárias para que:

        B pegue o valor de C C pegue o valor de A A pega o valor de D D pegue o valor de B
        Se, por exemplo, A = 1, B = 2, C = 3 e D = 4, o programa deve mostrar:
        A = 1 B = 2 C = 3 D = 4
        B pega valor de C -> B = 3 C pega valor de A -> C = 1 A pega valor de D -> A = 4 D
        pega valor de B -> D = 2 */


    int d = 20;

            System.out.println( d = d + 77);
            System.out.println(d);
            System.out.println(d = d * 2);


      int k = 5, f= 10, h = 15, j = 20;
        System.out.println(k);
        System.out.println(f);
        System.out.println(h);
        System.out.println(j);

        f=h;
        System.out.println(f);
        h=k;
        System.out.println(h);
        k=j;
        System.out.println(k);
        j=f;
        System.out.println(j);
    }

}