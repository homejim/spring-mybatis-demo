# spring-mybatis-demo

If you use hotswap-agent-1.4.2-SNAPSHOT.jar for reloading, you will encounter the following NPE error. Additionally, the reload will not work. However, with my modified code(https://github.com/homejim/HotswapAgent/releases/tag/1.4.2.1-SNAPSHOT), it runs smoothly.

stacktrace:
```java
Caused by: java.lang.RuntimeException: java.lang.reflect.InvocationTargetException
at org.hotswap.agent.plugin.spring.reload.SpringBeanReload.invokeBeanFactoryPostProcessors(SpringBeanReload.java:655)
at org.hotswap.agent.plugin.spring.reload.SpringBeanReload.doReload(SpringBeanReload.java:296)
at org.hotswap.agent.plugin.spring.reload.SpringBeanReload.reload(SpringBeanReload.java:259)
at org.hotswap.agent.plugin.spring.reload.SpringChangedAgent.doReload(SpringChangedAgent.java:204)
at org.hotswap.agent.plugin.spring.reload.SpringChangedAgent.reloadAll(SpringChangedAgent.java:192)
```

