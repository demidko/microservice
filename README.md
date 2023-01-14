# Spring Boot Service

Kotlin microservice template produces self-executable jar application.

## Usage

1. Make sure you are signed in to your GitHub account, then just
   click [`here`](https://github.com/demidko/spring-boot-service/generate) to use template.
2. `App.kt` file is entry point.

## Build with Java

Execute `./gradlew clean build`. Your jar will be located at `./build/libs` with `-boot.jar` postfix.
Now you can run:

```shell
java -jar --enable-preview build/application-boot.jar
```

## Or, build with Docker

Execute `docker build . -t app`. Your image will be located at `docker images -a`. Now you can
run:

```shell
docker run -v `pwd`:`pwd` -w `pwd` -it --rm -p 80:8080 app
```

Rest API will available at your [localhost](http://localhost/).
