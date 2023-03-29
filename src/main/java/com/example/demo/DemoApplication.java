package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// When selecting a message broker, you have various factors to consider, including the following:
// Supported programming languages — You probably should pick one that supports a variety of programming languages.
// Supported messaging standards — Does the message broker support any standards, such as AMQP and STOMP, or is it proprietary?
// Messaging ordering — Does the message broker preserve ordering of messages?
// Delivery guarantees — What kind of delivery guarantees does the broker make?
// Persistence — Are messages persisted to disk and able to survive broker crashes?
// Durability — If a consumer reconnects to the message broker, will it receive the messages that were sent while it was disconnected?
// Scalability — How scalable is the message broker?
// Latency — What is the end-to-end latency?
// Competing consumers — Does the message broker support competing consumers?

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

// Messages
// 1. Scaling consumers while preserving message ordering.
// 2. Detecting and discarding duplicate messages.
// 3. Sending and receiving messages as part of a database transaction.

// Kafka question

// 1. Consumer and Consumer Group
   // 1.1 No point in adding more consumers that you have partitions in a topic - some of the consumers will just be idle.
   // 1.2 One Consumer can read all topic's partitions

// 2. How to choose the number of partitions.
	// 2.1 partition count for a topic be equal to or a multiple of the number of brokers int the cluster.

// 3. Consumer Groups and Partition Rebalance
	// 3.1