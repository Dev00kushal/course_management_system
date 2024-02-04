/**
 * @file linearRegression.c
 * @brief This file contains the implementation of linear regression algorithm.
 *
 * The linear regression algorithm calculates the coefficients of a straight line that best fits a given set of data points.
 * It reads data points from multiple files, calculates the sums of x, y, x^2, y^2, and xy, and then calculates the coefficients of the regression equation.
 * Finally, it prompts the user to enter a value of x and calculates the corresponding value of y using the regression equation.
 */

#include <stdio.h>

#define MAX_DATA_POINTS 500

// Function to read data points from a file
void readDataPoints(const char *filename, float x[], float y[], int *n, float *sum_x, float *sum_y, float *sum_xy, float *sum_x2, float *sum_y2)
{
  FILE *fp = fopen(filename, "r");
  if (fp == NULL)
  {
    printf("Failed to open file: %s\n", filename);
    return;
  }

  // Read data points until maximum limit or end of file is reached
  while ((*n) < MAX_DATA_POINTS && fscanf(fp, "%f,%f", &x[*n], &y[*n]) == 2)
  {
    *sum_x += x[*n];
    *sum_y += y[*n];
    *sum_xy += x[*n] * y[*n];
    *sum_x2 += x[*n] * x[*n];
    *sum_y2 += y[*n] * y[*n];
    (*n)++;
  }

  fclose(fp);
}

int main()
{
  float x[MAX_DATA_POINTS], y[MAX_DATA_POINTS];
  int n = 0;
  float sum_x = 0, sum_y = 0, sum_xy = 0, sum_x2 = 0, sum_y2 = 0;

  // Read data points from multiple files
  readDataPoints("Files/datasetLR1.txt", x, y, &n, &sum_x, &sum_y, &sum_xy, &sum_x2, &sum_y2);
  readDataPoints("Files/datasetLR2.txt", x, y, &n, &sum_x, &sum_y, &sum_xy, &sum_x2, &sum_y2);
  readDataPoints("Files/datasetLR3.txt", x, y, &n, &sum_x, &sum_y, &sum_xy, &sum_x2, &sum_y2);
  readDataPoints("Files/datasetLR4.txt", x, y, &n, &sum_x, &sum_y, &sum_xy, &sum_x2, &sum_y2);

  // Print the sums
  printf("Number of data points is: %d\n", n);
  printf("Sum of x is: %.2f\n", sum_x);
  printf("Sum of y is: %.2f\n", sum_y);
  printf("Sum of x^2 is: %.2f\n", sum_x2);
  printf("Sum of y^2 is: %.2f\n", sum_y2);
  printf("Sum of xy is: %.2f\n", sum_xy);

  float a, b;
  float denominator = (n * sum_x2) - (sum_x * sum_x);
  if (denominator != 0)
  {
    // Calculate the coefficients of the regression equation
    a = ((sum_y * sum_x2) - (sum_x * sum_xy)) / denominator;
    b = ((n * sum_xy) - (sum_x * sum_y)) / denominator;

    // Print the regression equation
    printf("Equation of the straight line is: \n");
    printf("y = %.2fx + %.2f\n\n", b, a);

    float x1;
    printf("Enter value of x: ");
    scanf("%f", &x1);

    // Calculate the corresponding y value
    float y1 = b * x1 + a;
    printf("Value of y is: %.2f", y1);
  }
  else
  {
    printf("Cannot calculate the equation of the straight line. Division by zero error.\n");
  }

  return 0;
}
