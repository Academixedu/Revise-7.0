import java.util.Scanner;

public class App {
    public static void m1(){
        System.out.println("This is static");
    }
    public static int compare(int a,int b){
    if(a>b){
        return a;
    }
    else{
        return b;
    }
    }
    public static void main(String[] args) throws Exception {
       int a;
       int b;
       System.out.println("Please Enter Number A");
       Scanner in=new Scanner(System.in);
       a=in.nextInt();
       System.out.println("Please Enter B");
       b=in.nextInt();
       if(a>b){
        System.out.println("A is Greater than B");
       }
       else{
        System.out.println("B is Greater than A");
       }
// loops
for(int i=0;i<a;i++){
    System.out.println(a);
}
int counter=0;
while(counter<b){
    System.out.println(b);
    counter++;
}
App.m1();
System.out.println("App compare");
System.out.println(App.compare(a, b));
Student std=new Student("Chanakya", 1);
System.out.println(std.sname);
System.out.println(std.getSid());
Son son=new Son();
son.name();
son.surname();
    }
}
