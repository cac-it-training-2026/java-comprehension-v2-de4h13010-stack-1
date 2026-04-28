package q01_basic.question02;

class Member {
	//TODO ここから実装する
	private String name;
	private int age;
	private int rank;

	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("name：" + getName());
		System.out.println("age：" + getAge());
		System.out.println("rank：" + getRank());
		System.out.println("*****************");

	}

	/**
	 * @return name
	 */
	String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	void setRank(int rank) {
		this.rank = rank;
	}

	public void rankUp() {
		rank++;
		System.out.println(">>>RANK UP>>>");
		System.out.println("---GET RANK---");

	}

}
