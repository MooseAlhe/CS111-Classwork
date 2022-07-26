#include <iostream>

using namespace std;

int main(int argc, char * argv[])
{
    double min1 = atof(argv[1]); //first smallest
    double min2 = atof(argv[2]); //second smallest
    double num;

    if (min1 > min2) //switches values
    {
        double temp = min1; 
        min1 = min2;
        min2 = temp;
    }
    for (int i = 3; i < argc - 1; i++)   
    {
        num = atof(argv[i]);
        if (num < min1)
        {
            min2 = min1;
            min1 = num;
        }
        else if (num < min2)
        {
            min2 = num;
        }
    }
    cout << min1 << endl;
    cout << min2 << endl;
}