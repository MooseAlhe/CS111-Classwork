/*Given the temperature T (in degrees Fahrenheit) and the wind speed v 
(in miles per hour), the National Weather Service defines the effective temperature 
(the wind chill) as follows:
w = 35.74 + 0.6215 T + (0.4275 T – 35.75) v^0.16
Write a C++ program that takes two double command-line arguments temperature and 
velocity and prints the wind chill. */

#include <iostream>
#include <cmath>
using namespace std;

int main(int argc, char * argv[])
{
    double T = atof(argv[1]);
    double v = atof(argv[2]);
    double w = 35.74 + (0.6215*T) + ((0.4275*T) - 35.75)*pow(v,0.16);
    cout << w << endl;
    return 0;
}