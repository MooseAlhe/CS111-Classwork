#include<iostream>

double function(double x) 
{
	return (x * x * x) + x - 5;
}
void bisection(double a, double b, double tol)
{
	if (function(a) * function(b) >= 0)
	{
		std::cout << "No solution for this combination";
		return;
	}
	double c = a;
	while ((b - a) >= tol) 
	{
		c = (a + b) / 2;
		if (function(c) == 0.0)
			break;
		else if (function(c) * function(a) < 0)
			b = c;
		else
			a = c;
	}
	std::cout << "Value of the root is : " << c << "\n";

}
int main()
{
	double a;
	double b;
	double tol;
	std::cout << "Desired accuracy of the approximation (Tolerance):  ";
	std::cin >> tol;
	std::cout << " Left Endpoint:  ";
	std::cin >> a;
	std::cout << "Right Endpoint:  ";
	std::cin >> b;
	
	bisection(a, b, tol);
	
}
