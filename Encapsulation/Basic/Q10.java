// 10.·  Create a Laptop class with private processor and ram.

import java.util.Scanner;

class Laptop {
    private String processor;
    private int ram;

    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }
    public int getRam() {
        return ram;
    }
}

class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop l = new Laptop();

        System.out.print("Enter Laptop Processor : ");
        l.setProcessor(sc.nextLine());

        System.out.print("Enter Laptop RAM (GB) : ");
        l.setRam(sc.nextInt());

        System.out.println("====== Laptop Details ======");
        System.out.println("Processor : " + l.getProcessor());
        System.out.println("RAM : " + l.getRam() + " GB");
    }
}
