import java.util.*;

public class DES {
    public static void main(String[] args) {
        System.out.println("Please enter the plaintext followed by the encryption key!");
        Scanner scan = new Scanner(System.in);

        String plainText[] = new String[63];
        for(int i = 0; i < plainText.length; i++){
            plainText[i] = scan.next();
        }

        String key[] = new String[63];
        for(int i = 0; scan.hasNext(); i++){
            if(i%7 == 0){
                int count = 0;
                for(int j = 0; j < i; j++){
                    if(key[j].equals("1")){
                        count++;
                    }
                }

                if(count%2 == 0){
                    key[i] = "0";
                }
                else{
                    key[i] = "1";
                }
            }
            else{
                key[i] = scan.next();
            }
        }
        scan.close();
    }
}
