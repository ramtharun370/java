public class javaprg2 {

    public static void main(String[] args) {
        int i, n;
        int x[];
        

        System.out.println("Enter the number of elements:");
        n = Integer.parseInt(System.console().readLine());
        
        x = new int[n];
        
        for (i = 0; i < x.length; i++) {
            System.out.println("Enter an element:");
            x[i] = Integer.parseInt(System.console().readLine());
        }
        
        System.out.println("Your elements are:");
        for (i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}