package seminar1.homework2.task;

public class task2simple {
    public static void run() {
        String inputStr = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";

        
          inputStr = inputStr.replace("{\"фамилия\":\"", "Студент ");
          inputStr = inputStr.replace("\",\"оценка\":\"", " получил ");
          inputStr = inputStr.replace("\",\"предмет\":\"", " по предмету ");
          inputStr = inputStr.replace("\"}, ", "\n");
          inputStr = inputStr.replace("[", "");
          inputStr = inputStr.replace("\"}]", "\n");
          
          System.out.println(inputStr);
          
         
    }
    
}