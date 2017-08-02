package template;

public class EmployeeDailyWork extends DailyWork {
	@Override public void morningWork() {
		System.out.println("회사 간다");
	}

	@Override public void afternoon() {
		System.out.println("식당에서 밥을 먹는다.");
	}
}
