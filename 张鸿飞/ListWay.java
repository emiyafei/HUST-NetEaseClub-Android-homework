package com.zhanghongfei;

import java.util.ArrayList;
import java.util.Collections;

public class ListWay {

	public void listFunction() {
		// TODO Auto-generated method stub
		ArrayList<Student>stu=new ArrayList<Student>(); 
        for(int i=20070301,j=1;i<=20070330;i++,j++) 
        { 
            stu.add(new Student(i,(int) (40*Math.random()+60), "ѧ��"+j)); 
        }
        Collections.sort(stu,new GradeSort());
        for(Student stu1:stu)
        System.out.println("ѧ�ţ�"+stu1.studentID+" ������"+stu1.name+"�ɼ���"+stu1.grade);
	System.out.println("  ");
	}

}
