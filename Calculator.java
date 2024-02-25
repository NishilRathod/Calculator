import java.util.*;
public class Calculator{
    public static int num1,num2,choice,ans;
    public static void main(String[] args){
       
        
        System.out.println("Enter Number 1:");
        Scanner s1= new Scanner(System.in);
        num1=s1.nextInt();
        
        System.out.println("Enter Number 2:");
        Scanner s2= new Scanner(System.in);
        num2=s2.nextInt();        

            System.out.println("*******OPERATIONS*******");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            
            Scanner s3=new Scanner(System.in);
            choice=s3.nextInt();
        
        Calculator a=new Calculator();

    
            
        switch (choice) {
            case 1:
                if(choice==1)  
                    a.add();
                break;
            case 2:
                if(choice==2)
                    a.sub();
                break;
            case 3:
                if(choice==3)
                    a.mul();
                break;
            case 4:
                if(choice==4)
                    a.div();
                break;   
            default:
                System.out.println("Enter valid value");
                break;
            }
        
        s1.close();
        s2.close();
        s3.close();
    }
    public void add(){
        ans=num1+num2;
        System.out.println("\nAddition is :" + ans);
    }
    public void sub(){
        ans=num1-num2;
        System.out.println("\nSubtraction is :" + ans);
    }
    public void mul(){
        ans=num1*num2;
        System.out.println("\nMultiplication is :" + ans);
    }
    public void div(){
        try{
            ans=num1/num2;
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("\nDivision is :" + ans);
    }
}