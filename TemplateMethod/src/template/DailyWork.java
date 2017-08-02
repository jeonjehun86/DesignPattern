package template;

public abstract class DailyWork {

	public void dawnWork() {
		System.out.println("잠자리에서 일어난다.");
	}

	public abstract void morningWork();

	public abstract void afternoon();

	public void dinner() {
		System.out.println("집으로 돌아온다.");
	}

	public void night() {
		System.out.println("잠자리에 든다");
	}

	public void printDailyWork() {
		System.out.println("---------- 시작 ----------");
		dawnWork();
		morningWork();
		afternoon();
		dinner();
		night();
		System.out.println("---------- 종료 ----------");
		System.out.println("");
	}
}
