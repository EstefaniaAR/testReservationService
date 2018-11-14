# testReservationService
Part of a spring cloud sample
Tutorial link : https://www.youtube.com/watch?v=ZyK5QrKCbwM

## Reservation Service
Project which contains the main DB operations and rest endpoint. It takes the configuration from the config server

## Requirements
- Spring boot
- Java 8
- Install Rabbit from : https://www.rabbitmq.com/
- Config server from : https://github.com/EstefaniaAR/testConfigServer.git

## Dependencies
    <dependencies>
        <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
        <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-data-rest</artifactId>
        </dependency>
        <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
          <groupId>org.springframework.cloud</groupId>
          <artifactId>spring-cloud-starter-config</artifactId>
        </dependency>
        <dependency>
          <groupId>org.springframework.cloud</groupId>
          <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
        </dependency>
        <dependency>
          <groupId>org.springframework.cloud</groupId>
          <artifactId>spring-cloud-stream</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-stream-rabbit</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
         <dependency>
           <groupId>com.h2database</groupId>
           <artifactId>h2</artifactId>
         </dependency>
      </dependencies>
 
 ## Run
 Rus the main class as a Spring boot app 
 ## Query
 http://localhost:9999/reservation-service/reservations
 http://localhost:9999/reservations/names
 
