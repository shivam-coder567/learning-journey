class updated{
    public static void main(String args[]){
        String day ="Monday";
        String result = " ";
        switch(day){
        case "Sunday", "Saturday" -> System.out.println("Wake up at 10am.");
        case "Monday"-> System.out.println("Wake up at 6am.");
        default -> System.out.println("Wake up at 7am.");
        } 
        // if u want to colon then used yeild at -> this.
        result = switch(day){
        case "Sunday", "Saturday" -> "10am";
        case "Monday"->"6am";
        default -> "7am";
        };
        System.out.println(result);
    }
}