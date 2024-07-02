# RedirectsApi

All URIs are relative to *https://httpbin.org*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**absoluteRedirectNGet**](RedirectsApi.md#absoluteRedirectNGet) | **Get** /absolute-redirect/{n} | Absolutely 302 Redirects n times. |
| [**redirectNGet**](RedirectsApi.md#redirectNGet) | **Get** /redirect/{n} | 302 Redirects n times. |
| [**redirectToDelete**](RedirectsApi.md#redirectToDelete) | **Delete** /redirect-to | 302/3XX Redirects to the given URL. |
| [**redirectToGet**](RedirectsApi.md#redirectToGet) | **Get** /redirect-to | 302/3XX Redirects to the given URL. |
| [**redirectToPatch**](RedirectsApi.md#redirectToPatch) | **Patch** /redirect-to | 302/3XX Redirects to the given URL. |
| [**redirectToPost**](RedirectsApi.md#redirectToPost) | **Post** /redirect-to | 302/3XX Redirects to the given URL. |
| [**redirectToPut**](RedirectsApi.md#redirectToPut) | **Put** /redirect-to | 302/3XX Redirects to the given URL. |
| [**relativeRedirectNGet**](RedirectsApi.md#relativeRedirectNGet) | **Get** /relative-redirect/{n} | Relatively 302 Redirects n times. |


<a id="absoluteRedirectNGet"></a>
# **absoluteRedirectNGet**
> absoluteRedirectNGet(n)

Absolutely 302 Redirects n times.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = RedirectsApi()
val n : Any =  // Any | 
try {
    apiInstance.absoluteRedirectNGet(n)
} catch (e: ClientException) {
    println("4xx response calling RedirectsApi#absoluteRedirectNGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedirectsApi#absoluteRedirectNGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **n** | [**Any**](.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="redirectNGet"></a>
# **redirectNGet**
> redirectNGet(n)

302 Redirects n times.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = RedirectsApi()
val n : Any =  // Any | 
try {
    apiInstance.redirectNGet(n)
} catch (e: ClientException) {
    println("4xx response calling RedirectsApi#redirectNGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedirectsApi#redirectNGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **n** | [**Any**](.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="redirectToDelete"></a>
# **redirectToDelete**
> redirectToDelete()

302/3XX Redirects to the given URL.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = RedirectsApi()
try {
    apiInstance.redirectToDelete()
} catch (e: ClientException) {
    println("4xx response calling RedirectsApi#redirectToDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedirectsApi#redirectToDelete")
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

<a id="redirectToGet"></a>
# **redirectToGet**
> redirectToGet(url, statusCode)

302/3XX Redirects to the given URL.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = RedirectsApi()
val url : String = url_example // String | 
val statusCode : Any =  // Any | 
try {
    apiInstance.redirectToGet(url, statusCode)
} catch (e: ClientException) {
    println("4xx response calling RedirectsApi#redirectToGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedirectsApi#redirectToGet")
    e.printStackTrace()
}
```

### Parameters
| **url** | **String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **statusCode** | [**Any**](.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="redirectToPatch"></a>
# **redirectToPatch**
> redirectToPatch()

302/3XX Redirects to the given URL.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = RedirectsApi()
try {
    apiInstance.redirectToPatch()
} catch (e: ClientException) {
    println("4xx response calling RedirectsApi#redirectToPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedirectsApi#redirectToPatch")
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

<a id="redirectToPost"></a>
# **redirectToPost**
> redirectToPost(url, statusCode)

302/3XX Redirects to the given URL.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = RedirectsApi()
val url : String = url_example // String | 
val statusCode : Any =  // Any | 
try {
    apiInstance.redirectToPost(url, statusCode)
} catch (e: ClientException) {
    println("4xx response calling RedirectsApi#redirectToPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedirectsApi#redirectToPost")
    e.printStackTrace()
}
```

### Parameters
| **url** | **String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **statusCode** | [**Any**](Any.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a id="redirectToPut"></a>
# **redirectToPut**
> redirectToPut(url, statusCode)

302/3XX Redirects to the given URL.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = RedirectsApi()
val url : String = url_example // String | 
val statusCode : Any =  // Any | 
try {
    apiInstance.redirectToPut(url, statusCode)
} catch (e: ClientException) {
    println("4xx response calling RedirectsApi#redirectToPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedirectsApi#redirectToPut")
    e.printStackTrace()
}
```

### Parameters
| **url** | **String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **statusCode** | [**Any**](Any.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a id="relativeRedirectNGet"></a>
# **relativeRedirectNGet**
> relativeRedirectNGet(n)

Relatively 302 Redirects n times.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = RedirectsApi()
val n : Any =  // Any | 
try {
    apiInstance.relativeRedirectNGet(n)
} catch (e: ClientException) {
    println("4xx response calling RedirectsApi#relativeRedirectNGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RedirectsApi#relativeRedirectNGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **n** | [**Any**](.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

