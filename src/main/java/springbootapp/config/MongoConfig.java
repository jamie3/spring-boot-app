package springbootapp.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

    @Value("${db.hostname}")
    String hostname;

    @Override
    public String getDatabaseName() {
        return "beer";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient(hostname, 27017);
    }
}
