package com.example.quora.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Question extends BaseModel{

    private  String title;

    private String content;

    @ManyToMany
    @JoinTable(
            name = "question_tags",
            joinColumns = @JoinColumn(name = "question_Id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private Set<Tag> tags;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User users;
}
