package com.geeks.mathmatics.practice;

public class ExactlyDivisbleByThree {

	public static void main(String[] args) {
		// using seive of eratosthenes
		System.out.println(exactly3Divisors(179424673));
	}

	public static int exactly3Divisors(int N) {
		int arr[] = new int[N + 1];
		for (int i = 2; i * i <= N; i++) {
			if (isPrime(i)) {
				for (int j = i * i; j <= N; j = j + i) {
					arr[j] = 1;
				}
			}
		}
		int count = 0;
		for (int i = 2; i * i <= N; i++) {
			if (arr[i] == 0 && i * i <= N) {
				count++;
			}
		}

		return count;
	}
	
	public int exactly3DivisorsVersion2(int N)
    {
        int ans = 0;

        for (int i=1; i*i<=N; i++) {
            int count = 0;
            
            for (int j=1; j*j<=i; j++) {
                if (i % j == 0) {
                    if (i / j == j)
                        count++;
                    else
                        count += 3;
                }
            }
            
            if (count == 3)
                ans++;
        }
        
        return ans;
    }

	static boolean isPrime(int n) {
		if (n == 1)
			return false;
		if (n == 2 || n == 3)
			return true;
		if (n % 2 == 0 || n % 3 == 0)
			return false;
		for (int i = 5; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
