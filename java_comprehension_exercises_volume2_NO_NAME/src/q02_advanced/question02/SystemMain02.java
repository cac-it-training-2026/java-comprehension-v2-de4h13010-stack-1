package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) throws IOException {

		//TODO ここから実装する

		ConsoleReader cr = new ConsoleReader();

		Member member1 = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);

		Member member2 = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1);

		List<Member> members = new ArrayList<Member>();

		members.add(member1);
		members.add(member2);

		MemberManager.showAllMembers(members);

		int inputNUm = cr.inputNumber();

		String Password = null;

		try {
			Password = cr.inputString();

		} catch (IOException e) {
			e.printStackTrace();

		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		MemberManager.updatePassword(members, inputNUm, Password);

		MemberManager.showAllMembers(members);

	}

}
