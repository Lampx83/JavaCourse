package v2ch03._4_sax;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.InputStream;
import java.net.URL;

/**
 * This program demonstrates how to use a SAX parser. The program prints all
 * hyperlinks of an XHTML web page. <br>
 * Usage: java _4_sax.SAXTest URL
 *
 * @author Cay Horstmann
 * @version 1.01 2018-05-01
 */
public class SAXTest {
    public static void main(String[] args) throws Exception {
        String url;
        if (args.length == 0) {
            url = "http://www.w3c.org";
            System.out.println("Using " + url);
        } else url = args[0];

        var handler = new DefaultHandler() {
            public void startElement(String namespaceURI, String lname,
                                     String qname, Attributes attrs) {
                if (lname.equals("a") && attrs != null) {
                    for (int i = 0; i < attrs.getLength(); i++) {
                        String aname = attrs.getLocalName(i);
                        if (aname.equals("href"))
                            System.out.println(attrs.getValue(i));
                    }
                }
            }
        };

        SAXParserFactory factory = SAXParserFactory.newInstance();
        factory.setNamespaceAware(true);
        factory.setFeature(
                "http://apache.org/xml/features/nonvalidating/load-external-dtd",
                false);
        SAXParser saxParser = factory.newSAXParser();
        InputStream in = new URL(url).openStream();
        saxParser.parse(in, handler);
    }
}