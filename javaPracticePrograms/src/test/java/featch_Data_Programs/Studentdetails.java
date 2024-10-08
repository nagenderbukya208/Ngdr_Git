package featch_Data_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Studentdetails {
public static void main(String[] args) {
	ArrayList<Student_01> list=new ArrayList();
	Student_01 s1=new Student_01("nag", 'C', 200);
	Student_01 s2=new Student_01("charan", 'B', 201);
	Student_01 s3=new Student_01("ram", 'A', 202);
	Student_01 s4=new Student_01("hari", 'E', 203);
	Student_01 s5=new Student_01("sathish", 'D', 204);
	
	list.add(s1);
	list.add(s2);
	list.add(s3);
	list.add(s4);
	list.add(s5);
	
	Collections.sort(list,new Comparator<Student_01>() {

		
// Based on name assending order
		/*
		 * @Override public int compare(Student_01 o1, Student_01 o2) { return
		 * o1.getName().compareTo(o2.getName()); } }); for(Student_01 li:list) {
		 * System.out.println(li.getName()+"\t"+li.getGrade()+"\t"+li.getRollNo()); } }
		 * }
		 *///	Based on name desending order
		/*@Override
		public int compare(Student_01 o1, Student_01 o2) {
		
			return o2.getName().compareTo(o1.getName());
		}
	});
	for(Student_01 li:list)
	{
		System.out.println(li.getName()+"\t"+li.getGrade()+"\t"+li.getRollNo());
	}
}
}*/
		// Based Charecter in Asending
		/*@Override
		public int compare(Student_01 o1, Student_01 o2) {
		
			return Character.compare(o1.grade, o2.grade);
		}
	});
	for(Student_01 li:list)
	{
		System.out.println(li.getName()+"\t"+li.getGrade()+"\t"+li.getRollNo());
	}
}
}*/
		// Based Charecter in Desending order
		/*@Override
		public int compare(Student_01 o1, Student_01 o2) {
		
			return Character.compare(o2.grade, o1.grade);
		}
	});
	for(Student_01 li:list)
	{
		System.out.println(li.getName()+"\t"+li.getGrade()+"\t"+li.getRollNo());
	}
}
}
*/
	// Based on the Integer value in Assending order
	/*	@Override
		public int compare(Student_01 o1, Student_01 o2) {
		
			return Integer.compare(o1.rollNo, o2.rollNo);
		}
	});
	for(Student_01 li:list)
	{
		System.out.println(li.getName()+"\t"+li.getGrade()+"\t"+li.getRollNo());
	}
}
}*/
		// Based on the Integer value in Desending order
		@Override
		public int compare(Student_01 o1, Student_01 o2) {
		
			return Integer.compare(o2.rollNo, o1.rollNo);
		}
	});
	for(Student_01 li:list)
	{
		System.out.println(li.getName()+"\t"+li.getGrade()+"\t"+li.getRollNo());
	}
}
}
