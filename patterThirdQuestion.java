class Array{
    public static void main(String[] args) {
        int count=0;
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                count++;           //why count ++ printed 1 in starting and then 2 and 3 in a single line. And how does it works?
                System.out.print(count+" ");
            }System.out.println(" ");
        }
    }
}
