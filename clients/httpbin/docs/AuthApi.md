# AuthApi

All URIs are relative to *https://httpbin.org*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**basicAuthUserPasswdGet**](AuthApi.md#basicAuthUserPasswdGet) | **Get** /basic-auth/{user}/{passwd} | Prompts the user for authorization using HTTP Basic Auth. |
| [**bearerGet**](AuthApi.md#bearerGet) | **Get** /bearer | Prompts the user for authorization using bearer authentication. |
| [**digestAuthQopUserPasswdAlgorithmGet**](AuthApi.md#digestAuthQopUserPasswdAlgorithmGet) | **Get** /digest-auth/{qop}/{user}/{passwd}/{algorithm} | Prompts the user for authorization using Digest Auth + Algorithm. |
| [**digestAuthQopUserPasswdAlgorithmStaleAfterGet**](AuthApi.md#digestAuthQopUserPasswdAlgorithmStaleAfterGet) | **Get** /digest-auth/{qop}/{user}/{passwd}/{algorithm}/{stale_after} | Prompts the user for authorization using Digest Auth + Algorithm. |
| [**digestAuthQopUserPasswdGet**](AuthApi.md#digestAuthQopUserPasswdGet) | **Get** /digest-auth/{qop}/{user}/{passwd} | Prompts the user for authorization using Digest Auth. |
| [**hiddenBasicAuthUserPasswdGet**](AuthApi.md#hiddenBasicAuthUserPasswdGet) | **Get** /hidden-basic-auth/{user}/{passwd} | Prompts the user for authorization using HTTP Basic Auth. |


<a id="basicAuthUserPasswdGet"></a>
# **basicAuthUserPasswdGet**
> basicAuthUserPasswdGet(user, passwd)

Prompts the user for authorization using HTTP Basic Auth.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = AuthApi()
val user : String = user_example // String | 
val passwd : String = passwd_example // String | 
try {
    apiInstance.basicAuthUserPasswdGet(user, passwd)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#basicAuthUserPasswdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#basicAuthUserPasswdGet")
    e.printStackTrace()
}
```

### Parameters
| **user** | **String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **passwd** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="bearerGet"></a>
# **bearerGet**
> bearerGet(authorization)

Prompts the user for authorization using bearer authentication.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = AuthApi()
val authorization : Any =  // Any | 
try {
    apiInstance.bearerGet(authorization)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#bearerGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#bearerGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **authorization** | [**Any**](.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="digestAuthQopUserPasswdAlgorithmGet"></a>
# **digestAuthQopUserPasswdAlgorithmGet**
> digestAuthQopUserPasswdAlgorithmGet(qop, user, passwd, algorithm)

Prompts the user for authorization using Digest Auth + Algorithm.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = AuthApi()
val qop : String = qop_example // String | auth or auth-int
val user : String = user_example // String | 
val passwd : String = passwd_example // String | 
val algorithm : String = algorithm_example // String | MD5, SHA-256, SHA-512
try {
    apiInstance.digestAuthQopUserPasswdAlgorithmGet(qop, user, passwd, algorithm)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#digestAuthQopUserPasswdAlgorithmGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#digestAuthQopUserPasswdAlgorithmGet")
    e.printStackTrace()
}
```

### Parameters
| **qop** | **String**| auth or auth-int | |
| **user** | **String**|  | |
| **passwd** | **String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **algorithm** | **String**| MD5, SHA-256, SHA-512 | [default to &quot;MD5&quot;] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="digestAuthQopUserPasswdAlgorithmStaleAfterGet"></a>
# **digestAuthQopUserPasswdAlgorithmStaleAfterGet**
> digestAuthQopUserPasswdAlgorithmStaleAfterGet(qop, user, passwd, algorithm, staleAfter)

Prompts the user for authorization using Digest Auth + Algorithm.

allow settings the stale_after argument. 

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = AuthApi()
val qop : String = qop_example // String | auth or auth-int
val user : String = user_example // String | 
val passwd : String = passwd_example // String | 
val algorithm : String = algorithm_example // String | MD5, SHA-256, SHA-512
val staleAfter : String = staleAfter_example // String | 
try {
    apiInstance.digestAuthQopUserPasswdAlgorithmStaleAfterGet(qop, user, passwd, algorithm, staleAfter)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#digestAuthQopUserPasswdAlgorithmStaleAfterGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#digestAuthQopUserPasswdAlgorithmStaleAfterGet")
    e.printStackTrace()
}
```

### Parameters
| **qop** | **String**| auth or auth-int | |
| **user** | **String**|  | |
| **passwd** | **String**|  | |
| **algorithm** | **String**| MD5, SHA-256, SHA-512 | [default to &quot;MD5&quot;] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **staleAfter** | **String**|  | [default to &quot;never&quot;] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="digestAuthQopUserPasswdGet"></a>
# **digestAuthQopUserPasswdGet**
> digestAuthQopUserPasswdGet(qop, user, passwd)

Prompts the user for authorization using Digest Auth.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = AuthApi()
val qop : String = qop_example // String | auth or auth-int
val user : String = user_example // String | 
val passwd : String = passwd_example // String | 
try {
    apiInstance.digestAuthQopUserPasswdGet(qop, user, passwd)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#digestAuthQopUserPasswdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#digestAuthQopUserPasswdGet")
    e.printStackTrace()
}
```

### Parameters
| **qop** | **String**| auth or auth-int | |
| **user** | **String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **passwd** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="hiddenBasicAuthUserPasswdGet"></a>
# **hiddenBasicAuthUserPasswdGet**
> hiddenBasicAuthUserPasswdGet(user, passwd)

Prompts the user for authorization using HTTP Basic Auth.

### Example
```kotlin
// Import classes:
//import name.stepin.client.httpbin.infrastructure.*
//import name.stepin.client.httpbin.models.*

val apiInstance = AuthApi()
val user : String = user_example // String | 
val passwd : String = passwd_example // String | 
try {
    apiInstance.hiddenBasicAuthUserPasswdGet(user, passwd)
} catch (e: ClientException) {
    println("4xx response calling AuthApi#hiddenBasicAuthUserPasswdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AuthApi#hiddenBasicAuthUserPasswdGet")
    e.printStackTrace()
}
```

### Parameters
| **user** | **String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **passwd** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

