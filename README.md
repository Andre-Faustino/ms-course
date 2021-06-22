#
# Microservices with Java Spring Boot, Spring Cloud and Spring Security

## Overview 

>    The objective of this project is to show a micro services structure using Spring Framework and it's moderns tools such as Spring Boot, Spring Cloud and Spring Security. 
    
>Features we already have :
>- Eureka server to connect ours app services
>- Config server to centralize configuration
>- Api Gateway to expose ony one API to the world
>- OAuth protocol, with Authenticantion Server and Resource Server
    


>  __Disclaimer__: As the focus here is on microservices architecture, you can see that the services are quite simplistic, using an h2 database with few data and only exposing ~~rustics~~ GET requests.
    
#
## Phase 1: Basic Services, Feign, Ribbon
<br> 

>### 1. Services : 
>    - hr-worker
>    - hr-payroll

>### 2 Feign : 
>    OpenFeign provides an integration with Spring Boot, using it's auto configuration to easily perform REST requests.

>### 3 Ribbon load balancing : 
>   Netflix Ribbon create a client side balance load between multiples instances of a same application

#
## Phase 2: Eureka, Hystrix, Zuul
<br>

>### 1. Eureka :
>    Spring Cloud Netflix provides Eureka server-client configuration, so you can register the services apps to a Eureka Server App that handles the load balance and failover. 

>### 2. Hystrix :
>    Circuit Breaker Hystrix can handle failures, providing fallbacks via annotation

>### 3. Zuul :
>    hr-api-gateway-zuul : Eureka Zuul is the reverse proxy working as an api gateway to filter and router all client's requests 

<br>

#
## Phase 3: One config to rule them all
<br>

>### 1. Hr-Config
>    This application provides configuration files (on github) to all services that register to it. This configurations can be specific to a service, even filtering by profiles, or global to all

>### 2. Actuator :
>    Actuator provides many endpoints to app monitoring.  

#
## Phase 4: Authentication & Authorization
<br>

>### 1. Services : 
>    - Hr-user : service with db (h2) to provide de users and its roles
>    - Hr-auth : authorization server

>### 2. Authorization Server : 
>    Spring Security implements oauth protocol, using Basic auth for client authentication and Jwt for user token

>### 3. Server Resource :
>    Zuul gateway app (hr-api-gateway-zuul) authorize and authenticate the routes based on the token's request. Authorization server is public, though

#
## Credits

>This project was based on a udemy's course called "Microsserviços Java com Spring Boot e Spring Cloud", so here is my credits to Nélio Alves, who is a great teacher and professional, and his staff. You can check this out on this link : https://www.udemy.com/course/microsservicos-java-spring-cloud/

#
## If you want to test it out

>In case you want to test this microservice, follow this steps:
> - Clone or Download all files
> - Run the microservices in this order: hr-config, hr-eureka-server, all others in any order
> - Import the Postman's collection and the Postman's envs to your Postman
> - Have Fun!


#
## Extra

>You can see this same project using dockers in "Docker" branch
>
>Contact me if you have any trouble or question about this project



