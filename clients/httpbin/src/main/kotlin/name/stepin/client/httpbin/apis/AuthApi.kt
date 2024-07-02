package name.stepin.client.httpbin.apis

import org.springframework.web.bind.annotation.*
import org.springframework.web.service.annotation.*

/**
 * the Auth API
 */
@HttpExchange(
    url = "/",
)
interface AuthApi {
    /**
     * Prompts the user for authorization using HTTP Basic Auth.
     *
     * Responses:
     *  - 200: Sucessful authentication.
     *  - 401: Unsuccessful authentication.
     *
     * @param user
     * @param passwd
     * @return [Unit]
     */
    @GetExchange(
        url = "/basic-auth/{user}/{passwd}",
    )
    suspend fun basicAuthUserPasswdGet(
        @PathVariable("user") user: String,
        @PathVariable("passwd") passwd: String,
    ): Unit

    /**
     * Prompts the user for authorization using bearer authentication.
     *
     * Responses:
     *  - 200: Sucessful authentication.
     *  - 401: Unsuccessful authentication.
     *
     * @param authorization  (optional)
     * @return [Unit]
     */
    @GetExchange(
        url = "/bearer",
    )
    suspend fun bearerGet(
        @RequestHeader("Authorization") authorization: Any? = null,
    ): Unit

    /**
     * Prompts the user for authorization using Digest Auth + Algorithm.
     *
     * Responses:
     *  - 200: Sucessful authentication.
     *  - 401: Unsuccessful authentication.
     *
     * @param qop auth or auth-int
     * @param user
     * @param passwd
     * @param algorithm MD5, SHA-256, SHA-512 (default to "MD5")
     * @return [Unit]
     */
    @GetExchange(
        url = "/digest-auth/{qop}/{user}/{passwd}/{algorithm}",
    )
    suspend fun digestAuthQopUserPasswdAlgorithmGet(
        @PathVariable("qop") qop: String,
        @PathVariable("user") user: String,
        @PathVariable("passwd") passwd: String,
        @PathVariable("algorithm") algorithm: String = "MD5",
    ): Unit

    /**
     * Prompts the user for authorization using Digest Auth + Algorithm.
     * allow settings the stale_after argument.
     * Responses:
     *  - 200: Sucessful authentication.
     *  - 401: Unsuccessful authentication.
     *
     * @param qop auth or auth-int
     * @param user
     * @param passwd
     * @param algorithm MD5, SHA-256, SHA-512 (default to "MD5")
     * @param staleAfter  (default to "never")
     * @return [Unit]
     */
    @GetExchange(
        url = "/digest-auth/{qop}/{user}/{passwd}/{algorithm}/{stale_after}",
    )
    suspend fun digestAuthQopUserPasswdAlgorithmStaleAfterGet(
        @PathVariable("qop") qop: String,
        @PathVariable("user") user: String,
        @PathVariable("passwd") passwd: String,
        @PathVariable("algorithm") algorithm: String = "MD5",
        @PathVariable("stale_after") staleAfter: String = "never",
    ): Unit

    /**
     * Prompts the user for authorization using Digest Auth.
     *
     * Responses:
     *  - 200: Sucessful authentication.
     *  - 401: Unsuccessful authentication.
     *
     * @param qop auth or auth-int
     * @param user
     * @param passwd
     * @return [Unit]
     */
    @GetExchange(
        url = "/digest-auth/{qop}/{user}/{passwd}",
    )
    suspend fun digestAuthQopUserPasswdGet(
        @PathVariable("qop") qop: String,
        @PathVariable("user") user: String,
        @PathVariable("passwd") passwd: String,
    ): Unit

    /**
     * Prompts the user for authorization using HTTP Basic Auth.
     *
     * Responses:
     *  - 200: Sucessful authentication.
     *  - 404: Unsuccessful authentication.
     *
     * @param user
     * @param passwd
     * @return [Unit]
     */
    @GetExchange(
        url = "/hidden-basic-auth/{user}/{passwd}",
    )
    suspend fun hiddenBasicAuthUserPasswdGet(
        @PathVariable("user") user: String,
        @PathVariable("passwd") passwd: String,
    ): Unit
}
