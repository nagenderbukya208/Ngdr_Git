package pattranPrograms;

import org.testng.annotations.Test;

public class Spcl_Num_Patran_Pro2 {
	@Test
	public void spcl_Num_Pro() {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				for (int j = 1; j <= i; j++) {
					System.out.print(i);
				}
			} else {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
