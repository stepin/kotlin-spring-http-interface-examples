# ImagesApi

All URIs are relative to *https://httpbin.org*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**imageGet**](ImagesApi.md#imageGet) | **Get** /image | Returns a simple image of the type suggest by the Accept header. |
| [**imageJpegGet**](ImagesApi.md#imageJpegGet) | **Get** /image/jpeg | Returns a simple JPEG image. |
| [**imagePngGet**](ImagesApi.md#imagePngGet) | **Get** /image/png | Returns a simple PNG image. |
| [**imageSvgGet**](ImagesApi.md#imageSvgGet) | **Get** /image/svg | Returns a simple SVG image. |
| [**imageWebpGet**](ImagesApi.md#imageWebpGet) | **Get** /image/webp | Returns a simple WEBP image. |


<a id="imageGet"></a>
# **imageGet**
> imageGet()

Returns a simple image of the type suggest by the Accept header.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ImagesApi()
try {
    apiInstance.imageGet()
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#imageGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#imageGet")
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

<a id="imageJpegGet"></a>
# **imageJpegGet**
> imageJpegGet()

Returns a simple JPEG image.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ImagesApi()
try {
    apiInstance.imageJpegGet()
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#imageJpegGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#imageJpegGet")
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

<a id="imagePngGet"></a>
# **imagePngGet**
> imagePngGet()

Returns a simple PNG image.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ImagesApi()
try {
    apiInstance.imagePngGet()
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#imagePngGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#imagePngGet")
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

<a id="imageSvgGet"></a>
# **imageSvgGet**
> imageSvgGet()

Returns a simple SVG image.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ImagesApi()
try {
    apiInstance.imageSvgGet()
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#imageSvgGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#imageSvgGet")
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

<a id="imageWebpGet"></a>
# **imageWebpGet**
> imageWebpGet()

Returns a simple WEBP image.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = ImagesApi()
try {
    apiInstance.imageWebpGet()
} catch (e: ClientException) {
    println("4xx response calling ImagesApi#imageWebpGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ImagesApi#imageWebpGet")
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

