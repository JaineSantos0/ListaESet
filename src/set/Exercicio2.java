package set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> integerSet = new HashSet<>();

        integerSet.add(2);
        integerSet.add(5);
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(9);
        integerSet.add(7);
        integerSet.add(8);
        integerSet.add(10);
        integerSet.add(6);

        System.out.print("Digite o número: ");
        int numero = sc.nextInt();

        if (integerSet.contains(numero)) {
            System.out.println("O número " + numero + " foi encontrado!");
        } else {
            System.out.println("O número " + numero + " não foi encontrado!");
        }
    }
}