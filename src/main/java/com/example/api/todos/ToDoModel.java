package com.example.api.todos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
class ToDoModel {
    @Id
    private String Id;
    private String title;
    private String description;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    private long timestamp;

    public ToDoModel() {
    }
    public ToDoModel(String id, String title, String description) {
        this.Id = id;
        this.title = title;
        this.description = description;
        this.timestamp=System.currentTimeMillis();
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
