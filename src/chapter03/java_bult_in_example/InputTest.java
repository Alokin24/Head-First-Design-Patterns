package chapter03.java_bult_in_example;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {

        int c;
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("C:\\Users\\nianasta\\Desktop\\IdeaProjects\\HeadFirstDesignPatterns\\src\\chapter03\\java_bult_in_example\\test.txt")
                            )
                    );

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
