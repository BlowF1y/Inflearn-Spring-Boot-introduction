package hello.core.Member;

public class Member {
    private Long id;
    private String name;
    private Grade Grade;

    public Member(Long id, String name, Grade gradel) {
        this.id = id;
        this.name = name;
        Grade = gradel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade getGrade() {
        return Grade;
    }

    public void setGrade(Grade grade) {
        Grade = grade;
    }
}
