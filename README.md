## conclusion

> regex in path paramter for proper info pass

> without web.xml configuration

> path param in class level annotation

## dependencies

```xml
<dependencies>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>4.11</version>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.inject</groupId>
			<artifactId>jersey-hk2</artifactId>
			<version>3.0.8</version>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.containers</groupId>
			<artifactId>jersey-container-servlet</artifactId>
			<version>3.0.8</version>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.core</groupId>
			<artifactId>jersey-server</artifactId>
			<version>3.0.8</version>
		</dependency>
		<dependency>
			<groupId>org.glassfish.jersey.core</groupId>
			<artifactId>jersey-common</artifactId>
			<version>3.0.8</version>
		</dependency>
	</dependencies>

```

## boot class

```java
package com.lavesh.boot;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

@ApplicationPath("/api")
public class AppRun extends Application {
//done
}


```


## path param class

```java
package com.lavesh.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("{address}/path")
public class PathParam {

	@GET
	@Path("/get1")
	@Produces(MediaType.TEXT_PLAIN)
	public String get1(@jakarta.ws.rs.PathParam("address") String address) {

		return address;
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/get2")
	public String get2(@jakarta.ws.rs.PathParam("address") String address) {

		return address + " : nice city";
	}

}

```

## regex

```java
package com.lavesh.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/type")
public class RegexINPAth {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
//	@Path("/{email}/verify")
	@Path("/{email: ^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$}/verify")
	public String verifyEmail(@PathParam("email") String email) {
//just for testing purpose
		return "verifyed email : " + email;
	}
}

```