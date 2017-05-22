package basiccal;
import java.util.Scanner;

public class BasicCalc
{
	
	String name;
	int a,b,ch;
	Scanner s=new Scanner(System.in);
	
	public BasicCalc()
        {
		
	}
	
	public int menu()
        {
    	System.out.println("------***------");
    	System.out.println("1: Addition");
    	System.out.println("2: Subtraction");
    	System.out.println("3: Multiplication");
    	System.out.println("4: Division");
    	System.out.println("------***------");
    	System.out.println("Enter your choice");
    	ch=s.nextInt();
    	return ch;
	}
	
    public void userInputs()
    {
    	System.out.println("Enter your name");
    	name=s.nextLine();
    	System.out.println("Welcome to the Basic Calculator designed by "+name);
    	System.out.println();
    	System.out.println("Enter first number");
    	a=s.nextInt();
    	System.out.println("Enter second number");
    	b=s.nextInt();
    	
    }

    public void performOperation()
{
    	
    	switch(ch){
    	
    	case 1:
    		System.out.println("Result: "+add());
    		break;
    	
    	case 2:
    		System.out.println("Result: "+subtract());
    		break;
    		
    	case 3:
    		System.out.println("Result: "+multiply());
    		break;
    		
    	case 4:
    		System.out.println("Result: "+divide());
    		break;
    		
    		default:
    			System.out.println("Invalid Selection");
        }
       
    }
    
	int add()
	{
		
		return a+b;	
	}
	
	int subtract()
	{
		return a-b;
		
	}
	
	int multiply()
	{
		
		return a*b;
	}
	
	int divide()
	{
		
		return a/b;
	}
	
	public static void main(String args[]){
		
		BasicCalc bc=new BasicCalc();
		bc.userInputs();
		bc.menu();
		bc.performOperation();
	}
	
}