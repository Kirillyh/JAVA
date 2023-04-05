package seminar1.homework2.task;

public class People {
    private String name;
    private int mark;
    private String subject;

public People(){};

    public People(String name, int mark, String subject) {
        this.name = name;
        this.mark = mark;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public int getMark() {
        return mark;
    }

    public String getSubject() {
        return subject;
    }

}