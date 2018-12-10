package me.itzg.demo.springscheduled;

import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PeriodicService {

  @Autowired
  public PeriodicService(SpringScheduledProperties properties) {
    log.info("Will be running periodically at {}", properties.getRate());
  }

  @Scheduled(fixedRateString = "${spring-scheduled.rate}")
  public void doSomething() {
    log.info("Running periodic operation at {}", new Date());
  }
}
