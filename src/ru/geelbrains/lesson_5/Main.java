package ru.geelbrains.lesson_5;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    System.out.println("Ваша задача угодать число");
	    int range = 30;
	    int number = (int)(Math.random() * range);
        plaerLevel(range, number);
        scanner.close();
    }

    private static void plaerLevel(int range, int number){
        while (true){
            System.out.println("Угадай число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number){
                System.out.println("Вы угадали.");
                break;
            } else if(input_number > number){
                System.out.println("Загаданное число меньше");
            }else {
                System.out.println("Загаданное число больше");
            }
        }
    }
}
