package appilcation;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();

        System.out.println("Entre com a largura e altura do retângulo:");
        rec.width = sc.nextDouble();
        rec.height = sc.nextDouble();

        System.out.println(rec);


    }
}
