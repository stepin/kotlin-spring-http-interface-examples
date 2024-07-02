package name.stepin.client.httpbin.apis

import org.springframework.web.bind.annotation.*
import org.springframework.web.service.annotation.*

/**
 * the ResponseFormats API
 */
@HttpExchange(
    url = "/",
)
interface ResponseFormatsApi {
    /**
     * Returns Brotli-encoded data.
     *
     * Responses:
     *  - 200: Brotli-encoded data.
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/brotli",
    )
    suspend fun brotliGet(): Unit

    /**
     * Returns Deflate-encoded data.
     *
     * Responses:
     *  - 200: Defalte-encoded data.
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/deflate",
    )
    suspend fun deflateGet(): Unit

    /**
     * Returns page denied by robots.txt rules.
     *
     * Responses:
     *  - 200: Denied message
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/deny",
    )
    suspend fun denyGet(): Unit

    /**
     * Returns a UTF-8 encoded body.
     *
     * Responses:
     *  - 200: Encoded UTF-8 content.
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/encoding/utf8",
    )
    suspend fun encodingUtf8Get(): Unit

    /**
     * Returns GZip-encoded data.
     *
     * Responses:
     *  - 200: GZip-encoded data.
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/gzip",
    )
    suspend fun gzipGet(): Unit

    /**
     * Returns a simple HTML document.
     *
     * Responses:
     *  - 200: An HTML page.
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/html",
    )
    suspend fun htmlGet(): Unit

    /**
     * Returns a simple JSON document.
     *
     * Responses:
     *  - 200: An JSON document.
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/json",
    )
    suspend fun jsonGet(): Unit

    /**
     * Returns some robots.txt rules.
     *
     * Responses:
     *  - 200: Robots file
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/robots.txt",
    )
    suspend fun robotsTxtGet(): Unit

    /**
     * Returns a simple XML document.
     *
     * Responses:
     *  - 200: An XML document.
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/xml",
    )
    suspend fun xmlGet(): Unit
}
