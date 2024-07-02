package name.stepin.client.httpbin.apis

import org.springframework.web.bind.annotation.*
import org.springframework.web.service.annotation.*

/**
 * the RequestInspection API
 */
@HttpExchange(
    url = "/",
)
interface RequestInspectionApi {
    /**
     * Return the incoming request&#39;s HTTP headers.
     *
     * Responses:
     *  - 200: The request's headers.
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/headers",
    )
    suspend fun headersGet(): Unit

    /**
     * Returns the requester&#39;s IP Address.
     *
     * Responses:
     *  - 200: The Requester's IP Address.
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/ip",
    )
    suspend fun ipGet(): Unit

    /**
     * Return the incoming requests&#39;s User-Agent header.
     *
     * Responses:
     *  - 200: The request's User-Agent header.
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/user-agent",
    )
    suspend fun userAgentGet(): Unit
}
