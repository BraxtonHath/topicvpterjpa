package io.braxton.topicvpterjpa.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String commentername;
    private String message;

    @ManyToOne
    @JoinColumn(name = "topic_id")
    private Topic topic;


    public Comment() {

    }

    public Comment(String commentername, String message, Topic topic) {
        this.commentername = commentername;
        this.message = message;
        this.topic = topic;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCommentername() {
        return commentername;
    }

    public void setCommentername(String commenterName) {
        this.commentername = commenterName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

}
