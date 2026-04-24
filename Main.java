import clases.data;
import clases.test_class;

import java.util.Scanner;

public class Main {
    static String save_text = "";
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean working = true;
        while (working){
            System.out.println("выберите команду");
            String text = scanner.nextLine();
            switch (text){
                case "calculator":
                    test_class.calculator();
                    break;
                case "exit":
                    System.out.println("ок");
                    working = false;
                    break;
                case "help":
                    data.commands();
                    break;
                case "saved text":
                    Main.save_text();
                    break;
                default:
                    System.out.println("Error: такой команды не найдено");
            }
        }
    }

    public static void save_text(){

        Scanner scanner = new Scanner(System.in);
        boolean working = true;
        while (working){
            System.out.println("Выберите действие (save, remove, watch, exit): ");
            String text = scanner.nextLine();
            //scanner.nextLine();

            if (text.equals("save") || text.equals("remove") || text.equals("watch") || text.equals("exit")){
                if (text.equals("save")){
                    System.out.println("введите текст который хотите сохранить");
                    save_text = scanner.nextLine();
                    System.out.println("текст сохранён");
                }
                if (text.equals("remove")){
                    save_text = ("");
                    System.out.println("удалено");
                }
                if (text.equals("watch")){
                    if(save_text.equals("")){
                        System.out.println("пусто");
                    }else {
                        System.out.println(save_text);
                    }
                }
                if (text.equals("exit")){
                    System.out.println("выход из редактора");
                    working = false;
                }
            }else {
                System.out.println("Error: неизвестная команда");
            }
        }
    }
}