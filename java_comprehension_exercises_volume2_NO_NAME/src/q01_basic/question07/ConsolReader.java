package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsolReader {

	public int inputNumber() throws IOException, NumberFormatException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String inputNumber = reader.readLine();
		int number = Integer.parseInt(inputNumber);
		return number;

	}

}
