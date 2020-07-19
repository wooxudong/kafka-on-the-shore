## Kafka + Micronaut Fun Project
This is a fun project that I tried to play with various kafka configuraions
with Micronaut. Don't ask me why Micronaut though.

### Pre-requests
---
If you runs on mac please repalce the param **KAFKA_ADVERTISED_HOST_NAME** docker-compose.yml file
with your ip address for wireless. 
```shell script
 $ ipconfig getifaddr en0                                                                                                                                                            
```
Then you could use this address to set up the micronaut kafka.boostrap.servers for the producer
and consumer.

