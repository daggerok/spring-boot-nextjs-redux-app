# Spring Boot and Next.js [![tests](https://github.com/daggerok/spring-boot-nextjs-redux-app/actions/workflows/tests.yml/badge.svg)](https://github.com/daggerok/spring-boot-nextjs-redux-app/actions/workflows/tests.yml)
Example of using Next.js as static site generator together with `redux` and `react-redux` to be served with Spring Boot Web Thymeleaf

## Backend development

```bash
./mvnw clean compile spring-boot:run
```

## Frontend development

```bash
./mvnw frontend:install-node-and-npm frontend:npm@npm-run-dev -Pdev
```

## Serve static frontend

```bash
./mvnw clean frontend:install-node-and-npm frontend:npm@npm-run-export frontend:npx@npx-serve-out -Pserve
```

## Test, build and run app

```bash
./mvnw ; java -jar target/*.jar
open http://127.0.0.1:8080
```

## RTFM
* https://www.youtube.com/watch?v=zrs7u6bdbUw
* https://medium.com/javascript-scene/do-react-hooks-replace-redux-210bab340672
* https://stackoverflow.com/a/70360521/1490636
* https://nextjs.org/docs/messages/failed-loading-swc
* https://github.com/netty/netty/issues/11020
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.6/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.6/maven-plugin/reference/html/#build-image)
* [Coroutines section of the Spring Framework Documentation](https://docs.spring.io/spring/docs/5.3.18/spring-framework-reference/languages.html#coroutines)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.6.6/reference/htmlsingle/#configuration-metadata-annotation-processor)
* [Spring Reactive Web](https://docs.spring.io/spring-boot/docs/2.6.6/reference/htmlsingle/#web.reactive)
* [Building a Reactive RESTful Web Service](https://spring.io/guides/gs/reactive-rest-service/)
