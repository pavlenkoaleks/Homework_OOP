import java.util.ArrayList;
import java.util.List;

public class TeacherGroup<T extends Teacher> {
   private String groupName;
   private List<T> teachers;

   public TeacherGroup(String groupName) {
       this.groupName = groupName;
       this.teachers = new ArrayList<>();
   }

   public void addTeacher(T teacher) {
       teachers.add(teacher);
   }

   public void removeTeacher(T teacher) {
       teachers.remove(teacher);
   }

   public List<T> getTeacher() {
       return teachers;
   }

   public String getGroupName() {
       return groupName;
   }
}
