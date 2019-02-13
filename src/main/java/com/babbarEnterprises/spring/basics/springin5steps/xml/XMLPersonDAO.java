package com.babbarEnterprises.spring.basics.springin5steps.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class XMLPersonDAO {
    @Autowired
    XMLJdbcConnection xmljdbcConnection;

    public XMLJdbcConnection getXMLJdbcConnection() {
        return xmljdbcConnection;
    }

    public void setXMLJdbcConnection(XMLJdbcConnection jdbcConnection) {
        this.xmljdbcConnection = xmljdbcConnection;
    }
}
