package name.stepin.client.petstore.apis

import com.fasterxml.jackson.annotation.JsonProperty
import name.stepin.client.petstore.models.ModelApiResponse
import name.stepin.client.petstore.models.Pet
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import org.springframework.web.service.annotation.*

/**
 * the Pet API
 */
@HttpExchange(
    url = "/",
)
interface PetApi {
    /**
     * Add a new pet to the store
     *
     * Responses:
     *  - 405: Invalid input
     *
     * @param body Pet object that needs to be added to the store
     * @return [Unit]
     */
    @PostExchange(
        url = "/pet",
        accept = ["application/json"],
    )
    suspend fun addPet(
        @RequestBody body: Pet,
    ): Unit

    /**
     * Deletes a pet
     *
     * Responses:
     *  - 400: Invalid ID supplied
     *  - 404: Pet not found
     *
     * @param petId Pet id to delete
     * @param apiKey  (optional)
     * @return [Unit]
     */
    @DeleteExchange(
        url = "/pet/{petId}",
    )
    suspend fun deletePet(
        @PathVariable("petId") petId: Long,
        @RequestHeader("api_key") apiKey: String? = null,
    ): Unit

    /**
     * enum for parameter status
     */
    enum class StatusFindPetsByStatus(
        val value: String,
    ) {
        @JsonProperty(value = "available")
        AVAILABLE("available"),

        @JsonProperty(value = "pending")
        PENDING("pending"),

        @JsonProperty(value = "sold")
        SOLD("sold"),
    }

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * Responses:
     *  - 200: successful operation
     *  - 400: Invalid status value
     *
     * @param status Status values that need to be considered for filter
     * @return [List<Pet>]
     */
    @GetExchange(
        url = "/pet/findByStatus",
    )
    suspend fun findPetsByStatus(
        @RequestParam("status") status: @JvmSuppressWildcards List<String>,
    ): List<Pet>

    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * Responses:
     *  - 200: successful operation
     *  - 400: Invalid tag value
     *
     * @param tags Tags to filter by
     * @return [List<Pet>]
     */
    @Deprecated("This api was deprecated")
    @GetExchange(
        url = "/pet/findByTags",
    )
    suspend fun findPetsByTags(
        @RequestParam("tags") tags: @JvmSuppressWildcards List<String>,
    ): List<Pet>

    /**
     * Find pet by ID
     * Returns a single pet
     * Responses:
     *  - 200: successful operation
     *  - 400: Invalid ID supplied
     *  - 404: Pet not found
     *
     * @param petId ID of pet to return
     * @return [Pet]
     */
    @GetExchange(
        url = "/pet/{petId}",
    )
    suspend fun getPetById(
        @PathVariable("petId") petId: Long,
    ): Pet

    /**
     * Update an existing pet
     *
     * Responses:
     *  - 400: Invalid ID supplied
     *  - 404: Pet not found
     *  - 405: Validation exception
     *
     * @param body Pet object that needs to be added to the store
     * @return [Unit]
     */
    @PutExchange(
        url = "/pet",
        accept = ["application/json"],
    )
    suspend fun updatePet(
        @RequestBody body: Pet,
    ): Unit

    /**
     * Updates a pet in the store with form data
     *
     * Responses:
     *  - 405: Invalid input
     *
     * @param petId ID of pet that needs to be updated
     * @param name Updated name of the pet (optional)
     * @param status Updated status of the pet (optional)
     * @return [Unit]
     */
    @PostExchange(
        url = "/pet/{petId}",
        accept = ["application/x-www-form-urlencoded"],
    )
    suspend fun updatePetWithForm(
        @PathVariable("petId") petId: Long,
        @RequestParam("name") name: String? = null,
        @RequestParam("status") status: String? = null,
    ): Unit

    /**
     * uploads an image
     *
     * Responses:
     *  - 200: successful operation
     *
     * @param petId ID of pet to update
     * @param additionalMetadata Additional data to pass to server (optional)
     * @param file file to upload (optional)
     * @return [ModelApiResponse]
     */
    @PostExchange(
        url = "/pet/{petId}/uploadImage",
        accept = ["multipart/form-data"],
        contentType = "application/json",
    )
    suspend fun uploadFile(
        @PathVariable("petId") petId: Long,
        @RequestPart("additionalMetadata") additionalMetadata: String? = null,
        @RequestPart file: MultipartFile? = null,
    ): ModelApiResponse
}
