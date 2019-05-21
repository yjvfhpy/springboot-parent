package com.elasticsearch.es;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;

/**
 *
 */
public class EsMain {

    public static void main(String[] args) throws Exception {
        Settings settings = Settings.builder().put("cluster.name", "my-application").build();
        TransportClient client = new PreBuiltTransportClient(settings)
                .addTransportAddress(new TransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
        client.listedNodes().forEach(node -> {
            System.out.println(node.getHostName());
        });


        GetResponse documentFields = client.prepareGet("company", "branch", "london").get();
        System.out.println(documentFields.getIndex());
        System.out.println(documentFields.getType());
        System.out.println(documentFields.getId());
        System.out.println(documentFields.getSourceAsString());
        client.close();
    }
}