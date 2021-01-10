package by.sakhonchik.epam.task03.entity;

import java.io.Serializable;

public class Content implements Serializable {
    private Element element;
    private String name;
    private String value;

    public Content() {
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
