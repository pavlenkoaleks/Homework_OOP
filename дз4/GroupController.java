import java.util.ArrayList;
import java.util.List;

public class GroupController<T extends Teacher> {
   private List<TeacherGroup<T>> groups;

   public GroupController() {
       groups = new ArrayList<>();
   }

   public void createGroup(String groupName) {
       TeacherGroup<T> group = new TeacherGroup<>(groupName);
       groups.add(group);
   }

   public void addTeacherToGroup(TeacherGroup<T> group, T teacher) {
       group.addTeacher(teacher);
   }

   public void removeTeacherFromGroup(TeacherGroup<T> group, T teacher) {
       group.removeTeacher(teacher);
   }
    



   public List<TeacherGroup<T>> getGroups() {
       return groups;
   }

   public void print(TeacherGroup<Teacher>group){
    TeacherView<Teacher> view= new TeacherView<>();
    view.printTeacherGroup(group);
   }
}