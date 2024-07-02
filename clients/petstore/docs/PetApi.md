# PetApi

All URIs are relative to *https://petstore.swagger.io/v2*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addPet**](PetApi.md#addPet) | **Post** /pet | Add a new pet to the store |
| [**deletePet**](PetApi.md#deletePet) | **Delete** /pet/{petId} | Deletes a pet |
| [**findPetsByStatus**](PetApi.md#findPetsByStatus) | **Get** /pet/findByStatus | Finds Pets by status |
| [**findPetsByTags**](PetApi.md#findPetsByTags) | **Get** /pet/findByTags | Finds Pets by tags |
| [**getPetById**](PetApi.md#getPetById) | **Get** /pet/{petId} | Find pet by ID |
| [**updatePet**](PetApi.md#updatePet) | **Put** /pet | Update an existing pet |
| [**updatePetWithForm**](PetApi.md#updatePetWithForm) | **Post** /pet/{petId} | Updates a pet in the store with form data |
| [**uploadFile**](PetApi.md#uploadFile) | **Post** /pet/{petId}/uploadImage | uploads an image |


<a id="addPet"></a>
# **addPet**
> addPet(body)

Add a new pet to the store

### Example
```kotlin
// Import classes:
//import name.stepin.client.petstore.infrastructure.*
//import name.stepin.client.petstore.models.*

val apiInstance = PetApi()
val body : Pet =  // Pet | Pet object that needs to be added to the store
try {
    apiInstance.addPet(body)
} catch (e: ClientException) {
    println("4xx response calling PetApi#addPet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PetApi#addPet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Pet**](Pet.md)| Pet object that needs to be added to the store | |

### Return type

null (empty response body)

### Authorization


Configure petstore_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="deletePet"></a>
# **deletePet**
> deletePet(petId, apiKey)

Deletes a pet

### Example
```kotlin
// Import classes:
//import name.stepin.client.petstore.infrastructure.*
//import name.stepin.client.petstore.models.*

val apiInstance = PetApi()
val petId : Long = 789 // Long | Pet id to delete
val apiKey : String = apiKey_example // String | 
try {
    apiInstance.deletePet(petId, apiKey)
} catch (e: ClientException) {
    println("4xx response calling PetApi#deletePet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PetApi#deletePet")
    e.printStackTrace()
}
```

### Parameters
| **petId** | **Long**| Pet id to delete | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **apiKey** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure petstore_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="findPetsByStatus"></a>
# **findPetsByStatus**
> List&lt;Pet&gt; findPetsByStatus(status)

Finds Pets by status

Multiple status values can be provided with comma separated strings

### Example
```kotlin
// Import classes:
//import name.stepin.client.petstore.infrastructure.*
//import name.stepin.client.petstore.models.*

val apiInstance = PetApi()
val status : List<String> =  // List<String> | Status values that need to be considered for filter
try {
    val result : List<Pet> = apiInstance.findPetsByStatus(status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PetApi#findPetsByStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PetApi#findPetsByStatus")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **status** | [**List&lt;String&gt;**](String.md)| Status values that need to be considered for filter | [enum: available, pending, sold] |

### Return type

[**List&lt;Pet&gt;**](Pet.md)

### Authorization


Configure petstore_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="findPetsByTags"></a>
# **findPetsByTags**
> List&lt;Pet&gt; findPetsByTags(tags)

Finds Pets by tags

Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.

### Example
```kotlin
// Import classes:
//import name.stepin.client.petstore.infrastructure.*
//import name.stepin.client.petstore.models.*

val apiInstance = PetApi()
val tags : List<String> =  // List<String> | Tags to filter by
try {
    val result : List<Pet> = apiInstance.findPetsByTags(tags)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PetApi#findPetsByTags")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PetApi#findPetsByTags")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tags** | [**List&lt;String&gt;**](String.md)| Tags to filter by | |

### Return type

[**List&lt;Pet&gt;**](Pet.md)

### Authorization


Configure petstore_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="getPetById"></a>
# **getPetById**
> Pet getPetById(petId)

Find pet by ID

Returns a single pet

### Example
```kotlin
// Import classes:
//import name.stepin.client.petstore.infrastructure.*
//import name.stepin.client.petstore.models.*

val apiInstance = PetApi()
val petId : Long = 789 // Long | ID of pet to return
try {
    val result : Pet = apiInstance.getPetById(petId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PetApi#getPetById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PetApi#getPetById")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **petId** | **Long**| ID of pet to return | |

### Return type

[**Pet**](Pet.md)

### Authorization


Configure api_key:
    ApiClient.apiKey["api_key"] = ""
    ApiClient.apiKeyPrefix["api_key"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="updatePet"></a>
# **updatePet**
> updatePet(body)

Update an existing pet

### Example
```kotlin
// Import classes:
//import name.stepin.client.petstore.infrastructure.*
//import name.stepin.client.petstore.models.*

val apiInstance = PetApi()
val body : Pet =  // Pet | Pet object that needs to be added to the store
try {
    apiInstance.updatePet(body)
} catch (e: ClientException) {
    println("4xx response calling PetApi#updatePet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PetApi#updatePet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | [**Pet**](Pet.md)| Pet object that needs to be added to the store | |

### Return type

null (empty response body)

### Authorization


Configure petstore_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="updatePetWithForm"></a>
# **updatePetWithForm**
> updatePetWithForm(petId, name, status)

Updates a pet in the store with form data

### Example
```kotlin
// Import classes:
//import name.stepin.client.petstore.infrastructure.*
//import name.stepin.client.petstore.models.*

val apiInstance = PetApi()
val petId : Long = 789 // Long | ID of pet that needs to be updated
val name : String = name_example // String | Updated name of the pet
val status : String = status_example // String | Updated status of the pet
try {
    apiInstance.updatePetWithForm(petId, name, status)
} catch (e: ClientException) {
    println("4xx response calling PetApi#updatePetWithForm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PetApi#updatePetWithForm")
    e.printStackTrace()
}
```

### Parameters
| **petId** | **Long**| ID of pet that needs to be updated | |
| **name** | **String**| Updated name of the pet | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **status** | **String**| Updated status of the pet | [optional] |

### Return type

null (empty response body)

### Authorization


Configure petstore_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: Not defined

<a id="uploadFile"></a>
# **uploadFile**
> ModelApiResponse uploadFile(petId, additionalMetadata, file)

uploads an image

### Example
```kotlin
// Import classes:
//import name.stepin.client.petstore.infrastructure.*
//import name.stepin.client.petstore.models.*

val apiInstance = PetApi()
val petId : Long = 789 // Long | ID of pet to update
val additionalMetadata : String = additionalMetadata_example // String | Additional data to pass to server
val file : java.io.File = BINARY_DATA_HERE // java.io.File | file to upload
try {
    val result : ModelApiResponse = apiInstance.uploadFile(petId, additionalMetadata, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PetApi#uploadFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PetApi#uploadFile")
    e.printStackTrace()
}
```

### Parameters
| **petId** | **Long**| ID of pet to update | |
| **additionalMetadata** | **String**| Additional data to pass to server | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**| file to upload | [optional] |

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization


Configure petstore_auth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json
