package by.sakhonchik.epam.task03;

import by.sakhonchik.epam.task03.entity.Document;
import by.sakhonchik.epam.task03.parser.impl.XmlParserImpl;
import by.sakhonchik.epam.task03.service.impl.XmlFileReaderImpl;
import by.sakhonchik.epam.task03.util.DocumentUtils;

import java.io.IOException;
import java.util.List;

/**
 * @author Dmitry Sakhonchik
 */

public class App {
    public static void main(String[] args) throws IOException {
        XmlFileReaderImpl xmlFileReader = new XmlFileReaderImpl();
        XmlParserImpl xmlParser = new XmlParserImpl();
        List<String> xmlFile = xmlFileReader.read("src/main/resources/breakfast-menu.xml");
        Document document = xmlParser.parse(xmlFile);
        DocumentUtils documentUtils = new DocumentUtils(document);
        documentUtils.printDocument();
    }
}
