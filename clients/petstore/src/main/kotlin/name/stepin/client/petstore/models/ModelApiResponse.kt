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

package name.stepin.client.petstore.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 *
 * @param code
 * @param type
 * @param message
 */

data class ModelApiResponse(
    @field:JsonProperty("code")
    val code: Int? = null,
    @field:JsonProperty("type")
    val type: String? = null,
    @field:JsonProperty("message")
    val message: String? = null,
)