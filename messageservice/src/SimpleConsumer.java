
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class SimpleConsumer {
	public static void main(String[] args) {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("group.id", "test-group");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

        try (KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props)) {
			consumer.subscribe(Collections.singletonList("my-topic"));

			while (true) {
			    ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
			    for (ConsumerRecord<String, String> record : records) {
			        System.out.printf("offset = %d, key = %s, value = %s%n", record.offset(), record.key(), record.value());
			    }
			}
		}
    }
}
