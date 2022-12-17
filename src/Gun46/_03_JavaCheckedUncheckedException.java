package Gun46;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _03_JavaCheckedUncheckedException {
    public static void main(String[] args) {
        String str = "";

        char ilkHarf = str.charAt(0);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            FileInputStream file = new FileInputStream("liste.text");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        }
    }
}
