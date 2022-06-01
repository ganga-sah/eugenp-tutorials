package com.baeldung.cassandra.java.client;

import com.baeldung.cassandra.java.client.repository.ItemAttributeRepository;
import com.baeldung.cassandra.java.client.repository.KeyspaceRepository;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.utils.UUIDs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CassandraClient2 {
    private static final Logger LOG = LoggerFactory.getLogger(CassandraClient2.class);

    public static void main(String args[]) {
        CassandraConnector connector = new CassandraConnector();
        String host = "us-east-1-arch-cas-0"; //"127.0.0.1"
        System.out.println("***********host="+host);
        connector.connect(host, null);
        Session session = connector.getSession();

        KeyspaceRepository sr = new KeyspaceRepository(session);
        //sr.createKeyspace("library", "SimpleStrategy", 1);
        sr.useKeyspace("safeguard_prod");

        ItemAttributeRepository br = new ItemAttributeRepository(session);
//        br.createTable();
//        br.alterTablebooks("publisher", "text");
//
//        br.createTableBooksByTitle();
//
//        Book book = new Book(UUIDs.timeBased(), "Effective Java", "Joshua Bloch", "Programming");
//        br.insertBookBatch(book);

        br.selectAll().forEach(o -> LOG.info("Item id: " + o.getItem_id()));
        //br.selectAllBookByTitle().forEach(o -> LOG.info("Title in booksByTitle: " + o.getTitle()));

//        br.deletebookByTitle("Effective Java");
//        br.deleteTable("books");
//        br.deleteTable("booksByTitle");
//
//        sr.deleteKeyspace("library");

        connector.close();
    }
}
