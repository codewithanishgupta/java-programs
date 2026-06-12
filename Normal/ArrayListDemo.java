import java.util.ArrayList;

class ArrayListDemo{
    public static void main(String[] args) {
        ArrayList<Integer>   l = new ArrayList<Integer>();
        //int n=new Scanner(System.in).nextInt();
        // for(int i=0 ;i<n;i++){
        //     int val= new Scanner(System.in).nextInt();
        //     l.add(val);
        // }
        // for(int i=0 ;i<n;i++){
        //     System.out.println(l.get(i)); 
            
        // }
        // System.out.println("ArrayList : "+l);
        System.out.println("\\nnSize of list "+l.size());

        l.add(20);
        l.add(34);
        l.add(56);

        System.out.println("\n\nSize of list "+l.size());
        System.out.print("Element is : ");
        for(int i=0 ;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }

        // add data at position
        l.add(0,5);
        l.add(3,7);
        System.out.println("\n\nSize of list "+l.size());
        System.out.print("Element is after add posisions : ");
        for(int i=0 ;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }

        // set data

        l.set(3, 86);
        l.set(1, 33);
        System.out.println("\n\nSize of list "+l.size());
        System.out.print("Element is after set positions : ");
        for(int i=0 ;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }

        // remove or delete

        l.remove(3);
        l.remove(1);
        System.out.println("\n\nSize of list "+l.size());
        System.out.print("Element is after remove element : ");
        for(int i=0 ;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
        System.out.println("\n\nSize of list "+l.size());
        System.out.println("Arrays List Element : "+l);
    }
}