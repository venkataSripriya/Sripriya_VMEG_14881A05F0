import java.util.Date;
import java.util.ArrayList;
import java.util.*;
import java.util.Calendar;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(students!=null)
			return students;
		else
			return null;
		
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
			{throw new IllegalArgumentException();}
		else
			{this.students=students;}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length){
			throw new IllegalArgumentException();
		}
		else{
		return students[index];
		}
		
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		//if(student==null || index<0 || index>=students.length)
		//	throw new IllegalArgumentException();
		//else{
			//students[index]=student;
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student == null){
throw new IllegalArgumentException();}
Student[] temp = new Student[this.getStudents().length+1];
		 for(int i = 0; i < this.students.length; i++)
			 temp[i] = this.students[i];
		 temp[temp.length - 1] = student;
		 this.students = temp;
		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student==null || index<0 || index>=students.length)
		{throw new IllegalArgumentException();}
		Student[] temp = new Student[this.students.length+1];
		 for(int i = 0; i < index; i++)
			 temp[i] = this.students[i];
		 temp[index] = student;
		 for(int i = index; i < this.students.length; i++)
			 temp[i+1] = this.students[i];
		 this.students = temp;
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length)
		{throw new IllegalArgumentException();}
		Student[] temp = new Student[this.students.length-1]; 
		 int c = 0;
		 for(int i = 0; i < this.students.length; i++)
			 if(i != index) temp[c++] = this.students[i];
		 this.students = temp;
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0 || index>=students.length)
		{throw new IllegalArgumentException();}
		Student[] temp = new Student[index]; 
		 int c = 0;
		 for(int i = 0; i < index; i++)
			 temp[i] = this.students[i];
		 this.students = temp; 
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		Student[] temp = new Student[this.students.length-index]; 
		 int c = 0;
		 for(int i = index; i < this.students.length; i++)
			 temp[i-index] = this.students[i];
		 this.students = temp;
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		for(int i = 0; i < this.students.length; i++)
		  {
			  
	          for(int j = 0; j < this.students.length-i-1; j++)
			  {
                   if(this.students[j].getId() > this.students[j+1].getId())
				   {
					   Student temp = this.students[j];
					   this.students[j] = this.students[j+1];
					   this.students[j+1] = temp;
				   }
			  }	   
		  }
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		
	return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		
		
	return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		
		   return null;
		
		
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		if(indexOfStudent == 0) { throw new IllegalArgumentException();}
			Date now = new Date();
           return this.students[indexOfStudent].getBirthDate().getYear() - now.getYear();
	
	
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		ArrayList<Student> temp = new ArrayList<Student>();
		  for(int i = 0; i < this.students.length; i++)
		  {
		      if(getCurrentAgeByDate(i) == age)
				  temp.add(this.students[i]);
		  }
          return  temp.toArray(new Student[temp.size()]);
	
	
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		double maxavg = 0;
		  for(Student s : this.students)
			  if(s.getAvgMark() > maxavg) maxavg = s.getAvgMark();
		  ArrayList<Student> temp = new ArrayList<Student>();
		  for(Student s : this.students)
			  if(s.getAvgMark() == maxavg)  temp.add(s);
		  return  temp.toArray(new Student[temp.size()]);
		
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
	}