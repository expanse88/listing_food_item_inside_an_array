import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;


        Scanner input = new Scanner(System.in);
        System.out.println("How many food items do you want?");
        size = input.nextInt();
        input.nextLine();
        String[] foods = new String[size];
        for(int i = 0 ;i<foods.length;i++){
            System.out.println("Enter the name of food item:");
            foods[i] = input.nextLine();
        }
        System.out.println();
        for(String food : foods){

            System.out.println(food);
        }

    }}

