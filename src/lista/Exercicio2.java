package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> integerList = new ArrayList<>();

        integerList.add(2);
        integerList.add(5);
        integerList.add(1);
        integerList.add(3);
        integerList.add(4);
        integerList.add(9);
        integerList.add(7);
        integerList.add(8);
        integerList.add(10);
        integerList.add(6);

        System.out.print("Digite o número: ");
        int numero = sc.nextInt();

        if (integerList.contains(numero)) {
            System.out.println("O número " + numero + " está localizado na posição: " + integerList.indexOf(numero));
        } else {
            System.out.println("O número " + numero + " não foi encontrado!");
        }
    }
}