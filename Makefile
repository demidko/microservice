run-application: build-backend
	java -jar --enable-preview build/libs/*-boot.jar

build-backend:
	gradle clean build