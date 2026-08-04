class computer{
     public void Play_music(){
        System.out.println("Playing Music....");
    }
    public String getMePen(int cost){
        if(cost>=10)
        return "PEN";
        return "nothing";// we can also use else.
    }
}
class methods{
    public static void main(String a[]){
        computer obj = new computer();
        obj.Play_music();
        String str = obj.getMePen(1);
        System.out.println(str);
    }
}

