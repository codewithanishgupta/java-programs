// class Parent {
//     private Parent() {
//         System.out.println("Private Parent constructor...");
//     }
// }

//  Child can extend Parent, but cannot create object
// //class Child extends Parent {
//     void sum() {
//         System.out.println("Child method...");
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         // ❌ Compilation error if you try: Child c = new Child();
//         // ✅ But you can still use Child in abstract sense (no object creation)
//     }
// }
