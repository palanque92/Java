package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class Ornek {
    // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
    // sadece tek sayı olan elemanlarını ayrı diziye atayarak
    // yazdırınız.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Please enter the number = ");
            int num = input.nextInt();
            numbers.add(num);
        }
        System.out.println("All numbers = " + numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 1)
                oddNumbers.add(numbers.get(i));
        }
        System.out.println("oddNumbers = " + oddNumbers);

    }

}
