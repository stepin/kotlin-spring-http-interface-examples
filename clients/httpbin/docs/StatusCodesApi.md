# StatusCodesApi

All URIs are relative to *https://httpbin.org*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**statusCodesDelete**](StatusCodesApi.md#statusCodesDelete) | **Delete** /status/{codes} | Return status code or random status code if more than one are given |
| [**statusCodesGet**](StatusCodesApi.md#statusCodesGet) | **Get** /status/{codes} | Return status code or random status code if more than one are given |
| [**statusCodesPatch**](StatusCodesApi.md#statusCodesPatch) | **Patch** /status/{codes} | Return status code or random status code if more than one are given |
| [**statusCodesPost**](StatusCodesApi.md#statusCodesPost) | **Post** /status/{codes} | Return status code or random status code if more than one are given |
| [**statusCodesPut**](StatusCodesApi.md#statusCodesPut) | **Put** /status/{codes} | Return status code or random status code if more than one are given |


<a id="statusCodesDelete"></a>
# **statusCodesDelete**
> statusCodesDelete(codes)

Return status code or random status code if more than one are given

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = StatusCodesApi()
val codes : Any =  // Any | 
try {
    apiInstance.statusCodesDelete(codes)
} catch (e: ClientException) {
    println("4xx response calling StatusCodesApi#statusCodesDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatusCodesApi#statusCodesDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **codes** | [**Any**](.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="statusCodesGet"></a>
# **statusCodesGet**
> statusCodesGet(codes)

Return status code or random status code if more than one are given

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = StatusCodesApi()
val codes : Any =  // Any | 
try {
    apiInstance.statusCodesGet(codes)
} catch (e: ClientException) {
    println("4xx response calling StatusCodesApi#statusCodesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatusCodesApi#statusCodesGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **codes** | [**Any**](.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="statusCodesPatch"></a>
# **statusCodesPatch**
> statusCodesPatch(codes)

Return status code or random status code if more than one are given

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = StatusCodesApi()
val codes : Any =  // Any | 
try {
    apiInstance.statusCodesPatch(codes)
} catch (e: ClientException) {
    println("4xx response calling StatusCodesApi#statusCodesPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatusCodesApi#statusCodesPatch")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **codes** | [**Any**](.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="statusCodesPost"></a>
# **statusCodesPost**
> statusCodesPost(codes)

Return status code or random status code if more than one are given

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = StatusCodesApi()
val codes : Any =  // Any | 
try {
    apiInstance.statusCodesPost(codes)
} catch (e: ClientException) {
    println("4xx response calling StatusCodesApi#statusCodesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatusCodesApi#statusCodesPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **codes** | [**Any**](.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="statusCodesPut"></a>
# **statusCodesPut**
> statusCodesPut(codes)

Return status code or random status code if more than one are given

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = StatusCodesApi()
val codes : Any =  // Any | 
try {
    apiInstance.statusCodesPut(codes)
} catch (e: ClientException) {
    println("4xx response calling StatusCodesApi#statusCodesPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StatusCodesApi#statusCodesPut")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **codes** | [**Any**](.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

