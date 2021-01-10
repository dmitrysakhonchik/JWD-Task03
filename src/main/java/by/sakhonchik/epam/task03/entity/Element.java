package by.sakhonchik.epam.task03.entity;

import java.io.Serializable;
import java.util.List;


public class Element implements Serializable {

    private String id;
    private String name;
    private Document document;
    private List<Content> contents;

    public Element() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public List<Content> getContents() {
        return contents;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Element element = (Element) o;
        return id.equals(element.id)
                && (name.equals(element.name) || name.equals(element.getName()))
                && (document == element.document || document != null
                && document.equals(element.getDocument()) || contents != null
                && contents.equals(element.getContents()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((document == null) ? 0 : document.hashCode());
        result = prime * result + ((contents == null) ? 0 : contents.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder element = new StringBuilder();
        element.append(getId());
        element.append(".");
        element.append("\n  ");
        for (Content c : getContents())
            element.append(c.getValue()).append(" ");
        return element.toString();
    }
}
