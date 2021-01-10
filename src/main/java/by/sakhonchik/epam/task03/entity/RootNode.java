package by.sakhonchik.epam.task03.entity;

import java.io.Serializable;
import java.util.List;

public class RootNode implements Serializable {
    private String name;
    private List<Node> nodes;

    public RootNode() {
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
