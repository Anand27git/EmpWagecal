public class EmpDailyWage
{
public static void main(String args[])
{
System.out.println("Welcome to Employee Wage calculation");
 
int IS_FULL_TIME=1;
int WORKING_HOUR =20;

int empHrs=0;
int empWage=0;
double empCheck = Math.floor(Math.random() * 10) %2;

if  (empCheck == IS_FULL_TIME)
{
	empHrs=8;
	System.out.println("Employee is present");
}
else
{
	empHrs=0;
	System.out.println("Employee is Absent");
}
empWage=empHrs*WORKING_HOUR;
System.out.println("Employee Wage:"+ empWage);
}
}

