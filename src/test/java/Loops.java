import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Loops {
    @Test
    public void loopsLesson() {
        List<String> studentNames = new ArrayList<>();

        System.out.println(studentNames.isEmpty());

        studentNames.add("Dmitry");
        studentNames.add("Svetlana");
        studentNames.add("Sergey");
        studentNames.add("Anton");
        studentNames.add("Timur");
        studentNames.add("Deniss");
        studentNames.add("Daniil");
        studentNames.add("Darja");
        // studentNames: "Dmitry" "Svetlana" "Sergey" (List of Strings)

        System.out.println(studentNames.get(1));
        System.out.println(studentNames.size());
        System.out.println(studentNames.isEmpty());

        //-----------------------FOR--------------------
        for (int i = 0; i <3; i = i + 1) {
            System.out.println(studentNames.get(i));
        }

        //--------------------FOREACH--------------------
        for (String name  : studentNames){
            System.out.println(name);
           if (name.startsWith("Da")){
            System.out.println(name);
           }
        }
        //---------IF ELSE------------------------------
        for (String name  : studentNames){
            if (name.startsWith("D")) {
                System.out.println(name + "This name starts with D");
            } else {
                System.out.println(name + "This name doesn't start with D");
            }
        }
    }
}
