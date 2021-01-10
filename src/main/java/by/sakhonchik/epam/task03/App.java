package by.sakhonchik.epam.task03;

import by.sakhonchik.epam.task03.entity.RootNode;
import by.sakhonchik.epam.task03.parser.impl.XmlParserImpl;
import by.sakhonchik.epam.task03.service.impl.XmlFileReaderImpl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author Dmitry Sakhonchik
 */
public class App {

    private final XmlFileReaderImpl xmlFileReader = new XmlFileReaderImpl();
    private final XmlParserImpl xmlParser = new XmlParserImpl();

    public static void main(String[] args) throws IOException {
        App app = new App();
        List<String> xmlFile = app.xmlFileReader.read("src/main/resources/breakfast-menu.xml");
        RootNode result = app.xmlParser.parse(xmlFile);
 //       xmlFile.forEach(System.out::println);
    }
}
