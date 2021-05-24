public class EmpWage{

public static void main (String args[]) {

System.out.println("Welcome to Employee Wage calculation");

int IS_FullTime = 1;
double emplCheck = Math.floor(Math.random() *10) % 2;
if(emplCheck == IS_FullTime)
System.out.println("employee is present");
else
System.out.println("employee is absent");
       }
}

