class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 100:");

        for (int num = 1; num <= 100; num++) {
         
            if ((num & 1) == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
