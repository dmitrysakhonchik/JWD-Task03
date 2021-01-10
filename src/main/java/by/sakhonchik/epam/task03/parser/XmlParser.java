package by.sakhonchik.epam.task03.parser;

import by.sakhonchik.epam.task03.entity.Document;

import java.util.List;

public interface XmlParser {
    Document parse(List<String> xml);
}
