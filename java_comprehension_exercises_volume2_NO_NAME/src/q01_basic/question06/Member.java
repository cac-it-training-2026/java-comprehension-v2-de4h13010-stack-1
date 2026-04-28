package q01_basic.question06;

public class Member extends AbstMember {

	private int id;
	private String password;
	private int age;
	private int rank;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * 引数なしのコンストラクタ
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
		// TODO 自動生成されたメソッド・スタブ

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

		// TODO 自動生成されたメソッド・スタブ

	}

}
