# homework2
by Varit Assavavisidchai 5910545833

- From :
 ```sh
public static long fibonacci(int n) {
    // the base case
    if (n < 2) return 1;
    // the recursive step
    return fibonacci(n-1) + fibonacci(n-2);
}
 ```
 This fibonacci takes a long time to run big value because they will recur when they fing fibo(0) and fibo(1) in every fibo(n>1) so this will take more time because if we want to find fibo(4) -> fibo(3) + fibo(2). First program will recur fibo(3) until they find fibo(0) and fibo(1) ,then we get fibo(3) but we still find fibo(2) in the same way as fibo(3). If you imagine if we find fibo(50). How many recur that program must to do? Oh my god!!!