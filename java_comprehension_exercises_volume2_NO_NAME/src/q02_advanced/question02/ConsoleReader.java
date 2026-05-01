package q02_advanced.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public String inputString() throws IOException {

		System.out.print("input new password");
		String newpassword = reader.readLine();

		return newpassword;

	}

	public int inputNumber() throws IOException, NumberFormatException {

		String inputIdstr = reader.readLine();

		System.out.print("input target id");
		int inputId = Integer.parseInt(inputIdstr);

		return inputId;

	}

}
