package com.orcamento.config;

import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import com.mongodb.MongoClient;
@Configuration
@EnableMongoRepositories(basePackages="com.orcamento.repository")
public class MongoConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "test"; //name of database in mongo
    }

    @Bean
    @Override
    public MongoClient mongoClient() {
        MongoClientURI uri = new MongoClientURI(
                "mongodb+srv://root:WffLkSi9m8dOtVU1@orcamento-cbawx.mongodb.net/test?retryWrites=true&w=majority");

        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("test");
        return mongoClient;
    }
}