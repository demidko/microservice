# Spring Boot Application

Template produces self-executable jar application with a web page (UI) at localhost.

## Usage

1. Make sure you are signed in to your GitHub account, then just
   click [`here`](https://github.com/demidko/application/generate) to use template.
2. [`App.kt`](src/main/kotlin/app/example/App.kt) file is entry point.

## Build with Java

Execute `./gradlew clean build`. Your jar will be located at `./build/libs` with `-boot.jar` postfix.
Now you can run:

```shell
java -jar --enable-preview build/libs/application-boot.jar
```

## Or, build with Docker

Execute `docker build . -t app`. Your image will be located at `docker images -a`. Now you can
run:

```shell
docker run -v `pwd`:`pwd` -w `pwd` -it --rm -p 80:8080 app
```

Rest API will available at your [localhost](http://localhost/).

## FYI

If you specify, for example, the annotation

```kotlin
@Value("\${myCalendars.url:http://default-calendar.com}")
lateinit var myCalendarUrl
```

then the value will be taken from the environment variable `MYCALENDAR_URL`. In addition, such a variable can also be
set in the usual way, from the application.yml file or from command line parameters.
