package by.sakhonchik.epam.task03.parser.impl;

import by.sakhonchik.epam.task03.entity.Content;
import by.sakhonchik.epam.task03.entity.Element;
import by.sakhonchik.epam.task03.entity.Node;
import by.sakhonchik.epam.task03.entity.RootNode;
import by.sakhonchik.epam.task03.parser.XmlParser;

import java.util.List;

public class XmlParserImpl implements XmlParser {
    private final static String OPENING_TAG = "<";
    private final static String CLOSING_TAG = "</";
    private Node node;
    private Element element;
    private Content content;


    @Override
    public RootNode parse(List<String> xmlFile) {
        RootNode rootNode = new RootNode();
        for (int i = 1; i < xmlFile.size() - 1; i++) {
            {
                if (isOpenElement(xmlFile, i)) {
                    element = new Element();
                    String elementName = getElementName(xmlFile.get(i));
                    element.setName(elementName);
                    while (!isCloseElement(elementName)) {
                        content = getContent(xmlFile, i + 1);

                    }
                }
            }
        }

        return rootNode;
    }

    private boolean isContent(String node) {
        return node.contains(OPENING_TAG) && node.contains(CLOSING_TAG);
    }

    private boolean isOpenElement(List<String> xml, int index) {
        return !xml.get(index).contains(CLOSING_TAG) &&
                xml.get(index + 1).contains(CLOSING_TAG);
    }

    private boolean isCloseElement(String elementName) {
        return elementName.startsWith(CLOSING_TAG + elementName);
    }

    private String getElementName(String element) {
        int start = element.indexOf(OPENING_TAG) + 1;
        int end = element.indexOf(" ");
        return element.substring(start, end);
    }

    private Content getContent(List<String> xml, int index) {
        Content content = new Content();
        content.setName();
        content.setValue();
        return content;
    }
}
