package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> numeros = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int numero = sc.nextInt();
            numeros.add(numero);
        }

        Iterator<Integer> integerIterator = numeros.iterator();

        System.out.println("Listar dados do set: ");
        while(integerIterator.hasNext()) {
            System.out.println(integerIterator.next());
        }
    }
}