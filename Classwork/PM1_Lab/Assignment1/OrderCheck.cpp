#include <iostream>

using namespace std;

int main(int argc, char * argv[])
{
    int w = atoi(argv[1]);
    int x = atoi(argv[2]);
    int y = atoi(argv[3]);
    int z = atoi(argv[4]);

    bool descend = ((w > x) && (x > y) && (y > z));
    bool ascend = ((w < x) && (x < y) && (y < z));
    bool out = (ascend || descend);

    cout << out << endl;
    return 0;
}
