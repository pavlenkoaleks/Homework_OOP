

public class Main {
   public static void main(String[] args) {

       GroupController<Teacher> controller = new GroupController<>();
       TeacherService<Teacher> service = new TeacherService<>();

       
       controller.createGroup("Group 1");
       Teacher teacher1 = new Teacher("Nina", "Ivanova", "Ivanovna","female");
       Teacher teacher2 = new Teacher("Petr", "Petrov", "Petrovich","male");
       Teacher teacher3 = new Teacher("Sergei", "Sidorova", "Sergeevna","transgender");
       service.teachersServ(teacher1);
       service.teachersServ(teacher2);
       service.teachersServ(teacher3);
       controller.addTeacherToGroup(controller.getGroups().get(0), teacher1);
       controller.addTeacherToGroup(controller.getGroups().get(0), teacher2);
       
       TeacherGroup<Teacher> group = controller.getGroups().get(0);
       controller.print(group);

   }

}