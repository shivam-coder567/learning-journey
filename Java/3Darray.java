class _3Darray{
    public static void main(String a[]){
        int num[][][]= new int[3][4][5];
        for(int i=0; i<3;i++){
            for(int j=0; j<4;j++){
                for(int k=0; k<5; k++){
                num[i][j][k]=(int)(Math.random()*10);
            }
            }
        }
        for(int n[][]: num){
            for(int m[]:n)
            {
                for(int x:m){

                
                
                System.out.print(x+" ");
            }
             System.out.println();
            }
             System.out.println();

        }
    }
}