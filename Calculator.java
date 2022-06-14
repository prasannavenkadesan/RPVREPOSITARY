package test1package;

public class Calculator {
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int a = obj.addTwoNumbers(5, 5);
		System.out.println(a);
		float b = obj.subTwoNumbers(2, 1);
		System.out.println(b);
		double c = obj.multiplyThreeNumbers(2, 3, 4);
		System.out.println(c);
		int d = obj.divideTwoInteger(6, 3);
		System.out.println(d);
		
	}
	
public int addTwoNumbers(int a,int b)
{
		return a +b;}
	public float subTwoNumbers(float a,float b) {
		return a-b;}
		public double multiplyThreeNumbers (double a,double b,double c) {
			return a*b*c;}
			public int divideTwoInteger (int a,int b) {
				return a/b;}
		}

