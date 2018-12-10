This Spring Boot application demos Spring's `@Scheduled` annotation combined with Spring Boot
externalized configuration processing.

Scheduling support is enabled with the `@EnableScheduling` annotation placed on any
`@Configuration` or composing annotation such as `@SpringBootApplication`:

```java
@SpringBootApplication
@EnableScheduling
public class DemoSpringScheduledApplication {
```

With the following property configuration in `application.yml`:

```yaml
spring-scheduled:
  # rate can be a numerical milliseconds or ISO-8601 duration. The shorter form like 5s
  # is not supported by fixedRateString parsing.
  rate: PT5S
```

The following `doSomething` method will get invoked every 5 seconds

```java
  @Scheduled(fixedRateString = "${spring-scheduled.rate}")
  public void doSomething() {
    log.info("Running periodic operation at {}", new Date());
  }
```