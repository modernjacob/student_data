package Project_Portfolio;

import java.util.Comparator;

public class Name_Comparator implements Comparator<Object> {

    public int compare(Object one, Object two) {
        //Instantiate
        Student s_one = (Student) one;
        Student s_two = (Student) two;
        
        return s_one.name.compareTo(s_two.name);
    }
}