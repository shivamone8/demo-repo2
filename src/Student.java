public record Student(String name, int age, String address){
    public Student{
        if(age<18){
            throw new IllegalArgumentException("Student is not allowed to vote");
        }
    }
    }
    record Person(String name, int age){
    }

    class main {
        public static  void main(String args[]) {
            Student student = new Student("Shivam", 21, "Harraiya");


        }


        }
