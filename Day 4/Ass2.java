class Ass2{
    public static void main(String[] args) {
        int a1[] = new int[5];
        a1[0]=1;
        a1[1]=2;
        a1[2]=3;
        a1[3]=4;
        a1[4]=5;

        for(int i=0;i<5;i++)
        {
            if(a1[i]%2 != 0)
            {

                System.out.print(a1[i]+"\t");
            }
        }

    }
}