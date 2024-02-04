#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>

/**
 * This function calculates the value of pi using the Leibniz formula.
 * It takes the number of iterations as an argument and returns a pointer to the calculated value of pi.
 *
 * @param arg A pointer to an integer representing the number of iterations.
 * @return A pointer to a double representing the calculated value of pi.
 */
void *calculatePi(void *arg)
{
  int iterations = *((int *)arg);      // Get the number of iterations from the argument
  double *pi = malloc(sizeof(double)); // Allocate memory for pi
  *pi = 0.0;                           // Initialize pi to 0.0
  int i;
  for (i = 0; i < iterations; i++)
  {
    if (i % 2 == 0)
    {
      *pi += 1.0 / (2 * i + 1); // Add the positive term to pi
    }
    else
    {
      *pi -= 1.0 / (2 * i + 1); // Subtract the negative term from pi
    }
  }
  *pi *= 4.0;       // Multiply pi by 4 to get the final value
  pthread_exit(pi); // Return the pointer to pi
}

int main()
{
  void *pi; // Pointer to store the calculated value of pi
  int iterations, threads;
  printf("Enter the number of iterations: ");
  scanf("%d", &iterations); // Read the number of iterations from the user
  printf("Enter the number of threads: ");
  scanf("%d", &threads); // Read the number of threads from the user

  pthread_t tid[threads]; // Array to store thread IDs
  int i;
  for (i = 0; i < threads; i++)
  {
    pthread_create(&tid[i], NULL, calculatePi, (void *)&iterations); // Create threads and pass the number of iterations as argument
  }

  for (i = 0; i < threads; i++)
  {
    pthread_join(tid[i], &pi); // Wait for threads to finish and get the calculated value of pi
  }
  printf("Pi: %f\n", *((double *)pi)); // Access the value of pi using the pointer
  free(pi);                            // Free the memory allocated for pi
  return 0;
}