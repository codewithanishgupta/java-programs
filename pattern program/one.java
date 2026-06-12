/* 21.
Print the following pattern:
*
**
***
****
*****
 */

public class one {
    public static void main(String arg[]){
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
