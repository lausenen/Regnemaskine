public class Myndighedstjekkeren {
    public static void main(String[] args) {
        java.util.Scanner brugerinput = new java.util.Scanner(System.in);
        int alder = brugerinput.nextInt();
    if (alder >= 18) {
        System.out.println("Du er myndig");
    }
    else {
        System.out.println("Du er ikke myndig");
    }

    }
}