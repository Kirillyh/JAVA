package seminar1.homework2.task;

import java.util.ArrayList;

public class task2 {
    public static void run() {
        String inputStr = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        inputStr = inputStr.replace("\"", "");
        inputStr = inputStr.replace("}, ", "");
        inputStr = inputStr.replace("{", "—");
        inputStr = inputStr.replace("}]", "—");
        inputStr = inputStr.replace("[—", "");
 //       System.out.println(inputStr);

        String[] students = inputStr.split("—");

        ArrayList<People> listStudents = new ArrayList<>();

        for (int index = 0; index < students.length; index++) {
            String[] student = students[index].split(",");
            String lastname = student[0].substring(8);
            int mark = Integer.parseInt(student[1].substring(7));
            String subject = student[2].substring(8);
            listStudents.add(new People());
        }

        for (int i = 0; i < listStudents.size(); i++) {
            StringBuilder test = new StringBuilder("Студент ");
            test.append(listStudents.get(i).getName() + " получил "  + listStudents.get(i).getMark() + " по предмету " + listStudents.get(i).getSubject() + "\n");
            System.out.println(test);
        }

    }

}