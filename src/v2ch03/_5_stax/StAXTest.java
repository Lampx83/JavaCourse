package v2ch03._5_stax;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import java.io.InputStream;
import java.net.URL;

/**
 * This program demonstrates how to use a StAX parser. The program prints all
 * hyperlinks links of an XHTML web page. <br>
 * Usage: java stax.StAXTest URL
 *
 * @author Cay Horstmann
 * @version 1.1 2018-05-01
 */
public class StAXTest {
    public static void main(String[] args) throws Exception {
        String urlString;
        if (args.length == 0) {
            urlString = "http://www.w3c.org";
            System.out.println("Using " + urlString);
        } else urlString = args[0];
        var url = new URL(urlString);
        InputStream in = url.openStream();
        XMLInputFactory factory = XMLInputFactory.newInstance();
        XMLStreamReader parser = factory.createXMLStreamReader(in);
        while (parser.hasNext()) {
            int event = parser.next();
            if (event == XMLStreamConstants.START_ELEMENT) {
                if (parser.getLocalName().equals("a")) {
                    String href = parser.getAttributeValue(null, "href");
                    if (href != null)
                        System.out.println(href);
                }
            }
        }
    }
}
