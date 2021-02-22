package quiz1.sag;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz1SAG {

    public static void main(String[] args) {
        // TODO code application logic here
        List <Student> cjsp = new ArrayList <Student> ();
        Scanner input = new Scanner(System.in);
        String answer;
        int i=1;
        do{
            String qualification = "discontinued";
            System.out.println("student registration \n");
            System.out.println("1. Register a student");
            System.out.println("2. See full class");
            System.out.println("3. get out");
            answer=input.next();
            switch(answer){
                 case "1":                 
                System.out.println("student's name");
                String name = input.next();
                System.out.println("student note");
                Double note = input.nextDouble();               
                if (note>=14){qualification="approved";
            }
                 Student p = new Student(i,name,note);
                p.setQualification(qualification);
                cjsp.add(p);               
                i++;       
                answer="0";               
                break;
                 case "2":
                System.out.println("students in class: \n"+cjsp);
                answer="0";
                break;
                case "3":
                System.out.println("Bye");
                answer="1";
                break;
                default:
                System.out.println("invalid option.You must choose 1,2 or 3");
                answer="0";
            }
        }while (answer=="0");
            
    }

    private static class Student {

        public Student() {
        }

        private Student(int i, String name, Double note) {
        }

        private void setQualification(String qualification) {
        }
    }
    
}
