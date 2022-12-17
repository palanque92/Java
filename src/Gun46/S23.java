package Gun46;

public class S23 {
    public static void main(String[] args) {
        int[] stack = {10,20,30};
        int size=3;
        int idx=0;

        do{
            idx++;   // idx=1
        }while (idx >= size);  // 1 >= 3

        //idx=1
        System.out.println("The Top elemen : " + stack[idx]);  // 20

    }
}
