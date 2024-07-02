package name.stepin.client.httpbin.apis

import org.springframework.web.bind.annotation.*
import org.springframework.web.service.annotation.*

/**
 * the Redirects API
 */
@HttpExchange(
    url = "/",
)
interface RedirectsApi {
    /**
     * Absolutely 302 Redirects n times.
     *
     * Responses:
     *  - 302: A redirection.
     *
     * @param n
     * @return [Unit]
     */
    @GetExchange(
        url = "/absolute-redirect/{n}",
    )
    suspend fun absoluteRedirectNGet(
        @PathVariable("n") n: Any,
    ): Unit

    /**
     * 302 Redirects n times.
     *
     * Responses:
     *  - 302: A redirection.
     *
     * @param n
     * @return [Unit]
     */
    @GetExchange(
        url = "/redirect/{n}",
    )
    suspend fun redirectNGet(
        @PathVariable("n") n: Any,
    ): Unit

    /**
     * 302/3XX Redirects to the given URL.
     *
     * Responses:
     *  - 302: A redirection.
     *
     * @return [Unit]
     */
    @DeleteExchange(
        url = "/redirect-to",
    )
    suspend fun redirectToDelete(): Unit

    /**
     * 302/3XX Redirects to the given URL.
     *
     * Responses:
     *  - 302: A redirection.
     *
     * @param url
     * @param statusCode  (optional)
     * @return [Unit]
     */
    @GetExchange(
        url = "/redirect-to",
    )
    suspend fun redirectToGet(
        @RequestParam("url") url: String,
        @RequestParam("status_code") statusCode: Any? = null,
    ): Unit

    /**
     * 302/3XX Redirects to the given URL.
     *
     * Responses:
     *  - 302: A redirection.
     *
     * @return [Unit]
     */
    @PatchExchange(
        url = "/redirect-to",
    )
    suspend fun redirectToPatch(): Unit

    /**
     * 302/3XX Redirects to the given URL.
     *
     * Responses:
     *  - 302: A redirection.
     *
     * @param url
     * @param statusCode  (optional)
     * @return [Unit]
     */
    @PostExchange(
        url = "/redirect-to",
        accept = ["multipart/form-data"],
    )
    suspend fun redirectToPost(
        @RequestPart("url") url: String,
        @RequestPart("status_code") statusCode: Any? = null,
    ): Unit

    /**
     * 302/3XX Redirects to the given URL.
     *
     * Responses:
     *  - 302: A redirection.
     *
     * @param url
     * @param statusCode  (optional)
     * @return [Unit]
     */
    @PutExchange(
        url = "/redirect-to",
        accept = ["multipart/form-data"],
    )
    suspend fun redirectToPut(
        @RequestPart("url") url: String,
        @RequestPart("status_code") statusCode: Any? = null,
    ): Unit

    /**
     * Relatively 302 Redirects n times.
     *
     * Responses:
     *  - 302: A redirection.
     *
     * @param n
     * @return [Unit]
     */
    @GetExchange(
        url = "/relative-redirect/{n}",
    )
    suspend fun relativeRedirectNGet(
        @PathVariable("n") n: Any,
    ): Unit
}
