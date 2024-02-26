import java.util.*;
public class Calculator{
    public static int num1,num2,choice=0;
    public static float ans;
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("\nPreviously performed operation are:\n");
        sb.ensureCapacity(200);
       
       do{        

            System.out.println("\n*******OPERATIONS*******");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.History");
            System.out.println("6.Exit");
            Scanner s3=new Scanner(System.in);
            choice=s3.nextInt();

            if(choice!=5 && choice!=6){
            System.out.println("Enter Number 1:");
            Scanner s1= new Scanner(System.in);
            num1=s1.nextInt();
        
            System.out.println("Enter Number 2:");
            Scanner s2= new Scanner(System.in);
            num2=s2.nextInt();
            }
        
        Calculator a=new Calculator();

    
            
        switch (choice) {
            case 1:
                if(choice==1)  
                    a.add();
                    sb.append("Addition:       "+num1+"+"+num2+"="+ans+"\n");
                break;
            case 2:
                if(choice==2)
                    a.sub();
                    sb.append("Subtraction:    "+num1+"-"+num2+"="+ans+"\n");
                break;
            case 3:
                if(choice==3)
                    a.mul();
                    sb.append("Multiplication: "+num1+"*"+num2+"="+ans+"\n");
                break;
            case 4:
                if(choice==4)
                    a.div();
                    sb.append("Division:       "+num1+"/"+num2+"="+ans+"\n");
                break; 
            case 5:
                if(choice==5)
                    System.out.println(sb);  
                break;
            case 6:
                if(choice==6)
                break;
            default:
                System.out.println("Enter valid value");
                break;
        }
        
        
    }while(choice!=6);
    
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
            ans=num1/(float)num2;
            System.out.println("\nDivision is :" + ans);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        
    }
}