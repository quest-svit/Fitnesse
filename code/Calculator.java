package code;

public class Calculator{

public Calculator()
{}

public int add(int num1,int num2) {return num1 + num2;}

public int sub(int num1,int num2) {return num1 - num2;}
public int mul(int num1,int num2) {return num1 * num2;}
public double div(int num1 ,int num2){ 
	double res = -1;
	if (num2 != 0 ) 
		{res = num1/ num2;}

	return res;
}
}
