# ActiveWeb simple example

Follow these simple steps to run this app:


* AdjustJDBC connection parameters in [database.properties](src/main/resources/database.properties)

* Create two empty schemas in MySQL DB

```
mvn db-migrator:create
```

* Run the application

```
mvn jetty:run
```

* Navigate with browser

    to: [http://localhost:8080/](http://localhost:8080/)


