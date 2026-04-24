package clases;

import java.util.Scanner;
import java.util.ArrayList;

public class test_class {

    public static void calculator(){
        double sum = 0;
        ArrayList<String> list = new ArrayList<>();
        list.add("+");
        list.add("-");
        list.add("/");
        list.add("*");

        boolean error = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ввдеите число: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("введите второе число: ");
        int number2 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("выберите действие (+ - / *): ");
        String action = scanner.nextLine();
        if(list.contains(action)){
            if(action.equals("+")){
                sum = (number + number2);
            }
            if(action.equals("-")){
                sum = (number - number2);
            }
            if (action.equals("*")){
                sum = (number * number2);
            }
            if (action.equals("/")){
                if(number2 != 0){
                    sum = (number / number2);
                }else {
                    System.out.println("Error: делить на 0 нельзя");
                    error = true;
                }
            }
            if (error == false){
                System.out.println("результат: " + sum);
            }
        }else {
            System.out.println("Error: не верное действие");
        }
    }
}