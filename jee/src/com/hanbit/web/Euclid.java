package com.hanbit.web;
import java.util.Scanner;
/**
 * @DATE : 2016. 4. 16.
 * @FILE : Euclid.java
 * @AUTH : 김 정 훈
 * @STORY : 최대공약수,최소공배수 구하기 풀이
 */
public class Euclid {
	
	public static void main(String[] args) {
		int a, b, big, small = 0, mok = 0, nmg = 0, gcd = 0, lcm = 0;

		System.out.println("최대공약수, 최소공배수를 구하는 두 수 입력 ");
		Scanner sc = new Scanner(System.in);
		Euclid euclid = new Euclid();
		euclid.gcdLcm(nmg, sc);

	}

	public void gcdLcm(int nmg, Scanner sc) {
		int a;
		int b;
		int big;
		int small;
		int mok;
		int gcd;
		int lcm;
		a = sc.nextInt();

		b = sc.nextInt();

		// 대소비교
		if (a > b) {
			big = a;
			small = b;
		} else {
			big = b;
			small = a;
		}

		while (big % small != 0) {
			// 이 부분을 코딩하여 완성하시오

			nmg = big % small;
			mok = big / small;

			if (nmg != 0) {
				big = small;
				small = nmg;
			}
		}

		if (big % small == 0) {
			gcd = nmg;
			lcm = (a * b) / gcd;
			System.out.println("최대공약수 = " + gcd);
			System.out.println("최소공배수 = " + lcm);
		}
	}
}
