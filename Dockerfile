FROM java:8-jdk-alpine

COPY companyuser-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch companyuser-0.0.1-SNAPSHOT.jar'

EXPOSE 8082

ENTRYPOINT ["java","-jar","companyuser-0.0.1-SNAPSHOT.jar"]