
public class UsingStringBuffer {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(System.identityHashCode(s1)); // get memory address of string before modify
        s1 = s1 + " world";
        System.out.println(System.identityHashCode(s1)); // get memory address of string after modify (address changes)


        StringBuffer s2 = new StringBuffer("Coding");
        System.out.println(System.identityHashCode(s2)); // get memory address of string before modify
        s2.append(" Ninjas");
        System.out.println(System.identityHashCode(s2)); // get memory address of string after modify (address remains same)


    }    
}
