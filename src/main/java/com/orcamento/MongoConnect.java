package com.orcamento;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class MongoConnect {

    public static void main(String[] args) {
        MongoClientURI uri = new MongoClientURI(
                "mongodb+srv://root:<password>@cluster0-cbawx.mongodb.net/test?retryWrites=true&w=majority");

        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("test");
        System.out.println("database: " + database.getName());
    }


}
