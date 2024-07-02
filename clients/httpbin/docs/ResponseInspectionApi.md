# ResponseInspectionApi

All URIs are relative to *https://httpbin.org*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cacheGet**](ResponseInspectionApi.md#cacheGet) | **Get** /cache | Returns a 304 if an If-Modified-Since header or If-None-Match is present. Returns the same as a GET otherwise. |
| [**cacheValueGet**](ResponseInspectionApi.md#cacheValueGet) | **Get** /cache/{value} | Sets a Cache-Control header for n seconds. |
| [**etagEtagGet**](ResponseInspectionApi.md#etagEtagGet) | **Get** /etag/{etag} | Assumes the resource has the given etag and responds to If-None-Match and If-Match headers appropriately. |
| [**responseHeadersGet**](ResponseInspectionApi.md#responseHeadersGet) | **Get** /response-headers | Returns a set of response headers from the query string. |
| [**responseHeadersPost**](ResponseInspectionApi.md#responseHeadersPost) | **Post** /response-headers | Returns a set of response headers from the query string. |


<a id="cacheGet"></a>
# **cacheGet**
> cacheGet(ifModifiedSince, ifNoneMatch)

Returns a 304 if an If-Modified-Since header or If-None-Match is present. Returns the same as a GET otherwise.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ResponseInspectionApi()
val ifModifiedSince : Any =  // Any | 
val ifNoneMatch : Any =  // Any | 
try {
    apiInstance.cacheGet(ifModifiedSince, ifNoneMatch)
} catch (e: ClientException) {
    println("4xx response calling ResponseInspectionApi#cacheGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponseInspectionApi#cacheGet")
    e.printStackTrace()
}
```

### Parameters
| **ifModifiedSince** | [**Any**](.md)|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ifNoneMatch** | [**Any**](.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="cacheValueGet"></a>
# **cacheValueGet**
> cacheValueGet(`value`)

Sets a Cache-Control header for n seconds.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ResponseInspectionApi()
val `value` : Int = 56 // Int | 
try {
    apiInstance.cacheValueGet(`value`)
} catch (e: ClientException) {
    println("4xx response calling ResponseInspectionApi#cacheValueGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponseInspectionApi#cacheValueGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **&#x60;value&#x60;** | **Int**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="etagEtagGet"></a>
# **etagEtagGet**
> etagEtagGet(ifNoneMatch, ifMatch)

Assumes the resource has the given etag and responds to If-None-Match and If-Match headers appropriately.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ResponseInspectionApi()
val ifNoneMatch : Any =  // Any | 
val ifMatch : Any =  // Any | 
try {
    apiInstance.etagEtagGet(ifNoneMatch, ifMatch)
} catch (e: ClientException) {
    println("4xx response calling ResponseInspectionApi#etagEtagGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponseInspectionApi#etagEtagGet")
    e.printStackTrace()
}
```

### Parameters
| **ifNoneMatch** | [**Any**](.md)|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ifMatch** | [**Any**](.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="responseHeadersGet"></a>
# **responseHeadersGet**
> responseHeadersGet(freeform)

Returns a set of response headers from the query string.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ResponseInspectionApi()
val freeform : Any =  // Any | 
try {
    apiInstance.responseHeadersGet(freeform)
} catch (e: ClientException) {
    println("4xx response calling ResponseInspectionApi#responseHeadersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponseInspectionApi#responseHeadersGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **freeform** | [**Any**](.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="responseHeadersPost"></a>
# **responseHeadersPost**
> responseHeadersPost(freeform)

Returns a set of response headers from the query string.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ResponseInspectionApi()
val freeform : Any =  // Any | 
try {
    apiInstance.responseHeadersPost(freeform)
} catch (e: ClientException) {
    println("4xx response calling ResponseInspectionApi#responseHeadersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponseInspectionApi#responseHeadersPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **freeform** | [**Any**](.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

