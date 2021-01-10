package by.sakhonchik.epam.task03.entity;

import java.io.Serializable;
import java.util.List;

public class Element extends Node implements Serializable {
    private Node node;
    private List<Content> content;

    public Element() {
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }
}
