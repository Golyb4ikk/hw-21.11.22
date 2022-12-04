public class Main {
    public static void main(String[] args) {
    //zadacha 1
        for(int i=1;i<11;i++)
        System.out.println(i);
     //zadacha 2
        for(int y=10;y>0;y--)
            System.out.println(y);
        //zadacha 3
        for(int u=0;u<18;u=u+2)
            System.out.println(u);
        //zadacha 4
        for(int z=10;z>-10;z--)
            System.out.println(z);
        //zadacha 5
        for(int q=1904;q<2096;q=q+4)
            System.out.println("Год" + q + "високосный");

        //zadacha 6
        for(int l=0;l<100;l=l+7)
            System.out.println(l);
        //zadacha 7

        for(int m=1;m<513;m=m*2)
            System.out.println(m);

        //zadacha 8
        int sal=29000;
        int all=0;
        for(int i=0;i<12;i++){
            all=sal+all;
            System.out.println("За год вышло "+ all);
        }
        //zadacha 9
        int sal2=29000;
        int all2=0;

        for(int i=0;i<12;i++){
            int procenti=all2/100;
            all2=all2+procenti+sal2;
            System.out.println("За год вышло "+ all2);
        }




    }
}