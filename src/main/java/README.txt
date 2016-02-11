1. Write a Command Line that starts a JavaApp using the Serial Collector with the following parameters -XX:+UseSerialGC
the 6m initial heap size for when the JVM starts -Xms6m
the 18m maximum heap size -Xmx18m
the 2m size of the Young Generation -Xmn2m
the 20m starting size of the Permanent Generation -XX:PermSize=20m
the 30 maximum size of the Permanent Generation -XX:MaxPermSize=30m

-Xmx18m -Xms6m -Xmn2m -XX:PermSize=20m -XX:MaxPermSize=30m -XX:+UseSerialGC 

2. Write a Command Line that starts a JavaApp using the Parallel Collector with the following parameters -XX:+UseParallelGC
the 3m initial heap size for when the JVM starts
the 12m maximum heap size
the 1m size of the Young Generation
the 20m starting size of the Permanent Generation
the 20m maximum size of the Permanent Generation

-Xmx12m -Xms3m -Xmn1m -XX:PermSize=20m -XX:MaxPermSize=20m -XX:+UseParallelGC 

3. Write a Command Line that starts a JavaApp using the Parallel Old Collector with the following parameters -XX:+UseParallelOldGC
the 9m initial heap size for when the JVM starts
the 18m maximum heap size
the 3m size of the Young Generation
the 40m starting size of the Permanent Generation
the 40m maximum size of the Permanent Generation

-Xmx18m -Xms9m -Xmn3m -XX:PermSize=40m -XX:MaxPermSize=40m -XX:+UseParallelOldGC 

4. Write a Command Line that starts a JavaApp using the Concurrent Mark Sweep (CMS) Collector with the following parameters
the 6m initial heap size for when the JVM starts
the 18m maximum heap size
the 2m size of the Young Generation
the 20m starting size of the Permanent Generation
the 30m maximum size of the Permanent Generatio

-Xmx18m -Xms6m -Xmn2m -XX:PermSize=20m -XX:MaxPermSize=30m -XX:+UseConcMarkSweepGC  

5. Write a Command Line that starts a JavaApp using the Concurrent Mark Sweep (CMS) Collector with 2 Parallel GC Threads with the following parameters
the 2m initial heap size for when the JVM starts
the 18m maximum heap size
the 1m size of the Young Generation
the 24m starting size of the Permanent Generation
the 36m maximum size of the Permanent Generation

-Xmx18m -Xms2m -Xmn1m -XX:PermSize=24m -XX:MaxPermSize=36m -XX:+UseConcMarkSweepGC -XX:ParallelCMSThreads=2 

6. Write a Command Line that starts a JavaApp using the Parallel Collector with 2 Parallel CMS Threads with the following parameters
the 4m initial heap size for when the JVM starts
the 16m maximum heap size
the 3m size of the Young Generation
the 24m starting size of the Permanent Generation
the 32m maximum size of the Permanent Generation

java -Xmx16m -Xms4m -Xmn3m -XX:PermSize=24m -XX:MaxPermSize=32m -XX:+UseParallelGC -XX:ParallelCMSThreads=2 -jar c:\YourJavaApp\Java2demo.jar