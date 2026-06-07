package lr10.Task2;

import org.w3c.dom.*;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Scanner;



public class XmlParser {
    static void main() {
        try {
            File inputFile = new File("src/lr10/Task2/example.xml");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            Scanner userInput = new Scanner(System.in);

            loop:
            while (true) {
                System.out.print("""
                        1 для просмотра книг
                        2 для добавления книги
                        3 для поиска книг
                        4 для удаления книги
                        5 для выхода
                        :\s""");

                switch (userInput.nextLine().trim()) {
                    case "1" -> printLibrary(doc);
                    case "2" -> addNewBook(doc, userInput);
                    case "3" -> findBook(doc, userInput);
                    case "4" -> removeBook(doc, userInput);
                    case "5" -> { break loop; }
                    default -> { continue; }
                }

                System.out.println("\n- - - - -\n");
            }

            doc.setXmlStandalone(true);
            removeEmptyTextNode(doc.getDocumentElement());
            doc.normalizeDocument();

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(inputFile);

            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void printLibrary(Document doc) {
        NodeList nodeList = doc.getElementsByTagName("book");
        for (int i = 0; i < nodeList.getLength(); i++)
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) printBook((Element) nodeList.item(i));
    }
    private static void printBook(Element element) {
        System.out.println("\nНазвание книги: "
                + element.getElementsByTagName("title").item(0)
                .getTextContent());

        System.out.println("Автор: "
                + element.getElementsByTagName("author").item(0)
                .getTextContent());

        System.out.println("Года издания: "
                + element.getElementsByTagName("year").item(0)
                .getTextContent());
    }

    private static void addNewBook(Document doc, Scanner userInput) {
        Element book = doc.createElement("book");
        doc.getDocumentElement().appendChild(book);

        Element title = doc.createElement("title");
        book.appendChild(title);
        Element author = doc.createElement("author");
        book.appendChild(author);
        Element year = doc.createElement("year");
        book.appendChild(year);

        System.out.println("\nНазвание книги: ");
        title.appendChild(doc.createTextNode(userInput.nextLine().trim()));

        System.out.println("Автор: ");
        author.appendChild(doc.createTextNode(userInput.nextLine().trim()));

        System.out.println("Года издания: ");
        year.appendChild(doc.createTextNode(userInput.nextLine().trim()));
    }

    private static void findBook(Document doc, Scanner userInput) {
        System.out.print("\nАвтор или год издания: ");
        String authorOrYear = userInput.nextLine().trim().toLowerCase();

        NodeList nodeList = doc.getElementsByTagName("book");

        for (int i = nodeList.getLength() - 1; i >= 0; i--) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) nodeList.item(i);
                if (element.getElementsByTagName("author").item(0).getTextContent().toLowerCase()
                        .contains(authorOrYear)
                        || element.getElementsByTagName("year").item(0).getTextContent().equals(authorOrYear))
                    printBook(element);
            }
        }
    }

    private static void removeBook(Document doc, Scanner userInput) {
        System.out.print("\nНазвание книги: ");
        String title = userInput.nextLine().trim().toLowerCase();

        NodeList nodeList = doc.getElementsByTagName("book");

        for (int i = nodeList.getLength() - 1; i >= 0; i--) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) nodeList.item(i);
                if (element.getElementsByTagName("title").item(0).getTextContent().toLowerCase().equals(title))
                    element.getParentNode().removeChild(element);
            }
        }
    }

    private static void removeEmptyTextNode(Node node) {
        NodeList children = node.getChildNodes();

        for (int i = children.getLength() - 1; i >= 0; i--) {
            Node child = children.item(i);
            if ((child.getNodeType() == Node.TEXT_NODE ) && child.getTextContent().trim().isEmpty())
                node.removeChild(child);
            else removeEmptyTextNode(child);
        }
    }
}

