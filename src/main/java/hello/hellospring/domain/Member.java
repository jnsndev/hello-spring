package hello.hellospring.domain;

public class Member {

    // 고객이 입력한 id가 아니라 시스템이 정해준 id
    private Long id;
    private String name;

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
}
