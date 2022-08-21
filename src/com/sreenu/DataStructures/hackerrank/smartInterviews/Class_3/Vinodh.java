package com.sreenu.DataStructures.hackerrank.smartInterviews.Class_3;

/**
 * Created by SreenUNaik on 14-Aug-20.
 */
public class Vinodh {
    static int i =1;
    public static void main(String[] args) {
       /* int a=10,m=20,rs=4;
        System.out.println(balanceabc(a,m,rs));
        A bb = new A();
        bb.setC("ss");
        A cc = bb;
        cc.setC("rr");
        System.out.println(bb.toString());
        System.out.println(cc.toString());

        System.out.println(i+",");
      //  m(i);
        System.out.println(i);*/
      /* int a=2,b=3,c=4,d=5;
       float k = 4.3f;
        System.out.println(a++);*/
      find(4);
    }
static  void  find(int n){
        int a[] = new int[100];
        int i=0;
        while (n>0){
            a[i] = n%2;
            i++;
            n=n/2;
        }
    for (int j = i-1; j >=0 ; j--) {
        System.out.print(a[j]+" ");
    }
}
    public  void m(int i) {
        i = i+2;
    }

    private static int balanceabc(int a, int m, int rs) {
        if(a>m){
            int numMang = a-m;
            m= m+numMang;
            rs= rs-numMang;
            return rs;
        }else if(a<m){
            int numMang = m-a;
            m= m-numMang;
            rs= rs+numMang;
            return rs;
        }else {

            return rs;
        }
    }
   static class A{
        String c ;

        public String getC() {
            return c;
        }

        @Override
        public String toString() {
            return "A{" +
                    "c='" + c + '\'' +
                    '}';
        }

        public void setC(String c) {
            this.c = c;
        }
    }
}
