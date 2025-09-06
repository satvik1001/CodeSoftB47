package CLIStudentManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    private List<Student> students=new ArrayList<>();
    private final String FILE_NAME="student.txt";

    StudentManager(){
      loadFromFile();
    }

    //Add Student
    public void addStudent(Student s)throws Exception{
        for(Student st:students){
            if(st.getId()==s.getId()){
                throw new Exception("Duplicate Id is not allowed");
            }
        }
        students.add(s);
        saveToFile();
    }

    //Display Student
    public void viewAllStudents(){
        if(students.isEmpty()){
            System.out.println("No Student Found");
        }
        else{
            students.forEach(System.out::println);
        }
    }

    //Searching Student
    public Student searchStudent(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
            return null;
    }

    //Update Student Detail
    public void updateStudent(int id,String name,int age,String course) {
        Student s = searchStudent(id);
        if (s != null) {
            s.setName(name);
            s.setAge(age);
            s.setCourse(course);
            saveToFile();
        } else {
            System.out.println("Student Detail not Found");
        }
    }

        //Delete Student
        public void deleteStudent(int id){
         Student s=searchStudent(id);
         if(s!=null){
             students.remove(s);
             saveToFile();
             System.out.println("Deleted Student Detail");
         }
         else{
             System.out.println("Student Detail not Found");
         }
        }

        //SaveToFile Method
       private void saveToFile(){
        try(PrintWriter pw=new PrintWriter(new FileWriter(FILE_NAME))){
          for(Student s:students){
              pw.println(s.getId() +", "+s.getName()+", "+s.getAge()+", "+", "+s.getCourse());
          }
        }catch (IOException e){
            e.getStackTrace();
        }
       }

    // Load from file
    private void loadFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                int id = Integer.parseInt(arr[0]);
                String name = arr[1];
                int age = Integer.parseInt(arr[2]);
                String course = arr[3];
                students.add(new Student(id, name, age, course));
            }
        } catch (IOException e){
        }
    }

}

