class calculator{
   int add(int n1, int n2){
    int sum= n1+n2;
    return sum;
 }
}
class first{
    public static void main(String args[]){
        int num1=5;
        int num2=6;
        calculator cal= new calculator();
        int result =cal.add(num1,num2);
        System.out.println(result);

    }
}