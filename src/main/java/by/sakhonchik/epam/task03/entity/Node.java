package by.sakhonchik.epam.task03.entity;

import java.io.Serializable;
import java.util.List;

public class Node extends RootNode implements Serializable {
    private String id;
    private RootNode rootNode;
    private List<Element> elements;

    public Node() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RootNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(RootNode rootNode) {
        this.rootNode = rootNode;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }
}
