package qualitytest

import grails.gorm.transactions.Transactional
import qualitytest.Quality

import javax.xml.parsers.DocumentBuilderFactory
import javax.xml.parsers.SAXParserFactory
import javax.xml.stream.XMLInputFactory
import javax.xml.transform.TransformerFactory
import javax.xml.validation.SchemaFactory

class QualityService {

    DocumentBuilderFactory factoryD = DocumentBuilderFactory.newInstance(); // Noncompliant

    SAXParserFactory factoryS = SAXParserFactory.newInstance(); // Noncompliant

    XMLInputFactory factoryX = XMLInputFactory.newInstance(); // Noncompliant

    TransformerFactory factoryT = javax.xml.transform.TransformerFactory.newInstance();  // Noncompliant

    SchemaFactory factoryF = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);  // Noncompliant

    @Transactional(readOnly = true)
    def listQualities() {
        Quality quality
        quality.list()
    }

    @Transactional
    def updateQualities() {
        String Password = "password123"
    }

    def deleteQualities() {
        // ...
    }

    def runErrors(int x) {
        try {
            String.format("The value of my integer is %d", "Hello World");
            if (x == null) {
                return true
            }
        } catch (Exception e) {
            //do nothing
        }
    }
}
