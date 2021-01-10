package by.sakhonchik.epam.task03.service;

import java.io.IOException;
import java.util.List;

public interface XmlFileReader {

    List<String> read(String path) throws IOException;

}
