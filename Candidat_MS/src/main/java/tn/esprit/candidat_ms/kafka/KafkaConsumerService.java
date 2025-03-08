package tn.esprit.candidat_ms.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

	@KafkaListener(topics = "entity-events", groupId = "my-group")
	public void consume(String message) {
		System.out.println("Received message: " + message);
		// Process the message
	}
}
