package me.itzg.demo.springscheduled;

import java.time.Duration;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("spring-scheduled")
@Component
@Data
public class SpringScheduledProperties {

  /**
   * Configures the fixed interval between invocations of the periodic service.
   */
  Duration rate;
}
