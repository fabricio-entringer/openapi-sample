# OrderApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteOrder**](OrderApi.md#deleteOrder) | **DELETE** /{id} | Delete Order
[**editOrder**](OrderApi.md#editOrder) | **PUT** /{id} | Edit Order
[**findAllOrders**](OrderApi.md#findAllOrders) | **GET** / | Find all Orders
[**findOrder**](OrderApi.md#findOrder) | **GET** /{id} | Find One Order
[**insertOrder**](OrderApi.md#insertOrder) | **POST** / | Insert New Order

<a name="deleteOrder"></a>
# **deleteOrder**
> deleteOrder(id)

Delete Order

This service deletes an existing Order stored in the database.

### Example
```java
// Import classes:
//import dev.entringer.invoker.ApiException;
//import dev.entringer.api.OrderApi;


OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | 
try {
    apiInstance.deleteOrder(id);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#deleteOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="editOrder"></a>
# **editOrder**
> OrderPub editOrder(body, id)

Edit Order

This service edits an existing Order and return its values after stored in the database.

### Example
```java
// Import classes:
//import dev.entringer.invoker.ApiException;
//import dev.entringer.api.OrderApi;


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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderPub**](OrderPub.md)|  |
 **id** | **Integer**|  |

### Return type

[**OrderPub**](OrderPub.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="findAllOrders"></a>
# **findAllOrders**
> List&lt;OrderPub&gt; findAllOrders()

Find all Orders

This service returns all Orders stored in the database.

### Example
```java
// Import classes:
//import dev.entringer.invoker.ApiException;
//import dev.entringer.api.OrderApi;


OrderApi apiInstance = new OrderApi();
try {
    List<OrderPub> result = apiInstance.findAllOrders();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#findAllOrders");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;OrderPub&gt;**](OrderPub.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="findOrder"></a>
# **findOrder**
> OrderPub findOrder(id)

Find One Order

This service returns one Order stored in the database that matches with the id informed by the parameter.

### Example
```java
// Import classes:
//import dev.entringer.invoker.ApiException;
//import dev.entringer.api.OrderApi;


OrderApi apiInstance = new OrderApi();
Integer id = 56; // Integer | Order Unique Identification
try {
    OrderPub result = apiInstance.findOrder(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#findOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| Order Unique Identification |

### Return type

[**OrderPub**](OrderPub.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="insertOrder"></a>
# **insertOrder**
> OrderPub insertOrder(body)

Insert New Order

This service inserts a new Order and return its values after stored in the database.

### Example
```java
// Import classes:
//import dev.entringer.invoker.ApiException;
//import dev.entringer.api.OrderApi;


OrderApi apiInstance = new OrderApi();
OrderPub body = new OrderPub(); // OrderPub | Order to be persisted.
try {
    OrderPub result = apiInstance.insertOrder(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderApi#insertOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**OrderPub**](OrderPub.md)| Order to be persisted. |

### Return type

[**OrderPub**](OrderPub.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

