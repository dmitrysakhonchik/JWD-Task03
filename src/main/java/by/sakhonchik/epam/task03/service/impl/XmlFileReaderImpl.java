package by.sakhonchik.epam.task03.service.impl;

import by.sakhonchik.epam.task03.service.XmlFileReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class XmlFileReaderImpl implements XmlFileReader {

    @Override
    public List<String> read(String path) throws IOException {
        String line;
        File file = new File(path);
        List<String> xmlFile = new ArrayList<>();
        InputStream inputStream = new FileInputStream(file);

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            while ((line = bufferedReader.readLine()) != null) {
                if (!line.startsWith("<?"))
                    xmlFile.add(line.trim());
            }
        } catch (IOException e) {
            System.out.println("Exception in XmlFileReaderImpl class" + e.getMessage());
        }
        inputStream.close();
        return xmlFile;
    }

}
