# ResponseFormatsApi

All URIs are relative to *https://httpbin.org*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**brotliGet**](ResponseFormatsApi.md#brotliGet) | **Get** /brotli | Returns Brotli-encoded data. |
| [**deflateGet**](ResponseFormatsApi.md#deflateGet) | **Get** /deflate | Returns Deflate-encoded data. |
| [**denyGet**](ResponseFormatsApi.md#denyGet) | **Get** /deny | Returns page denied by robots.txt rules. |
| [**encodingUtf8Get**](ResponseFormatsApi.md#encodingUtf8Get) | **Get** /encoding/utf8 | Returns a UTF-8 encoded body. |
| [**gzipGet**](ResponseFormatsApi.md#gzipGet) | **Get** /gzip | Returns GZip-encoded data. |
| [**htmlGet**](ResponseFormatsApi.md#htmlGet) | **Get** /html | Returns a simple HTML document. |
| [**jsonGet**](ResponseFormatsApi.md#jsonGet) | **Get** /json | Returns a simple JSON document. |
| [**robotsTxtGet**](ResponseFormatsApi.md#robotsTxtGet) | **Get** /robots.txt | Returns some robots.txt rules. |
| [**xmlGet**](ResponseFormatsApi.md#xmlGet) | **Get** /xml | Returns a simple XML document. |


<a id="brotliGet"></a>
# **brotliGet**
> brotliGet()

Returns Brotli-encoded data.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ResponseFormatsApi()
try {
    apiInstance.brotliGet()
} catch (e: ClientException) {
    println("4xx response calling ResponseFormatsApi#brotliGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponseFormatsApi#brotliGet")
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

<a id="deflateGet"></a>
# **deflateGet**
> deflateGet()

Returns Deflate-encoded data.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ResponseFormatsApi()
try {
    apiInstance.deflateGet()
} catch (e: ClientException) {
    println("4xx response calling ResponseFormatsApi#deflateGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponseFormatsApi#deflateGet")
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

<a id="denyGet"></a>
# **denyGet**
> denyGet()

Returns page denied by robots.txt rules.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ResponseFormatsApi()
try {
    apiInstance.denyGet()
} catch (e: ClientException) {
    println("4xx response calling ResponseFormatsApi#denyGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponseFormatsApi#denyGet")
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

<a id="encodingUtf8Get"></a>
# **encodingUtf8Get**
> encodingUtf8Get()

Returns a UTF-8 encoded body.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ResponseFormatsApi()
try {
    apiInstance.encodingUtf8Get()
} catch (e: ClientException) {
    println("4xx response calling ResponseFormatsApi#encodingUtf8Get")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponseFormatsApi#encodingUtf8Get")
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

<a id="gzipGet"></a>
# **gzipGet**
> gzipGet()

Returns GZip-encoded data.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ResponseFormatsApi()
try {
    apiInstance.gzipGet()
} catch (e: ClientException) {
    println("4xx response calling ResponseFormatsApi#gzipGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponseFormatsApi#gzipGet")
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

<a id="htmlGet"></a>
# **htmlGet**
> htmlGet()

Returns a simple HTML document.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ResponseFormatsApi()
try {
    apiInstance.htmlGet()
} catch (e: ClientException) {
    println("4xx response calling ResponseFormatsApi#htmlGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponseFormatsApi#htmlGet")
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

<a id="jsonGet"></a>
# **jsonGet**
> jsonGet()

Returns a simple JSON document.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ResponseFormatsApi()
try {
    apiInstance.jsonGet()
} catch (e: ClientException) {
    println("4xx response calling ResponseFormatsApi#jsonGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponseFormatsApi#jsonGet")
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

<a id="robotsTxtGet"></a>
# **robotsTxtGet**
> robotsTxtGet()

Returns some robots.txt rules.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ResponseFormatsApi()
try {
    apiInstance.robotsTxtGet()
} catch (e: ClientException) {
    println("4xx response calling ResponseFormatsApi#robotsTxtGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponseFormatsApi#robotsTxtGet")
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

<a id="xmlGet"></a>
# **xmlGet**
> xmlGet()

Returns a simple XML document.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ResponseFormatsApi()
try {
    apiInstance.xmlGet()
} catch (e: ClientException) {
    println("4xx response calling ResponseFormatsApi#xmlGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResponseFormatsApi#xmlGet")
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

