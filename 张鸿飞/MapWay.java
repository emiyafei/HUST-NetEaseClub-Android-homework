package com.zhanghongfei;


import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class MapWay {
	public void mapFunction() {
		TreeMap<Student2,Integer> students=new TreeMap<Student2,Integer>();
		for(int i=20070301,j=1;i<=20070330;i++,j++) 
        { 
            int grade=(int)(40*Math.random()+60);
            students.put(new Student2(grade,"ѧ��"+j),i);
        }
		Set<Student2> k=students.keySet();  
        Iterator<Student2> it=k.iterator();  
          
        while(it.hasNext()){  
            Student2 key=it.next();  
            Integer num=students.get(key);  
              
            System.out.println("ѧ�ţ�"+num+"    "+"������"+key.name+"    "+"�ɼ�:"+key.grade);  
        }   
        System.out.println("  ");
	}
}
//List<Map.Entry<Student2,Integer>> list = new ArrayList<Map.Entry<Student2,Integer>>(students.entrySet()); 
//Collections.sort(list,new Comparator<Map.Entry<Student2,Integer>>() {  
//       //��������  
//      public int compare(Entry<Student2, Integer> o1, Entry<Student2, Integer> o2) {  
//           return o1.getValue().compareTo(o2.getValue());  
//       }
//   });
//for(Map.Entry<Student2,Integer> stu:list){   
//    System.out.println("ѧ�ź�����"+stu.getKey()+"�ɼ�:"+stu.getValue());
//}   