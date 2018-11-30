import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */


class Priorities{
    public List<Student> getStudents(List<String> events){
        PriorityQueue<Student> queue = new PriorityQueue<Student>();
        List<Student> list = new ArrayList<Student>();
        List<Student> list1 = (List<Student>)queue;
        Collections.sort(list1, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Student s1 = (Student) o1;
				Student s2 = (Student) o2;
				if(!(s1.getCgpa() == s2.getCgpa())) {
					if(s1.getCgpa() > s2.getCgpa())
						return -1;
					else {
						return 1;
					}
					
				}else if((s1.getName().equals(s2.getName()))) {
					s1.getName().compareTo(s2.getName());
				}else {
					
				}
				return 0;
			}
        	
        });
        for(String str:events){
            String[] arr = str.split(" ");
            if(arr[0].equalsIgnoreCase("Enter")){
                Student s = 
                    new Student(arr[1], arr[2], arr[3]);
                    queue.add(s);
                    
            }else if(arr[0].equalsIgnoreCase("Served")){
            	
            }
        }  

        return list;
	}
}
                     
