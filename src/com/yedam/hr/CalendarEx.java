package com.yedam.hr;

import java.util.Calendar;
import com.yedam.control.*;
public class CalendarEx {
	
		static int year;
		static int month;

	static void setCal(int year, int month) {
		CalendarEx.year = year;
		CalendarEx.month = month - 1;
	}
	static void cal() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(CalendarEx.year, CalendarEx.month, 1);
		int lastDay = calendar.getActualMaximum(Calendar.DATE);
		int blank =	ControlEx3.getDate(CalendarEx.month);
		blank = calendar.get(Calendar.DAY_OF_WEEK)-1;

			System.out.println("\n\n\n========="+(CalendarEx.month+1) + " 월의달력=========");
			String days = "Sun Mon Tue Wed Thr Fri Sat";
			System.out.println(days);
			System.out.println("===========================");
			for(int i=1 ; i<=blank; i++) {
				System.out.printf("%3s ", "");			
			}
			
			for (int day = 1; day<=lastDay; day++) {
				System.out.printf("%3d ", day);
				if(blank==0) {
					if(day % 7 == 0) {
						System.out.println();
					}
				}
				else if(day % 7 == (7-blank)) {
					System.out.println();
				}
			}
			
		
		
	}
	
}
