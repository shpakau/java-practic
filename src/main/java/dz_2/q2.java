package dz_2;

import java.io.FileWriter;
import java.io.IOException;

    public class q2 {
        public static void main(String[] args) {
            q2test();
        }
        public static void q2test() {
            String str="TEST";
            StringBuilder strResult=new StringBuilder();
            for (int i = 0; i < 99; i++) {
                strResult.append(str+" ");
            }

            try (FileWriter writer=new FileWriter("TEST.txt")){
                writer.write(String.valueOf(strResult));
            }
            catch (IOException e){
                System.out.println("Ошибка");
            }

        }
    }