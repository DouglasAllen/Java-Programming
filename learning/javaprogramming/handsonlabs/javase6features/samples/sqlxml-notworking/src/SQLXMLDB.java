import java.sql.*;
import javax.xml.stream.*;


public class SQLXMLDB {
    Connection connection;
    
    public void getConnection() {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            String url = "jdbc:derby://localhost:1527/sample";
            //public static String dbdriver = "org.apache.derby.jdbc.ClientDriver";
            //public static String username = "app";
            //public static String password = "app";
            //String url = "jdbc:db2://localhost:50000/Sample";
            
            Connection connection = DriverManager.getConnection(url, "app",
                    "app");
            
            DatabaseMetaData metadata = connection.getMetaData();
            ResultSet rs = metadata.getTypeInfo();
            rs.next();
            
            while (rs.next()) {
                System.out.println("TYPE_NAME:" + rs.getString("TYPE_NAME"));
                
            }
        } catch (SQLException e) {System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {System.out.println(e.getMessage());
        }
    }
    
    
    public void addXMLDocument(){
        
        try{
                
            SQLXML sqlXML=connection.createSQLXML();
            
            XMLStreamWriter xmlStreamWriter=sqlXML.createXMLStreamWriter();
            
            xmlStreamWriter.writeStartDocument("UTF-8","1.0");
            xmlStreamWriter.writeStartElement("catalog");
            xmlStreamWriter.writeAttribute("title",
                    "XML Zone");
            xmlStreamWriter.writeAttribute("publisher",
                    "IBM developerWorks");
            
            xmlStreamWriter.writeStartElement("journal");
            xmlStreamWriter.writeAttribute("date",
                    "Jan 2006");
            xmlStreamWriter.writeStartElement("article");
            
            xmlStreamWriter.writeStartElement("title");
            xmlStreamWriter.writeCharacters("Managing XML data: Tag URIs");
            xmlStreamWriter.writeEndElement();
            
            xmlStreamWriter.writeStartElement("author");
            xmlStreamWriter.writeCharacters("Elliotte Harold");
            xmlStreamWriter.writeEndElement();
            
            xmlStreamWriter.writeEndElement();
            
            
            
            
            xmlStreamWriter.writeStartElement("article");
            
            xmlStreamWriter.writeStartElement("title");
            xmlStreamWriter.writeCharacters("Practical data binding: XPath as data binding tool, Part 2");
            xmlStreamWriter.writeEndElement();
            
            xmlStreamWriter.writeStartElement("author");
            xmlStreamWriter.writeCharacters("Brett McLaughlin");
            xmlStreamWriter.writeEndElement();
            
            xmlStreamWriter.writeEndElement();
            xmlStreamWriter.writeEndElement();
            
            xmlStreamWriter.writeEndElement();
            
            xmlStreamWriter.writeEndDocument();
            xmlStreamWriter.close();
            
            Statement stmt=connection.createStatement();
            stmt.executeUpdate("CREATE Table Catalog(CatalogId int, Catalog XML)");
            
            PreparedStatement statement=connection.prepareStatement("INSERT INTO CATALOG(catalogId, catalog) VALUES(?,?)");
            
            statement.setInt(1, 1);
            statement.setSQLXML(2, sqlXML);
            
            statement.executeUpdate();
            sqlXML.free();
            
        }catch(SQLException e){} catch(XMLStreamException e){}
        
    }
    public void getXMLDocument(){
        
        try{
            PreparedStatement stmt=connection.prepareStatement("SELECT * FROM  CATALOG WHERE catalogId=?");
            stmt.setInt(1, 1);
            
            ResultSet rs=stmt.executeQuery();
            
            SQLXML sqlXML=rs.getSQLXML("catalog");
            System.out.println(sqlXML.getString());
            XMLInputFactory factory = XMLInputFactory.newInstance();
            //XMLStreamReader xmlStreamReader=sqlXML.createXMLStreamReader();
            XMLStreamReader xmlStreamReader=factory.createXMLStreamReader(sqlXML);
            parseXMLDocument(xmlStreamReader);
            sqlXML.free();
            
        }catch(SQLException e){}
        
        
    }
    
