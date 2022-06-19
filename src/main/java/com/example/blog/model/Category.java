package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
    @Id // đánh dấu đây là thuộc tính id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // đánh dấu thuộc tính này tự tăng
    private Long id;
    private String name;

    public Category() {
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
}
