package com.zhanghongfei;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SetWay {
	public void setFunction() {
		HashSet<Student> student=new HashSet();
		for(int i=20070301,j=1;i<=20070330;i++,j++) 
        { 
            student.add(new Student(i,(int) (40*Math.random()+60), "ѧ��"+j)); 
        }
		ArrayList<Student>al=new ArrayList(student);
		Collections.sort(al,new GradeSort());
		for(Student a:al) {
			System.out.println("ѧ�ţ�"+a.studentID+" ������"+a.name+"�ɼ���"+a.grade);
		}
		System.out.println("  ");
	}
}
