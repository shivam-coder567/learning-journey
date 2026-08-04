class day{
    public static void main(String a[]){
        int day =Integer.parseInt(a[0]);
        switch(day){
     case 1:
        System.out.println("SUNDAY");
        break;
    case 2:
        System.out.println("MONDAY");
        break;
    case 3:
        System.out.println("TUESDAY");
        break;
    case 4:
        System.out.println("WEDNESDAY");
        break;
    case 5:
        System.out.println("THURSDAY");
        break;
    case 6:
        System.out.println("FRIDAY");
        break;
    case 7:
        System.out.println("SATURDAY");
        break;
        default:
        System.out.println("invalid number");
         break;

    }
}
}