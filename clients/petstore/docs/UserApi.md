# UserApi

All URIs are relative to *https://petstore.swagger.io/v2*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createUser**](UserApi.md#createUser) | **Post** /user | Create user |
| [**createUsersWithArrayInput**](UserApi.md#createUsersWithArrayInput) | **Post** /user/createWithArray | Creates list of users with given input array |
| [**createUsersWithListInput**](UserApi.md#createUsersWithListInput) | **Post** /user/createWithList | Creates list of users with given input array |
| [**deleteUser**](UserApi.md#deleteUser) | **Delete** /user/{username} | Delete user |
| [**getUserByName**](UserApi.md#getUserByName) | **Get** /user/{username} | Get user by user name |
| [**loginUser**](UserApi.md#loginUser) | **Get** /user/login | Logs user into the system |
| [**logoutUser**](UserApi.md#logoutUser) | **Get** /user/logout | Logs out current logged in user session |
| [**updateUser**](UserApi.md#updateUser) | **Put** /user/{username} | Updated user |


<a id="createUser"></a>
# **createUser**
> createUser(body)

Create user

This can only be done by the logged in user.

### Example
```kotlin
// Import classes:
//import name.stepin.client.petstore.infrastructure.*
//import name.stepin.client.petstore.models.*

val apiInstance = UserApi()
val body : User =  // User | Created user object
try {
    apiInstance.createUser(body)
} catch (e: ClientException) {
    println("4xx response calling UserApi#createUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#createUser")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**User**](User.md)| Created user object | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="createUsersWithArrayInput"></a>
# **createUsersWithArrayInput**
> createUsersWithArrayInput(body)

Creates list of users with given input array

### Example
```kotlin
// Import classes:
//import name.stepin.client.petstore.infrastructure.*
//import name.stepin.client.petstore.models.*

val apiInstance = UserApi()
val body : List<User> =  // List<User> | List of user object
try {
    apiInstance.createUsersWithArrayInput(body)
} catch (e: ClientException) {
    println("4xx response calling UserApi#createUsersWithArrayInput")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#createUsersWithArrayInput")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**List&lt;User&gt;**](User.md)| List of user object | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="createUsersWithListInput"></a>
# **createUsersWithListInput**
> createUsersWithListInput(body)

Creates list of users with given input array

### Example
```kotlin
// Import classes:
//import name.stepin.client.petstore.infrastructure.*
//import name.stepin.client.petstore.models.*

val apiInstance = UserApi()
val body : List<User> =  // List<User> | List of user object
try {
    apiInstance.createUsersWithListInput(body)
} catch (e: ClientException) {
    println("4xx response calling UserApi#createUsersWithListInput")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#createUsersWithListInput")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**List&lt;User&gt;**](User.md)| List of user object | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="deleteUser"></a>
# **deleteUser**
> deleteUser(username)

Delete user

This can only be done by the logged in user.

### Example
```kotlin
// Import classes:
//import name.stepin.client.petstore.infrastructure.*
//import name.stepin.client.petstore.models.*

val apiInstance = UserApi()
val username : String = username_example // String | The name that needs to be deleted
try {
    apiInstance.deleteUser(username)
} catch (e: ClientException) {
    println("4xx response calling UserApi#deleteUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#deleteUser")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **username** | **String**| The name that needs to be deleted | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="getUserByName"></a>
# **getUserByName**
> User getUserByName(username)

Get user by user name

### Example
```kotlin
// Import classes:
//import name.stepin.client.petstore.infrastructure.*
//import name.stepin.client.petstore.models.*

val apiInstance = UserApi()
val username : String = username_example // String | The name that needs to be fetched. Use user1 for testing. 
try {
    val result : User = apiInstance.getUserByName(username)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getUserByName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getUserByName")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **username** | **String**| The name that needs to be fetched. Use user1 for testing.  | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="loginUser"></a>
# **loginUser**
> String loginUser(username, password)

Logs user into the system

### Example
```kotlin
// Import classes:
//import name.stepin.client.petstore.infrastructure.*
//import name.stepin.client.petstore.models.*

val apiInstance = UserApi()
val username : String = username_example // String | The user name for login
val password : String = password_example // String | The password for login in clear text
try {
    val result : String = apiInstance.loginUser(username, password)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#loginUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#loginUser")
    e.printStackTrace()
}
```

### Parameters
| **username** | **String**| The user name for login | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **password** | **String**| The password for login in clear text | |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="logoutUser"></a>
# **logoutUser**
> logoutUser()

Logs out current logged in user session

### Example
```kotlin
// Import classes:
//import name.stepin.client.petstore.infrastructure.*
//import name.stepin.client.petstore.models.*

val apiInstance = UserApi()
try {
    apiInstance.logoutUser()
} catch (e: ClientException) {
    println("4xx response calling UserApi#logoutUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#logoutUser")
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

<a id="updateUser"></a>
# **updateUser**
> updateUser(username, body)

Updated user

This can only be done by the logged in user.

### Example
```kotlin
// Import classes:
//import name.stepin.client.petstore.infrastructure.*
//import name.stepin.client.petstore.models.*

val apiInstance = UserApi()
val username : String = username_example // String | name that need to be updated
val body : User =  // User | Updated user object
try {
    apiInstance.updateUser(username, body)
} catch (e: ClientException) {
    println("4xx response calling UserApi#updateUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#updateUser")
    e.printStackTrace()
}
```

### Parameters
| **username** | **String**| name that need to be updated | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**User**](User.md)| Updated user object | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

