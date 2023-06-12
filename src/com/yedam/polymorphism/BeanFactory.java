package com.yedam.polymorphism;

public class BeanFactory {
	public Object getBean(String tv, String speaker) {
		Speaker sObj = null;
		if(speaker.equals("sony")) {
			sObj = new SonySpeaker();
		}else if(speaker.equals("apple")) {
			sObj = new AppleSpeaker();
		}
		
		
		if(tv.equals("lg")) {
//			return new LgTv(sObj);
		} else if (tv.equals("samsung")){
			return new SamTv(sObj);
		}
		return sObj;
	}
}
