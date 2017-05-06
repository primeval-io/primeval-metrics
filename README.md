# primeval-metrics [![Build Status](https://travis-ci.org/primeval-io/primeval-metrics.svg?branch=master)](https://travis-ci.org/primeval-io/primeval-metrics) [![Gitter primeval-io/Lobby](https://badges.gitter.im/primeval-io/Lobby.svg)](https://gitter.im/primeval-io/Lobby)

Primeval Metrics wraps [Dropwizard Metrics](https://github.com/dropwizard/metrics) into an OSGi service.

The [Aspecio module for Primeval Metrics](https://github.com/primeval-io/primeval-metrics-aspecio) provides an aspect to time method calls.


# Maven coordinates


```xml

	<groupId>io.primeval</groupId>
	<artifactId>primeval-metrics</artifactId>
	<version>1.0.0-SNAPSHOT</version>
```

Until a stable release, the snapshot version is available in the Sonatype OSS Snapshots repository.


# Dependencies

Primeval Reflex requires Java 8 and depends on [Dropwizard Metrics](https://github.com/dropwizard/metrics).

```xml
	<dependency>
		<groupId>io.dropwizard.metrics</groupId>
		<artifactId>metrics-core</artifactId>
		<version>3.2.2</version>
	</dependency>
```

# OSGi Services 

Service `Metrics` is provided.

```java

public interface Metrics extends MetricSet {

    Counter counter(String name);

    Timer timer(String name);

    Meter meter(String name);

}


```


# Getting help

Post a new GitHub issue or join on [Gitter](https://gitter.im/primeval-io/Lobby).
 


# Author

primeval-metrics was developed by Simon Chemouil.

# Copyright

(c) 2016-2017, Simon Chemouil, Lambdacube

primeval-metrics is part of the Primeval project.