

public class TeacherView<T extends Teacher> {
    
     public void printTeacherGroup(TeacherGroup<Teacher> gr) {
       
   

      System.out.println("group " + gr.getGroupName() + " contains:");
       for (Teacher teacher : gr.getTeacher()) {
           System.out.println(teacher);
            }

      }
}
