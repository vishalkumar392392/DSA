package com.geeks.mathmatics;

public class Power {

	public static void main(String[] args) {

		System.out.println(power(10, 3));
		System.out.println(computePower(12, 21));
		System.out.println(powerModule(10, 3));

	}

	// TC -> logn
	public static int power(int a, int n) {

		if (n == 0)
			return 1;
		int temp = power(a, n / 2);
		temp = temp * temp;

		if (n % 2 == 0) {
			return temp;

		} else {
			return temp * a;
		}
	}
	// applying modulo on recursive approach
	static  long powerModule(int N,int R)
    {
        int M = 1000000007;
        if( R == 0 ) return 1;
        long temp = power(N, R/2);
        temp = (temp * temp) % M;
        if(R %2 == 0){
            return temp;
        }else {
            return (temp * N) % M;
        }
    }

	// Iterative power(Binary Exponentation)
	// TC -> logn
	public static long computePower(int x, int n) {

		int m = 1000000007;
		long res = 1;
		while (n > 0) {
			if (n % 2 != 0) {
				res = (res * x) % m;
			}
			n = n / 2;
			x = (x * x) % m;
		}

		return res;
	}

}
