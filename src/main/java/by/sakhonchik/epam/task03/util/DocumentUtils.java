package by.sakhonchik.epam.task03.util;

import by.sakhonchik.epam.task03.entity.Content;
import by.sakhonchik.epam.task03.entity.Document;
import by.sakhonchik.epam.task03.entity.Element;

import java.util.List;

public class DocumentUtils {
    private Document document;

    public DocumentUtils(Document document) {
        this.document = document;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public void printDocument() {
        List<Element> elements = document.getElements();
        for (Element e : elements) {
            System.out.println(e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        DocumentUtils documentUtils = (DocumentUtils) o;
        return (document != null && document.equals(documentUtils.getDocument()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((document == null) ? 0 : document.hashCode());
        return result;
    }
}
