package org.resortmanagement.console;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AboutUs {
	void viewFacilities() {
		try {
			FileReader fr = new FileReader("T:\\AboutUs.txt");
			Scanner sc = new Scanner(fr);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
			fr.close();
		} catch (IOException f) {
			System.out.println("Error " + f.getMessage());
		}

	}
}
