#include <iostream>

using namespace std;

int main(int argc, char * argv[])
{
    int ISBN = atoi(argv[1]);
    int sum = 0;
    int digit;
    int checksum;

        for (int i = 2; i <= 10; i++)
        {
            digit = ISBN % 10;
            sum += (i * digit);
            ISBN /= 10;
        }
        if (sum % 11 == 1)
            cout << "X" << endl;
        else if (sum % 11 == 0)
            cout << "0" << endl;
        else 
        {
            checksum = 11 - (sum % 11);
            cout << checksum << endl;
        }
}