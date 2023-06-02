package com.host.file;

public class FileDTO {
    private String name;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public FileDTO(String name, String content) {
        this.name = name;
        this.content = content;
    }
}
