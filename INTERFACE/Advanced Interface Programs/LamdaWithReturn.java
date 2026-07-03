// without return type
interface MyInterface {
    void add(int a,int b);
}

// with return type
interface Add {
    int sum(int x, int y);
}

public class LamdaWithReturn {
    public static void main(String[] args) {
        System.out.println("without return type");
        MyInterface obj = (a,b) -> {
            System.out.println(a+b);
        };
        obj.add(10, 20);

        System.out.println("With return type");
        Add obj2 = (x,y)-> x+y;
        System.out.println(obj2.sum(34, 20));
    }
}
