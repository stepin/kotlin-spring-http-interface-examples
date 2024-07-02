# HTTPMethodsApi

All URIs are relative to *https://httpbin.org*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteDelete**](HTTPMethodsApi.md#deleteDelete) | **Delete** /delete | The request&#39;s DELETE parameters. |
| [**getGet**](HTTPMethodsApi.md#getGet) | **Get** /get | The request&#39;s query parameters. |
| [**patchPatch**](HTTPMethodsApi.md#patchPatch) | **Patch** /patch | The request&#39;s PATCH parameters. |
| [**postPost**](HTTPMethodsApi.md#postPost) | **Post** /post | The request&#39;s POST parameters. |
| [**putPut**](HTTPMethodsApi.md#putPut) | **Put** /put | The request&#39;s PUT parameters. |


<a id="deleteDelete"></a>
# **deleteDelete**
> deleteDelete()

The request&#39;s DELETE parameters.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = HTTPMethodsApi()
try {
    apiInstance.deleteDelete()
} catch (e: ClientException) {
    println("4xx response calling HTTPMethodsApi#deleteDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HTTPMethodsApi#deleteDelete")
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

<a id="getGet"></a>
# **getGet**
> getGet()

The request&#39;s query parameters.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = HTTPMethodsApi()
try {
    apiInstance.getGet()
} catch (e: ClientException) {
    println("4xx response calling HTTPMethodsApi#getGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HTTPMethodsApi#getGet")
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

<a id="patchPatch"></a>
# **patchPatch**
> patchPatch()

The request&#39;s PATCH parameters.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = HTTPMethodsApi()
try {
    apiInstance.patchPatch()
} catch (e: ClientException) {
    println("4xx response calling HTTPMethodsApi#patchPatch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HTTPMethodsApi#patchPatch")
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

<a id="postPost"></a>
# **postPost**
> postPost()

The request&#39;s POST parameters.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = HTTPMethodsApi()
try {
    apiInstance.postPost()
} catch (e: ClientException) {
    println("4xx response calling HTTPMethodsApi#postPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HTTPMethodsApi#postPost")
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

<a id="putPut"></a>
# **putPut**
> putPut()

The request&#39;s PUT parameters.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = HTTPMethodsApi()
try {
    apiInstance.putPut()
} catch (e: ClientException) {
    println("4xx response calling HTTPMethodsApi#putPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling HTTPMethodsApi#putPut")
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

