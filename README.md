# ZARA-PRICES

Endpoint to provide items prices details based on ZaraPrices.pdf requirements.

# Run application with maven

From the root

```bash
mvn package
java -jar ./target/zara-prices-0.0.1-SNAPSHOT.jar
```

# Run integration test with newman

From the root

```bash
sudo npm install -g newman
newman run -e ./postman/Local.postman_environment.json ./postman/prices.postman_collection.json
```
