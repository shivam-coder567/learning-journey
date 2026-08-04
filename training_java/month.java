class month{
    public static void main(String a[]){
        int month = Integer.parseInt(a[0]);
        if(month==1||month==12|| month==2){
            System.out.println("WINTER");
        }
         else if(month==3||month==4|| month==5){
            System.out.println("SPRING");
        }
         else if(month==6||month==7|| month==8){
            System.out.println("SUMMER");
        }
         else if(month==9||month==10|| month==11){
            System.out.println("AUTUMN");
        }
        else
            System.out.println("INVALID MONTH");
        
        }
    }
