package template;

public class TeacherDailyWork extends DailyWork {
	@Override public void morningWork() {
		System.out.println("학교에 간다");
	}

	@Override public void afternoon() {
		System.out.println("교직원 식당에서에서 밥을 먹는다. (...)");
	}
}
