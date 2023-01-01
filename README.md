Example Project for blog post:

Run the sample code:

```shell
mvn clean install
mvn spring-boot:run -f ./app/pom.xml
```

Test the endpoint

```shell
curl http://localhost:8080/
```

You should see `X-Host` and `X-Trace-Id` headers in the response.