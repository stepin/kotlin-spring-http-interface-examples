package name.stepin.client.httpbin.apis

import org.springframework.web.bind.annotation.*
import org.springframework.web.service.annotation.*

/**
 * the ResponseInspection API
 */
@HttpExchange(
    url = "/",
)
interface ResponseInspectionApi {
    /**
     * Returns a 304 if an If-Modified-Since header or If-None-Match is present. Returns the same as a GET otherwise.
     *
     * Responses:
     *  - 200: Cached response
     *  - 304: Modified
     *
     * @param ifModifiedSince  (optional)
     * @param ifNoneMatch  (optional)
     * @return [Unit]
     */
    @GetExchange(
        url = "/cache",
    )
    suspend fun cacheGet(
        @RequestHeader("If-Modified-Since") ifModifiedSince: Any? = null,
        @RequestHeader("If-None-Match") ifNoneMatch: Any? = null,
    ): Unit

    /**
     * Sets a Cache-Control header for n seconds.
     *
     * Responses:
     *  - 200: Cache control set
     *
     * @param `value`
     * @return [Unit]
     */
    @GetExchange(
        url = "/cache/{value}",
    )
    suspend fun cacheValueGet(
        @PathVariable("value") `value`: Int,
    ): Unit

    /**
     * Assumes the resource has the given etag and responds to If-None-Match and If-Match headers appropriately.
     *
     * Responses:
     *  - 200: Normal response
     *  - 412: match
     *
     * @param ifNoneMatch  (optional)
     * @param ifMatch  (optional)
     * @return [Unit]
     */
    @GetExchange(
        url = "/etag/{etag}",
    )
    suspend fun etagEtagGet(
        @RequestHeader("If-None-Match") ifNoneMatch: Any? = null,
        @RequestHeader("If-Match") ifMatch: Any? = null,
    ): Unit

    /**
     * Returns a set of response headers from the query string.
     *
     * Responses:
     *  - 200: Response headers
     *
     * @param freeform  (optional)
     * @return [Unit]
     */
    @GetExchange(
        url = "/response-headers",
    )
    suspend fun responseHeadersGet(
        @RequestParam("freeform") freeform: Any? = null,
    ): Unit

    /**
     * Returns a set of response headers from the query string.
     *
     * Responses:
     *  - 200: Response headers
     *
     * @param freeform  (optional)
     * @return [Unit]
     */
    @PostExchange(
        url = "/response-headers",
    )
    suspend fun responseHeadersPost(
        @RequestParam("freeform") freeform: Any? = null,
    ): Unit
}
