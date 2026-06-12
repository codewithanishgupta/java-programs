/*  13.Write a Java program to merge two arrays into a third array. */

public class mergeTwoArraysInOne {
    public static void main(String[] args) {
        
        int firstarr[]={1,2,3,4,5};
        int secondarr[]={6,7,8,9,10};
        int margearr[]=new int[firstarr.length+secondarr.length];
        for(int i=0;i<firstarr.length;i++){
            margearr[i]=firstarr[i];
        }

        for(int i=0;i<secondarr.length;i++){
            margearr[firstarr.length+i]=secondarr[i];
        }

        System.out.println("After marge Two arrays Elements are : ");
        for(int c : margearr){
            System.out.println(c);
        }
    }
}
