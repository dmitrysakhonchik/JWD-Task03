package by.sakhonchik.epam.task03.entity;

import java.io.Serializable;
import java.util.List;

public class Document implements Serializable {
    private List<Element> elements;

    public Document() {
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Document document = (Document) o;
        return (elements != null && elements.equals(document.getElements()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((elements == null) ? 0 : elements.hashCode());
        return result;
    }
}
