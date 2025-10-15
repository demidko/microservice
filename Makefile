run-application: build-backend
	java -jar build/libs/*-boot.jar

build-backend:
	gradle clean build