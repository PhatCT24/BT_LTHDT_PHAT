package bai_tap_1;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IEmployee a = new FullTimeEmployee(sc.nextLine(), Integer.parseInt(sc.nextLine()));
		IEmployee b = new PartTimeEmployee(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
		System.out.println(a.getName() + " " + a.calculateSalary());
        System.out.println(b.getName() + " " + b.calculateSalary());
	}
}
