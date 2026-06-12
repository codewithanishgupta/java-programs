/*  23.
Print the following pattern:
1
12
123
1234
12345
 */

public class three {
         public static void main(String arg[]){
        for(int i=1;i<6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
