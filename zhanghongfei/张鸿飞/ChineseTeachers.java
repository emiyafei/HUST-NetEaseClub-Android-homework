package com.github.homework;

public class ChineseTeachers extends Person implements AllTeachers{
	public void printClassName() {
		System.out.println("ChineseTeachers");
	}
	public void function() {
		System.out.println("语文老师教语文。");
	}
}
