package template;

public class StudentDailyWork extends DailyWork {
	@Override public void morningWork() {
		System.out.println("학교에 간다");
	}

	@Override public void afternoon() {
		System.out.println("급식소에서 밥을 먹는다.");
	}
}
