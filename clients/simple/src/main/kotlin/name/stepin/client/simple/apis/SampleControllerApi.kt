package name.stepin.client.simple.apis

import name.stepin.client.simple.models.User
import org.springframework.web.bind.annotation.*
import org.springframework.web.service.annotation.*

/**
 * the SampleController API
 */
@HttpExchange(
    url = "/",
)
interface SampleControllerApi {
    /**
     *
     *
     * Responses:
     *  - 201: Created
     *
     * @param user
     * @return [User]
     */
    @PostExchange(
        url = "/sample",
        accept = ["application/json"],
    )
    suspend fun create(
        @RequestBody user: User,
    ): User

    /**
     *
     *
     * Responses:
     *  - 200: OK
     *
     * @param id
     * @return [Unit]
     */
    @DeleteExchange(
        url = "/sample/{id}",
    )
    suspend fun delete(
        @PathVariable("id") id: String,
    ): Unit

    /**
     *
     *
     * Responses:
     *  - 200: OK
     *
     * @param id
     * @param xApiKey
     * @param param1  (optional)
     * @return [String]
     */
    @GetExchange(
        url = "/sample/{id}",
    )
    suspend fun findById(
        @PathVariable("id") id: Long,
        @RequestHeader("X-Api-Key") xApiKey: String,
        @RequestParam("param1") param1: String? = null,
    ): String

    /**
     *
     *
     * Responses:
     *  - 200: OK
     *
     * @return [List<User>]
     */
    @GetExchange(
        url = "/sample/",
    )
    suspend fun list(): List<User>

    /**
     *
     *
     * Responses:
     *  - 200: OK
     *
     * @return [List<User>]
     */
    @GetExchange(
        url = "/sample/v2",
    )
    suspend fun listV2(): List<User>

    /**
     *
     *
     * Responses:
     *  - 200: OK
     *
     * @param id
     * @param user
     * @return [Unit]
     */
    @PutExchange(
        url = "/sample/{id}",
        accept = ["application/json"],
    )
    suspend fun update(
        @PathVariable("id") id: String,
        @RequestBody user: User,
    ): Unit
}
