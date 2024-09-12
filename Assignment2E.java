import java.io.*;
public class CommandLineCalculator
{
public static void main(String[] args) 
{
if (args.length != 3) 
{
System.out.println("CommandLineArgument");
return;
}
String operation = args[0];
double num1 =
Double.parseDouble(args[1]);
double num2 = Double.parseDouble(args[2]);
double result = 0;
switch (operation) 
{
case "1":
result = num1 + num2;
System.out.println("AdditionResult: " + result);
break;
case "2":
result = num1 - num2;
System.out.println("SubtractionResult: " + result);
break;
case "3":
result = num1 * num2;
System.out.println("Multiplication Result: " + result);
break;
case "4":
if (num2 == 0)
{
System.out.println("Error: Division by zero is not allowed."); } else { result = num1/num2;
System.out.println("Division Result:"+ result);
}
break;
default:
System.out.println("Invalid operation. Please choose 1 for Addition, 2 for Subtraction, 3 for Multiplication, or 4 for Division.");
}
}
}
