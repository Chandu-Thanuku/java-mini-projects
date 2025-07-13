 class Methods {
    public static void main(String args[]){
        double a=1;
        double b=9.234;
        add(a,b);
        int num=2;
        mutliplication(num);
    }
    static void add(double a,double b){
        System.out.println(a+b);

    }
    static void mutliplication(int num){
        for(int i=1;i<=10;i++) {
            System.out.println(num+" x "+i+" = "+(num*i));
        }

    }
}
