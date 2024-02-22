package com.translator.program.entity;


public class TranslateWord {
	private String enWord;
	private String ruWord;
	private String date;
	public TranslateWord(String enWord, String ruWord)
	{
		this.enWord = enWord;
		this.ruWord = ruWord;
		this.date = "no date";
	}
	public void setEnWord(String newEnWord) {
		enWord = newEnWord;
	}
	public void setRuWord(String newRuWord) {
		ruWord = newRuWord;
	}
	public void setDate(String newDate) {
		date = newDate;
	}
	public String getEnWord() {
		return enWord;
	}
	public String getRuWord() {
		return ruWord;
	}
	public String getDate() {
		return date;
	}
}
