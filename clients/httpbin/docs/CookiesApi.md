# CookiesApi

All URIs are relative to *https://httpbin.org*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cookiesDeleteGet**](CookiesApi.md#cookiesDeleteGet) | **Get** /cookies/delete | Deletes cookie(s) as provided by the query string and redirects to cookie list. |
| [**cookiesGet**](CookiesApi.md#cookiesGet) | **Get** /cookies | Returns cookie data. |
| [**cookiesSetGet**](CookiesApi.md#cookiesSetGet) | **Get** /cookies/set | Sets cookie(s) as provided by the query string and redirects to cookie list. |
| [**cookiesSetNameValueGet**](CookiesApi.md#cookiesSetNameValueGet) | **Get** /cookies/set/{name}/{value} | Sets a cookie and redirects to cookie list. |


<a id="cookiesDeleteGet"></a>
# **cookiesDeleteGet**
> cookiesDeleteGet(freeform)

Deletes cookie(s) as provided by the query string and redirects to cookie list.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = CookiesApi()
val freeform : Any =  // Any | 
try {
    apiInstance.cookiesDeleteGet(freeform)
} catch (e: ClientException) {
    println("4xx response calling CookiesApi#cookiesDeleteGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CookiesApi#cookiesDeleteGet")
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

<a id="cookiesGet"></a>
# **cookiesGet**
> cookiesGet()

Returns cookie data.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = CookiesApi()
try {
    apiInstance.cookiesGet()
} catch (e: ClientException) {
    println("4xx response calling CookiesApi#cookiesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CookiesApi#cookiesGet")
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

<a id="cookiesSetGet"></a>
# **cookiesSetGet**
> cookiesSetGet(freeform)

Sets cookie(s) as provided by the query string and redirects to cookie list.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = CookiesApi()
val freeform : Any =  // Any | 
try {
    apiInstance.cookiesSetGet(freeform)
} catch (e: ClientException) {
    println("4xx response calling CookiesApi#cookiesSetGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CookiesApi#cookiesSetGet")
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

<a id="cookiesSetNameValueGet"></a>
# **cookiesSetNameValueGet**
> cookiesSetNameValueGet(name, `value`)

Sets a cookie and redirects to cookie list.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = CookiesApi()
val name : String = name_example // String | 
val `value` : String = `value`_example // String | 
try {
    apiInstance.cookiesSetNameValueGet(name, `value`)
} catch (e: ClientException) {
    println("4xx response calling CookiesApi#cookiesSetNameValueGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CookiesApi#cookiesSetNameValueGet")
    e.printStackTrace()
}
```

### Parameters
| **name** | **String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **&#x60;value&#x60;** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

