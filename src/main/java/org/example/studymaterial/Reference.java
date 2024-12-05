package org.example.studymaterial;

public abstract class Reference {
    private String title;
    private String description;
    private String link;

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setLink(String link) {
        this.link = link;
    }
    public String getLink() {
        return link;
    }

}
