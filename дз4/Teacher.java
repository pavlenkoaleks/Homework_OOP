public class Teacher {
    private String name;
    private String surname;
    private String patronymic;
    private String gender; 
    public String validation;

    public Teacher(String name, String surname, String patronymic,String gender) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.gender = gender;
        this.validation="not ok";
    }


    @Override
    public String toString() {
        return  name + ' ' +
                surname + ' ' +
                patronymic + ' '+
                gender+ ' ';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }
    public String getGender() {
        return gender;
    }
    public String getValid() {
        return validation;
    }


}


