package model;

public class Gun implements Weapon {

	@Override public void use() {
		System.out.println("검을 사용한다.");
	}

}
