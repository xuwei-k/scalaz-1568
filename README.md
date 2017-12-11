binary incompatibility sample

https://travis-ci.org/xuwei-k/scalaz-1568/builds/314543756

```
[error] (run-main-0) java.lang.NoSuchMethodError: com.example.C.instance()Lcom/example/A;
java.lang.NoSuchMethodError: com.example.C.instance()Lcom/example/A;
	at com.example.D$.foo(D.scala:4)
	at com.example.Main$.main(Main.scala:6)
	at com.example.Main.main(Main.scala)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
[trace] Stack trace suppressed: run last sampleMain/compile:run for the full output.
java.lang.RuntimeException: Nonzero exit code: 1
	at scala.sys.package$.error(package.scala:27)
[trace] Stack trace suppressed: run last sampleMain/compile:run for the full output.
[error] (sampleMain/compile:run) Nonzero exit code: 1
```
