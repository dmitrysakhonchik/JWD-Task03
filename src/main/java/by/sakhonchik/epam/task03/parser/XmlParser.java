package by.sakhonchik.epam.task03.parser;

import by.sakhonchik.epam.task03.entity.RootNode;

import java.util.List;

public interface XmlParser {
    RootNode parse(List<String> xml);
}
