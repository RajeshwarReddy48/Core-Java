import java.lang.*;
public class HandlerArithmeticException  
{  
void divide(int a, int b)   
{  
int res;  
try  
{  
// performing divison and storing th result  
res = a / b;  
System.out.println("Division process has been done successfully.");  
System.out.println("Result came after division is: " + res);  
}  
// handling the exception in the catch block  
catch(Exception ex)  
{  
System.out.println("Should avoid dividing by 0 " + ex);  
}  
  
  
}  
  
// main method  
public static void main(String argvs[])  
{  
// creating an object of the class ArithmeticException  
HandlerArithmeticException obj = new HandlerArithmeticException();  
obj.divide(1, 0);  
}  
}  