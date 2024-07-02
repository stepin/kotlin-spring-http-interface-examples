package name.stepin.client.httpbin.apis

import org.springframework.web.bind.annotation.*
import org.springframework.web.service.annotation.*

/**
 * the DynamicData API
 */
@HttpExchange(
    url = "/",
)
interface DynamicDataApi {
    /**
     * Decodes base64url-encoded string.
     *
     * Responses:
     *  - 200: Decoded base64 content.
     *
     * @param `value`  (default to "SFRUUEJJTiBpcyBhd2Vzb21l")
     * @return [Unit]
     */
    @GetExchange(
        url = "/base64/{value}",
    )
    suspend fun base64ValueGet(
        @PathVariable("value") `value`: String = "SFRUUEJJTiBpcyBhd2Vzb21l",
    ): Unit

    /**
     * Returns n random bytes generated with given seed
     *
     * Responses:
     *  - 200: Bytes.
     *
     * @param n
     * @return [Unit]
     */
    @GetExchange(
        url = "/bytes/{n}",
    )
    suspend fun bytesNGet(
        @PathVariable("n") n: Any,
    ): Unit

    /**
     * Returns a delayed response (max of 10 seconds).
     *
     * Responses:
     *  - 200: A delayed response.
     *
     * @param delay
     * @return [Unit]
     */
    @DeleteExchange(
        url = "/delay/{delay}",
    )
    suspend fun delayDelayDelete(
        @PathVariable("delay") delay: Any,
    ): Unit

    /**
     * Returns a delayed response (max of 10 seconds).
     *
     * Responses:
     *  - 200: A delayed response.
     *
     * @param delay
     * @return [Unit]
     */
    @GetExchange(
        url = "/delay/{delay}",
    )
    suspend fun delayDelayGet(
        @PathVariable("delay") delay: Any,
    ): Unit

    /**
     * Returns a delayed response (max of 10 seconds).
     *
     * Responses:
     *  - 200: A delayed response.
     *
     * @param delay
     * @return [Unit]
     */
    @PatchExchange(
        url = "/delay/{delay}",
    )
    suspend fun delayDelayPatch(
        @PathVariable("delay") delay: Any,
    ): Unit

    /**
     * Returns a delayed response (max of 10 seconds).
     *
     * Responses:
     *  - 200: A delayed response.
     *
     * @param delay
     * @return [Unit]
     */
    @PostExchange(
        url = "/delay/{delay}",
    )
    suspend fun delayDelayPost(
        @PathVariable("delay") delay: Any,
    ): Unit

    /**
     * Returns a delayed response (max of 10 seconds).
     *
     * Responses:
     *  - 200: A delayed response.
     *
     * @param delay
     * @return [Unit]
     */
    @PutExchange(
        url = "/delay/{delay}",
    )
    suspend fun delayDelayPut(
        @PathVariable("delay") delay: Any,
    ): Unit

    /**
     * Drips data over a duration after an optional initial delay.
     *
     * Responses:
     *  - 200: A dripped response.
     *
     * @param duration The amount of time (in seconds) over which to drip each byte (optional, default to 2.0)
     * @param numbytes The number of bytes to respond with (optional, default to 10)
     * @param code The response code that will be returned (optional, default to 200)
     * @param delay The amount of time (in seconds) to delay before responding (optional, default to 2.0)
     * @return [Unit]
     */
    @GetExchange(
        url = "/drip",
    )
    suspend fun dripGet(
        @RequestParam("duration") duration: java.math.BigDecimal? = java.math.BigDecimal("2.0"),
        @RequestParam("numbytes") numbytes: Int? = 10,
        @RequestParam("code") code: Int? = 200,
        @RequestParam("delay") delay: java.math.BigDecimal? = java.math.BigDecimal("2.0"),
    ): Unit

    /**
     * Generate a page containing n links to other pages which do the same.
     *
     * Responses:
     *  - 200: HTML links.
     *
     * @param n
     * @param offset
     * @return [Unit]
     */
    @GetExchange(
        url = "/links/{n}/{offset}",
    )
    suspend fun linksNOffsetGet(
        @PathVariable("n") n: Any,
        @PathVariable("offset") offset: Any,
    ): Unit

    /**
     * Streams n random bytes generated with given seed, at given chunk size per packet.
     *
     * Responses:
     *  - 200: Bytes.
     *
     * @param numbytes
     * @return [Unit]
     */
    @GetExchange(
        url = "/range/{numbytes}",
    )
    suspend fun rangeNumbytesGet(
        @PathVariable("numbytes") numbytes: Any,
    ): Unit

    /**
     * Streams n random bytes generated with given seed, at given chunk size per packet.
     *
     * Responses:
     *  - 200: Bytes.
     *
     * @param n
     * @return [Unit]
     */
    @GetExchange(
        url = "/stream-bytes/{n}",
    )
    suspend fun streamBytesNGet(
        @PathVariable("n") n: Any,
    ): Unit

    /**
     * Stream n JSON responses
     *
     * Responses:
     *  - 200: Streamed JSON responses.
     *
     * @param n
     * @return [Unit]
     */
    @GetExchange(
        url = "/stream/{n}",
    )
    suspend fun streamNGet(
        @PathVariable("n") n: Any,
    ): Unit

    /**
     * Return a UUID4.
     *
     * Responses:
     *  - 200: A UUID4.
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/uuid",
    )
    suspend fun uuidGet(): Unit
}
