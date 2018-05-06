package algorithms;

public class Fibonacci {
public static void main(String[] args) {
//	int first = 1;
//	int second = 0;
//	int holder = 0;
//	for (int i = 0; i < 100; i++) {
//		System.out.print(first + ", ");
//		holder = first;
//		first = first + second;
//		second = holder;
//	}
	numbers(1, 1, 0);
}
public static int numbers(int first, int second, int count) {
	if(count == 100) {
		System.out.print(first + ", " + second + ", ");
		return 0;
	}
	else {
		System.out.print(first + ", ");
		return numbers(second, first + second, count + 1);
	}
}
}
