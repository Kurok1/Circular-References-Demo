### Run `DemoApplication`
The command will print error information
```text
Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2022-12-08 19:24:25.339 ERROR 2636 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

The dependencies of some of the beans in the application context form a cycle:

┌─────┐
|  demoService (field private org.springframework.data.redis.core.RedisTemplate com.example.demo.DemoService.redisTemplate)
↑     ↓
|  redisTemplate defined in class path resource [org/springframework/boot/autoconfigure/data/redis/RedisAutoConfiguration.class]
↑     ↓
|  redisConnectionFactory defined in class path resource [org/springframework/boot/autoconfigure/data/redis/LettuceConnectionConfiguration.class]
↑     ↓
|  lettuceClientResources defined in class path resource [org/springframework/boot/autoconfigure/data/redis/LettuceConnectionConfiguration.class]
↑     ↓
|  lettuceMetrics defined in class path resource [org/springframework/boot/actuate/autoconfigure/metrics/redis/LettuceMetricsAutoConfiguration.class]
↑     ↓
|  simpleMeterRegistry defined in class path resource [org/springframework/boot/actuate/autoconfigure/metrics/export/simple/SimpleMetricsExportAutoConfiguration.class]
└─────┘


Action:

Relying upon circular references is discouraged and they are prohibited by default. Update your application to remove the dependency cycle between beans. As a last resort, it may be possible to break the cycle automatically by setting spring.main.allow-circular-references to true.

```