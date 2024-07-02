# RequestInspectionApi

All URIs are relative to *https://httpbin.org*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**headersGet**](RequestInspectionApi.md#headersGet) | **Get** /headers | Return the incoming request&#39;s HTTP headers. |
| [**ipGet**](RequestInspectionApi.md#ipGet) | **Get** /ip | Returns the requester&#39;s IP Address. |
| [**userAgentGet**](RequestInspectionApi.md#userAgentGet) | **Get** /user-agent | Return the incoming requests&#39;s User-Agent header. |


<a id="headersGet"></a>
# **headersGet**
> headersGet()

Return the incoming request&#39;s HTTP headers.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = RequestInspectionApi()
try {
    apiInstance.headersGet()
} catch (e: ClientException) {
    println("4xx response calling RequestInspectionApi#headersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequestInspectionApi#headersGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="ipGet"></a>
# **ipGet**
> ipGet()

Returns the requester&#39;s IP Address.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = RequestInspectionApi()
try {
    apiInstance.ipGet()
} catch (e: ClientException) {
    println("4xx response calling RequestInspectionApi#ipGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequestInspectionApi#ipGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="userAgentGet"></a>
# **userAgentGet**
> userAgentGet()

Return the incoming requests&#39;s User-Agent header.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = RequestInspectionApi()
try {
    apiInstance.userAgentGet()
} catch (e: ClientException) {
    println("4xx response calling RequestInspectionApi#userAgentGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequestInspectionApi#userAgentGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

