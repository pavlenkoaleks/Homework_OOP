import java.util.List;

public class TeacherService<T extends Teacher> {
    

    
   public void teachersServ (Teacher  teacher) {
    if ((teacher.getGender()!="female")&&(teacher.getGender()!="male")){
        System.out.println(teacher.getName()+" "+ teacher.getSurname()+ " : No such genders in russian school!!! ");
    }
    else{
        if((teacher.getName()==null)||(teacher.getSurname()==null)||(teacher.getPatronymic()==null))
         {
          System.out.println(teacher.getName()+" "+teacher.getSurname()+ ": add name/surname/patronymic!");
         }
        else {System.out.println(teacher.getName()+" "+teacher.getSurname()+": validation ok"); 
          teacher.validation = "ok";}
    }

}


}
