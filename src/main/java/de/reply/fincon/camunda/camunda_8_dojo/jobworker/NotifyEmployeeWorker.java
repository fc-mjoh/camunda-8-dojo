package de.reply.fincon.camunda.camunda_8_dojo.jobworker;

import io.camunda.zeebe.client.ZeebeClient;
import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class NotifyEmployeeWorker {

    private static final Logger LOG = LoggerFactory.getLogger(NotifyEmployeeWorker.class);

    private final ZeebeClient zeebe;

    public NotifyEmployeeWorker(ZeebeClient zeebe) {
        this.zeebe = zeebe;
    }

    @JobWorker(type = "notifyEmployee")
    public void notifyEmployee(final JobClient client, final ActivatedJob job) {
        LOG.info("notifyEmployee");
        Map<String, Object> variables = Map.of("price", job.getVariable("price"), "ursprung", job.getProcessInstanceKey());
        zeebe.newPublishMessageCommand().messageName("Message_1mjvj6u").correlationKey("Message_1mjvj6u").variables(variables).send().join();
    }

}
