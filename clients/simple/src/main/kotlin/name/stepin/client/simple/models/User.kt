/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport",
)

package name.stepin.client.simple.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 *
 * @param id
 * @param name
 * @param email
 */

data class User(
    @field:JsonProperty("id")
    val id: Int,
    @field:JsonProperty("name")
    val name: String,
    @field:JsonProperty("email")
    val email: String? = null,
)