#include<iostream>
using namespace std;

int countPaths(int x, int y)
{
	if (x == 0 || y == 0)
		return 1;
	return(countPaths(x-1,y)+ countPaths(x,y-1));

}
int main()
{
	int x=7, y=4;
	cout << "Number of Paths " << countPaths(x,y) << endl;
	return 0;
}