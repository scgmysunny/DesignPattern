package Design.mode.MVCPattern;

/**
 * Created by suchen on 2017/12/29.
 * 创建视图
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}