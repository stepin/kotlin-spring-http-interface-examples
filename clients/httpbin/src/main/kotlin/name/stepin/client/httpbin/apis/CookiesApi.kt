package name.stepin.client.httpbin.apis

import org.springframework.web.bind.annotation.*
import org.springframework.web.service.annotation.*

/**
 * the Cookies API
 */
@HttpExchange(
    url = "/",
)
interface CookiesApi {
    /**
     * Deletes cookie(s) as provided by the query string and redirects to cookie list.
     *
     * Responses:
     *  - 200: Redirect to cookie list
     *
     * @param freeform  (optional)
     * @return [Unit]
     */
    @GetExchange(
        url = "/cookies/delete",
    )
    suspend fun cookiesDeleteGet(
        @RequestParam("freeform") freeform: Any? = null,
    ): Unit

    /**
     * Returns cookie data.
     *
     * Responses:
     *  - 200: Set cookies.
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/cookies",
    )
    suspend fun cookiesGet(): Unit

    /**
     * Sets cookie(s) as provided by the query string and redirects to cookie list.
     *
     * Responses:
     *  - 200: Redirect to cookie list
     *
     * @param freeform  (optional)
     * @return [Unit]
     */
    @GetExchange(
        url = "/cookies/set",
    )
    suspend fun cookiesSetGet(
        @RequestParam("freeform") freeform: Any? = null,
    ): Unit

    /**
     * Sets a cookie and redirects to cookie list.
     *
     * Responses:
     *  - 200: Set cookies and redirects to cookie list.
     *
     * @param name
     * @param `value`
     * @return [Unit]
     */
    @GetExchange(
        url = "/cookies/set/{name}/{value}",
    )
    suspend fun cookiesSetNameValueGet(
        @PathVariable("name") name: String,
        @PathVariable("value") `value`: String,
    ): Unit
}