    public void parseXMLDocument(XMLStreamReader xmlStreamReader){
        
        try{
            while(xmlStreamReader.hasNext()){
                int parseEvent=xmlStreamReader.next();
                if(parseEvent==XMLStreamConstants.ATTRIBUTE){
                    System.out.println("Parse Event ATTRIBUTE");
                    System.out.println("Attribute Local Name: "+xmlStreamReader.getAttributeLocalName(0));
                    System.out.println("Attribute Namespace: "+xmlStreamReader.getAttributeNamespace(0));
                    System.out.println("Attribute Prefix: "+xmlStreamReader.getAttributePrefix(0));
                    System.out.println("Attribute Type: "+xmlStreamReader.getAttributeType(0));
                    System.out.println("Attribute Value: "+xmlStreamReader.getAttributeValue(0));
                    
                }
                if(parseEvent==XMLStreamConstants.CDATA){
                    System.out.println("Parse Event CDATA");
                    System.out.println("CDATA text: "+xmlStreamReader.getText());
                }
                if(parseEvent==XMLStreamConstants.CHARACTERS){
                    System.out.println("Parse Event CHARACTERS");
                    System.out.println("CHARACTERS text: "+xmlStreamReader.getText());
                }
                if(parseEvent==XMLStreamConstants.COMMENT){
                    System.out.println("Parse Event COMMENT");
                    System.out.println("COMMENT text: "+xmlStreamReader.getText());
                }
                if(parseEvent==XMLStreamConstants.NOTATION_DECLARATION){
                    System.out.println("Parse Event NOTATION_DECLARATION");
                }
                if(parseEvent==XMLStreamConstants.START_DOCUMENT){
                    System.out.println("Parse Event START_DOCUMENT");
                }
                if(parseEvent==XMLStreamConstants.START_ELEMENT){
                    System.out.println("Parse Event START_ELEMENT");
                    System.out.println("Element Local Name: "+xmlStreamReader.getLocalName());
                    System.out.println("Element text: "+xmlStreamReader.getElementText());
                    System.out.println("Element Prefix: "+xmlStreamReader.getPrefix());
                    System.out.println("Element Namespace: "+xmlStreamReader.getNamespaceURI());
                }
                if(parseEvent==XMLStreamConstants.END_ELEMENT){
                    System.out.println("Parse Event END_ELEMENT");
                    System.out.println("Element Local Name: "+xmlStreamReader.getLocalName());
                }
                if(parseEvent==XMLStreamConstants.ENTITY_DECLARATION){
                    System.out.println("Parse Event ENTITY_DECLARATION");
                }
                if(parseEvent==XMLStreamConstants.ENTITY_REFERENCE){
                    System.out.println("Parse Event ENTITY_REFERENCE");
                    System.out.println("Replacement text: "+xmlStreamReader.getElementText());
                }
                if(parseEvent==XMLStreamConstants.NAMESPACE){
                    System.out.println("Parse Event NAMESPACE");
                    System.out.println("Namespace Prefix: "+xmlStreamReader.getNamespacePrefix(0));
                    System.out.println("NamespaceURI: "+xmlStreamReader.getNamespaceURI(0));
                    
                }
                if(parseEvent==XMLStreamConstants.SPACE){
                    System.out.println("Parse Event SPACE");
                    System.out.println("SPACE text: "+xmlStreamReader.getText());
                    
                }
                if(parseEvent==XMLStreamConstants.END_DOCUMENT){
                    System.out.println("Parse Event END_DOCUMENT");
                }
                if(parseEvent==XMLStreamConstants.DTD){
                    System.out.println("Parse Event DTD");
                }
                
            }
            
        } catch(XMLStreamException e){}
        
    }
    
    
    public static void main(String[] argv) {
        SQLXMLDB sqlXMLDB = new SQLXMLDB();
        sqlXMLDB.getConnection();
        
       /* sqlXMLDB.addXMLDocument();
        sqlXMLDB.getXMLDocument();*/
    }
}
