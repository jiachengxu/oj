#include <algorithm>
#include <cstring>
#include <iostream>

using namespace std;

int main() {
  double a, b, c;
  scanf("%lf%lf%lf", &a, &b, &c);
  if (a + b > c && a + c > b && b + c > a)
    printf("Perimetro = %.1lf", a + b + c);
  else
    printf("Area = %.1lf", (a + b) * c / 2);
  return 0;
}