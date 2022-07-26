#include <iostream>

using namespace std;

int main(int argc, char * argv[])
{
    int x = atoi(argv[1]);
    int y = atoi(argv[2]);
    int z = atoi(argv[3]);
    int a = atoi(argv[4]);
    int b = atoi(argv[5]);
    int max;

        if (x > y)
            max = x;
        else
            max = y;
        if (z > max)
            max = z;
        if (a > max)
            max = a;
        if (b > max)
            max = b;

        cout << max << endl;
        return 0;
}