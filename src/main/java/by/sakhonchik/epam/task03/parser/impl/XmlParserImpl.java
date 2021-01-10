package by.sakhonchik.epam.task03.parser.impl;

import by.sakhonchik.epam.task03.entity.Content;
import by.sakhonchik.epam.task03.entity.Document;
import by.sakhonchik.epam.task03.entity.Element;
import by.sakhonchik.epam.task03.parser.XmlParser;

import java.util.ArrayList;
import java.util.List;

public class XmlParserImpl implements XmlParser {
    private final static String OPENING_TAG = "<";
    private final static String CLOSING_TAG = "</";

    @Override
    public Document parse(List<String> xmlFile) {
        Element element;
        List<Element> elements = new ArrayList<>();
        Document document = new Document();

        for (int i = 1; i < xmlFile.size() - 1; i++) {
            if (isOpenElement(xmlFile.get(i))) {
                element = getElement(xmlFile.get(i), document);
                element.setContents(getContent(xmlFile, i, element.getName()));
                elements.add(element);
            }
        }
        document.setElements(elements);
        return document;
    }

    private boolean isContent(String node) {
        return node.contains(OPENING_TAG) && node.contains(CLOSING_TAG);
    }

    private boolean isOpenElement(String element) {
        return !element.contains(CLOSING_TAG);
    }

    private boolean isCloseElement(String xmlElement, String elementName) {
        return xmlElement.startsWith(CLOSING_TAG + elementName);
    }

    private Element getElement(String element, Document document) {
        int startId = element.indexOf("=") + 2;
        int endId = element.indexOf("\">");
        int startName = element.indexOf(OPENING_TAG) + 1;
        int endName = element.indexOf(" ");

        Element newElement = new Element();
        newElement.setId(element.substring(startId, endId));
        newElement.setName(element.substring(startName, endName));
        newElement.setDocument(document);
        return newElement;
    }

    private List<Content> getContent(List<String> xml, int index, String elementName) {
        Content content;
        List<Content> contents = new ArrayList<>();
        for (int i = index; i < xml.size() - 1; i++) {
            if (isCloseElement(xml.get(i), elementName)) {
                break;
            } else if (isContent(xml.get(i))) {
                int startValue = xml.get(i).indexOf(">") + 1;
                int endValue = xml.get(i).indexOf(CLOSING_TAG);
                content = new Content();
                content.setValue(xml.get(i).substring(startValue, endValue));
                contents.add(content);
            }
        }
        return contents;
    }
}
