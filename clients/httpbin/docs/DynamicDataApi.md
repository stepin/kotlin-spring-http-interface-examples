# DynamicDataApi

All URIs are relative to *https://httpbin.org*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**base64ValueGet**](DynamicDataApi.md#base64ValueGet) | **Get** /base64/{value} | Decodes base64url-encoded string. |
| [**bytesNGet**](DynamicDataApi.md#bytesNGet) | **Get** /bytes/{n} | Returns n random bytes generated with given seed |
| [**delayDelayDelete**](DynamicDataApi.md#delayDelayDelete) | **Delete** /delay/{delay} | Returns a delayed response (max of 10 seconds). |
| [**delayDelayGet**](DynamicDataApi.md#delayDelayGet) | **Get** /delay/{delay} | Returns a delayed response (max of 10 seconds). |
| [**delayDelayPatch**](DynamicDataApi.md#delayDelayPatch) | **Patch** /delay/{delay} | Returns a delayed response (max of 10 seconds). |
| [**delayDelayPost**](DynamicDataApi.md#delayDelayPost) | **Post** /delay/{delay} | Returns a delayed response (max of 10 seconds). |
| [**delayDelayPut**](DynamicDataApi.md#delayDelayPut) | **Put** /delay/{delay} | Returns a delayed response (max of 10 seconds). |
| [**dripGet**](DynamicDataApi.md#dripGet) | **Get** /drip | Drips data over a duration after an optional initial delay. |
| [**linksNOffsetGet**](DynamicDataApi.md#linksNOffsetGet) | **Get** /links/{n}/{offset} | Generate a page containing n links to other pages which do the same. |
| [**rangeNumbytesGet**](DynamicDataApi.md#rangeNumbytesGet) | **Get** /range/{numbytes} | Streams n random bytes generated with given seed, at given chunk size per packet. |
| [**streamBytesNGet**](DynamicDataApi.md#streamBytesNGet) | **Get** /stream-bytes/{n} | Streams n random bytes generated with given seed, at given chunk size per packet. |
| [**streamNGet**](DynamicDataApi.md#streamNGet) | **Get** /stream/{n} | Stream n JSON responses |
| [**uuidGet**](DynamicDataApi.md#uuidGet) | **Get** /uuid | Return a UUID4. |


<a id="base64ValueGet"></a>
# **base64ValueGet**
> base64ValueGet(`value`)

Decodes base64url-encoded string.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = DynamicDataApi()
val `value` : String = `value`_example // String | 
try {
    apiInstance.base64ValueGet(`value`)
} catch (e: ClientException) {
    println("4xx response calling DynamicDataApi#base64ValueGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DynamicDataApi#base64ValueGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **&#x60;value&#x60;** | **String**|  | [default to &quot;SFRUUEJJTiBpcyBhd2Vzb21l&quot;] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="bytesNGet"></a>
# **bytesNGet**
> bytesNGet(n)

Returns n random bytes generated with given seed

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = DynamicDataApi()
val n : Any =  // Any | 
try {
    apiInstance.bytesNGet(n)
} catch (e: ClientException) {
    println("4xx response calling DynamicDataApi#bytesNGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DynamicDataApi#bytesNGet")
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

<a id="delayDelayDelete"></a>
# **delayDelayDelete**
> delayDelayDelete(delay)

Returns a delayed response (max of 10 seconds).

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = DynamicDataApi()
val delay : Any =  // Any | 
try {
    apiInstance.delayDelayDelete(delay)
} catch (e: ClientException) {
    println("4xx response calling DynamicDataApi#delayDelayDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DynamicDataApi#delayDelayDelete")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **delay** | [**Any**](.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="delayDelayGet"></a>
# **delayDelayGet**
> delayDelayGet(delay)

Returns a delayed response (max of 10 seconds).

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = DynamicDataApi()
val delay : Any =  // Any | 
try {
    apiInstance.delayDelayGet(delay)
} catch (e: ClientException) {
    println("4xx response calling DynamicDataApi#delayDelayGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DynamicDataApi#delayDelayGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **delay** | [**Any**](.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="delayDelayPatch"></a>
# **delayDelayPatch**
> delayDelayPatch(delay)

Returns a delayed response (max of 10 seconds).

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = DynamicDataApi()
val delay : Any =  // Any | 
try {
    apiInstance.delayDelayPatch(delay)
} catch (e: ClientException) {
    println("4xx response calling DynamicDataApi#delayDelayPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DynamicDataApi#delayDelayPatch")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **delay** | [**Any**](.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="delayDelayPost"></a>
# **delayDelayPost**
> delayDelayPost(delay)

Returns a delayed response (max of 10 seconds).

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = DynamicDataApi()
val delay : Any =  // Any | 
try {
    apiInstance.delayDelayPost(delay)
} catch (e: ClientException) {
    println("4xx response calling DynamicDataApi#delayDelayPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DynamicDataApi#delayDelayPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **delay** | [**Any**](.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="delayDelayPut"></a>
# **delayDelayPut**
> delayDelayPut(delay)

Returns a delayed response (max of 10 seconds).

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = DynamicDataApi()
val delay : Any =  // Any | 
try {
    apiInstance.delayDelayPut(delay)
} catch (e: ClientException) {
    println("4xx response calling DynamicDataApi#delayDelayPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DynamicDataApi#delayDelayPut")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **delay** | [**Any**](.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="dripGet"></a>
# **dripGet**
> dripGet(duration, numbytes, code, delay)

Drips data over a duration after an optional initial delay.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = DynamicDataApi()
val duration : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The amount of time (in seconds) over which to drip each byte
val numbytes : Int = 56 // Int | The number of bytes to respond with
val code : Int = 56 // Int | The response code that will be returned
val delay : java.math.BigDecimal = 8.14 // java.math.BigDecimal | The amount of time (in seconds) to delay before responding
try {
    apiInstance.dripGet(duration, numbytes, code, delay)
} catch (e: ClientException) {
    println("4xx response calling DynamicDataApi#dripGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DynamicDataApi#dripGet")
    e.printStackTrace()
}
```

### Parameters
| **duration** | **java.math.BigDecimal**| The amount of time (in seconds) over which to drip each byte | [optional] [default to 2.0] |
| **numbytes** | **Int**| The number of bytes to respond with | [optional] [default to 10] |
| **code** | **Int**| The response code that will be returned | [optional] [default to 200] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **delay** | **java.math.BigDecimal**| The amount of time (in seconds) to delay before responding | [optional] [default to 2.0] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="linksNOffsetGet"></a>
# **linksNOffsetGet**
> linksNOffsetGet(n, offset)

Generate a page containing n links to other pages which do the same.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = DynamicDataApi()
val n : Any =  // Any | 
val offset : Any =  // Any | 
try {
    apiInstance.linksNOffsetGet(n, offset)
} catch (e: ClientException) {
    println("4xx response calling DynamicDataApi#linksNOffsetGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DynamicDataApi#linksNOffsetGet")
    e.printStackTrace()
}
```

### Parameters
| **n** | [**Any**](.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **offset** | [**Any**](.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="rangeNumbytesGet"></a>
# **rangeNumbytesGet**
> rangeNumbytesGet(numbytes)

Streams n random bytes generated with given seed, at given chunk size per packet.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = DynamicDataApi()
val numbytes : Any =  // Any | 
try {
    apiInstance.rangeNumbytesGet(numbytes)
} catch (e: ClientException) {
    println("4xx response calling DynamicDataApi#rangeNumbytesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DynamicDataApi#rangeNumbytesGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **numbytes** | [**Any**](.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="streamBytesNGet"></a>
# **streamBytesNGet**
> streamBytesNGet(n)

Streams n random bytes generated with given seed, at given chunk size per packet.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = DynamicDataApi()
val n : Any =  // Any | 
try {
    apiInstance.streamBytesNGet(n)
} catch (e: ClientException) {
    println("4xx response calling DynamicDataApi#streamBytesNGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DynamicDataApi#streamBytesNGet")
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

<a id="streamNGet"></a>
# **streamNGet**
> streamNGet(n)

Stream n JSON responses

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = DynamicDataApi()
val n : Any =  // Any | 
try {
    apiInstance.streamNGet(n)
} catch (e: ClientException) {
    println("4xx response calling DynamicDataApi#streamNGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DynamicDataApi#streamNGet")
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

<a id="uuidGet"></a>
# **uuidGet**
> uuidGet()

Return a UUID4.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = DynamicDataApi()
try {
    apiInstance.uuidGet()
} catch (e: ClientException) {
    println("4xx response calling DynamicDataApi#uuidGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DynamicDataApi#uuidGet")
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

