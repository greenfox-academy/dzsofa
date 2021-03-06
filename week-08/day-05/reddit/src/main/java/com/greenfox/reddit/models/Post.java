package com.greenfox.reddit.models;

import org.hibernate.annotations.OnDeleteAction;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reddit")
@Component
public class Post {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  long id;

  int score;
  String content;

  private LocalDate createdAt;

  @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
  private User user;


  public Post(String content) {
    this.score = 0;
    this.content = content;
    this.createdAt = LocalDate.now();
  }

  public Post() {
    this.score = 0;
    this.content = "";
    this.createdAt = LocalDate.now();
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public LocalDate getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(LocalDate createdAt) {
    this.createdAt = createdAt;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

}
