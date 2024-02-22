package com.translator.program.service;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.translator.program.entity.TranslateWord;

public class MyService {
	private TranslateWord answer;
	public MyService(TranslateWord answer){
		this.answer = answer;
	}
	public TranslateWord getTranslate(){
		Date dateNow = new Date();
	      SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd hh:mm:ss a zzz");
	      answer.setDate(formatForDateNow.format(dateNow));
		return answer;
		}
}