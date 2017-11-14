# Configuring your Spring Boot application for simple HTTP access logging using `logback-access`

The main goal of this booster is to send Tomcat's access logging to `stdout`, which, in the context of an application running 
on OpenShift, means appending access logs to the OpenShift console, thus enabling administrators to use the central logging
facility to monitor Tomcat's activity.

# References

- For more details on `logback-access`, please look at https://logback.qos.ch/access.html
- An interesting third-party project with deeper `logback-access` integration with Spring Boot can be found at: https://github.com/akihyro/logback-access-spring-boot-starter
- More details on embedded servlet containers in Spring Boot: https://docs.spring.io/spring-boot/docs/current/reference/html/howto-embedded-servlet-containers.html