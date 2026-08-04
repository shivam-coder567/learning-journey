 class Exceptions {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("EXCEPTION occurred.");
        }
        try {
            int arr[] = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("Invalid array index.");
        }
            String str = null;
            try{
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
        System.out.println("Program completed.");
    }
}