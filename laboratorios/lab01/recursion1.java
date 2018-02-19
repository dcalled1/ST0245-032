public int factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
}

public int fibonacci(int n) {
    if (n <= 1) return n;
    return fibonacci(n - 2) + fibonacci(n - 1);
}

public int triangle(int rows) {
    if (rows == 0) return 0;
    return rows + triangle(rows - 1);
}

public int count7(int n) {
    if (n == 0) return 0;
    if (n % 10 == 7) return 1 + count7(n / 10);
    return count7(n / 10);
}

public int powerN(int base, int n) {
    if (n == 0) return 1;
    return base * powerN(base, n - 1);
}