

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Калькулятор работает с целыми арабскими цифрвми от 0 до 9");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: a + , - , * , / , b: ");
        String str = in.nextLine();
        // строковый массив переводим в символьный
        char[] charArray = str.toCharArray();


        char a = charArray[0];
        char b = charArray[2];
        // преобразуем char в int
        // c использованием метода getNumericValue
        // класса Character
        int a1 = Character.getNumericValue(a);
        int b1 = Character.getNumericValue(b);


        char c = charArray[1];

        // получаем кодировку символа *-+/ в юникоде
        int i = (int)c;

if(i == 42){
   int  sum = a1 * b1;
    System.out.println(sum);

}
        if(i == 43){
            int  sum = a1 + b1;
            System.out.println(sum);

        }
        if(i == 45){
            int  sum = a1 - b1;
            System.out.println(sum);

        }
        if(i == 47){
            int  sum = a1 / b1;
            System.out.println(sum);

        }



        }
    }

