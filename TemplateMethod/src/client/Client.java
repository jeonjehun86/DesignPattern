package client;

import template.DailyWork;
import template.EmployeeDailyWork;
import template.StudentDailyWork;
import template.TeacherDailyWork;

public class Client {

	public static void main(String[] args) {
		DailyWork dailyWork = new EmployeeDailyWork();
		dailyWork.printDailyWork();

		dailyWork = new StudentDailyWork();
		dailyWork.printDailyWork();

		dailyWork = new EmployeeDailyWork();
		dailyWork.printDailyWork();

		dailyWork = new TeacherDailyWork();
		dailyWork.printDailyWork();
	}
}
