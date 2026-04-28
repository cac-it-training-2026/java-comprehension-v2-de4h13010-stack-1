package q01_basic.question05;

public class Member extends AbstMember {

	private int id;
	private String password;

	private int age;
	private int rank;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * 引数なしコンストラクタ
	 */
	public Member() {
	}

	/**
	 * @param id
	 * @param password
	 * @param age
	 * @param rank
	 */
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.setName(name);
		this.age = age;
		this.rank = rank;
	}

	@Override
	public void buyItem() {

	}

	@Override
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("id：" + getId());
		System.out.println("password：" + getPassword());
		System.out.println("name：" + getName());
		System.out.println("age：" + getAge());
		System.out.println("rank：" + getRank());
		System.out.println("*****************");

	}

}
