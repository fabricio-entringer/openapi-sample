# swagger-java-client

OpenAPI - Sample Project
- API version: 1.0

This service aims to provide information regarding Orders...


*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import dev.entringer.invoker.*;
import dev.entringer.invoker.auth.*;
import dev.entringer.model.*;
import dev.entringer.api.OrderApi;

import java.io.File;
import java.util.*;

public class OrderApiExample {

    public static void main(String[] args) {
        
        OrderApi apiInstance = new OrderApi();
        Integer id = 56; // Integer | 
        try {
            apiInstance.deleteOrder(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#deleteOrder");
            e.printStackTrace();
        }
    }
}
import dev.entringer.invoker.*;
import dev.entringer.invoker.auth.*;
import dev.entringer.model.*;
import dev.entringer.api.OrderApi;

import java.io.File;
import java.util.*;

public class OrderApiExample {

    public static void main(String[] args) {
        
        OrderApi apiInstance = new OrderApi();
        OrderPub body = new OrderPub(); // OrderPub | 
        Integer id = 56; // Integer | 
        try {
            OrderPub result = apiInstance.editOrder(body, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#editOrder");
            e.printStackTrace();
        }
    }
}
import dev.entringer.invoker.*;
import dev.entringer.invoker.auth.*;
import dev.entringer.model.*;
import dev.entringer.api.OrderApi;

import java.io.File;
import java.util.*;

public class OrderApiExample {

    public static void main(String[] args) {
        
        OrderApi apiInstance = new OrderApi();
        try {
            List<OrderPub> result = apiInstance.findAllOrders();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#findAllOrders");
            e.printStackTrace();
        }
    }
}
import dev.entringer.invoker.*;
import dev.entringer.invoker.auth.*;
import dev.entringer.model.*;
import dev.entringer.api.OrderApi;

import java.io.File;
import java.util.*;

public class OrderApiExample {

    public static void main(String[] args) {
        
        OrderApi apiInstance = new OrderApi();
        Integer id = 56; // Integer | Order Unique Identification
        try {
            OrderPub result = apiInstance.findOrder(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#findOrder");
            e.printStackTrace();
        }
    }
}
import dev.entringer.invoker.*;
import dev.entringer.invoker.auth.*;
import dev.entringer.model.*;
import dev.entringer.api.OrderApi;

import java.io.File;
import java.util.*;

public class OrderApiExample {

    public static void main(String[] args) {
        
        OrderApi apiInstance = new OrderApi();
        OrderPub body = new OrderPub(); // OrderPub | Order to be persisted.
        try {
            OrderPub result = apiInstance.insertOrder(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#insertOrder");
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*OrderApi* | [**deleteOrder**](docs/OrderApi.md#deleteOrder) | **DELETE** /{id} | Delete Order
*OrderApi* | [**editOrder**](docs/OrderApi.md#editOrder) | **PUT** /{id} | Edit Order
*OrderApi* | [**findAllOrders**](docs/OrderApi.md#findAllOrders) | **GET** / | Find all Orders
*OrderApi* | [**findOrder**](docs/OrderApi.md#findOrder) | **GET** /{id} | Find One Order
*OrderApi* | [**insertOrder**](docs/OrderApi.md#insertOrder) | **POST** / | Insert New Order

## Documentation for Models

 - [CustomerPub](docs/CustomerPub.md)
 - [OrderPub](docs/OrderPub.md)
 - [ProductPub](docs/ProductPub.md)

## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

moreira@gmal.com