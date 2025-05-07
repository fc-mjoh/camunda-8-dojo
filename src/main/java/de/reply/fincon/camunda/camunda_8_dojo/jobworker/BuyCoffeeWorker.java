package de.reply.fincon.camunda.camunda_8_dojo.jobworker;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BuyCoffeeWorker {

    private static final Logger LOG = LoggerFactory.getLogger(BuyCoffeeWorker.class);

    @JobWorker(type = "buyCoffee")
    public void buyCoffee(final JobClient client, final ActivatedJob job) {
        LOG.info("buyCoffee job");
    }

}
