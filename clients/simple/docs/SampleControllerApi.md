# SampleControllerApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**create**](SampleControllerApi.md#create) | **Post** /sample |  |
| [**delete**](SampleControllerApi.md#delete) | **Delete** /sample/{id} |  |
| [**findById**](SampleControllerApi.md#findById) | **Get** /sample/{id} |  |
| [**list**](SampleControllerApi.md#list) | **Get** /sample/ |  |
| [**listV2**](SampleControllerApi.md#listV2) | **Get** /sample/v2 |  |
| [**update**](SampleControllerApi.md#update) | **Put** /sample/{id} |  |


<a id="create"></a>
# **create**
> User create(user)



### Example
```kotlin
// Import classes:
//import name.stepin.client.simple.infrastructure.*
//import name.stepin.client.simple.models.*

val apiInstance = SampleControllerApi()
val user : User =  // User | 
try {
    val result : User = apiInstance.create(user)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SampleControllerApi#create")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SampleControllerApi#create")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **user** | [**User**](User.md)|  | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="delete"></a>
# **delete**
> delete(id)



### Example
```kotlin
// Import classes:
//import name.stepin.client.simple.infrastructure.*
//import name.stepin.client.simple.models.*

val apiInstance = SampleControllerApi()
val id : String = id_example // String | 
try {
    apiInstance.delete(id)
} catch (e: ClientException) {
    println("4xx response calling SampleControllerApi#delete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SampleControllerApi#delete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="findById"></a>
# **findById**
> String findById(id, xApiKey, param1)



### Example
```kotlin
// Import classes:
//import name.stepin.client.simple.infrastructure.*
//import name.stepin.client.simple.models.*

val apiInstance = SampleControllerApi()
val id : Long = 789 // Long | 
val xApiKey : String = xApiKey_example // String | 
val param1 : String = param1_example // String | 
try {
    val result : String = apiInstance.findById(id, xApiKey, param1)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SampleControllerApi#findById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SampleControllerApi#findById")
    e.printStackTrace()
}
```

### Parameters
| **id** | **Long**|  | |
| **xApiKey** | **String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **param1** | **String**|  | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="list"></a>
# **list**
> List&lt;User&gt; list()



### Example
```kotlin
// Import classes:
//import name.stepin.client.simple.infrastructure.*
//import name.stepin.client.simple.models.*

val apiInstance = SampleControllerApi()
try {
    val result : List<User> = apiInstance.list()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SampleControllerApi#list")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SampleControllerApi#list")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="listV2"></a>
# **listV2**
> List&lt;User&gt; listV2()



### Example
```kotlin
// Import classes:
//import name.stepin.client.simple.infrastructure.*
//import name.stepin.client.simple.models.*

val apiInstance = SampleControllerApi()
try {
    val result : List<User> = apiInstance.listV2()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SampleControllerApi#listV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SampleControllerApi#listV2")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="update"></a>
# **update**
> update(id, user)



### Example
```kotlin
// Import classes:
//import name.stepin.client.simple.infrastructure.*
//import name.stepin.client.simple.models.*

val apiInstance = SampleControllerApi()
val id : String = id_example // String | 
val user : User =  // User | 
try {
    apiInstance.update(id, user)
} catch (e: ClientException) {
    println("4xx response calling SampleControllerApi#update")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SampleControllerApi#update")
    e.printStackTrace()
}
```

### Parameters
| **id** | **String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **user** | [**User**](User.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

