package name.stepin.client.httpbin.apis

import org.springframework.web.bind.annotation.*
import org.springframework.web.service.annotation.*

/**
 * the Anything API
 */
@HttpExchange(
    url = "/",
)
interface AnythingApi {
    /**
     * Returns anything passed in request data.
     *
     * Responses:
     *  - 200: Anything passed in request
     *
     * @return [Unit]
     */
    @DeleteExchange(
        url = "/anything/{anything}",
    )
    suspend fun anythingAnythingDelete(): Unit

    /**
     * Returns anything passed in request data.
     *
     * Responses:
     *  - 200: Anything passed in request
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/anything/{anything}",
    )
    suspend fun anythingAnythingGet(): Unit

    /**
     * Returns anything passed in request data.
     *
     * Responses:
     *  - 200: Anything passed in request
     *
     * @return [Unit]
     */
    @PatchExchange(
        url = "/anything/{anything}",
    )
    suspend fun anythingAnythingPatch(): Unit

    /**
     * Returns anything passed in request data.
     *
     * Responses:
     *  - 200: Anything passed in request
     *
     * @return [Unit]
     */
    @PostExchange(
        url = "/anything/{anything}",
    )
    suspend fun anythingAnythingPost(): Unit

    /**
     * Returns anything passed in request data.
     *
     * Responses:
     *  - 200: Anything passed in request
     *
     * @return [Unit]
     */
    @PutExchange(
        url = "/anything/{anything}",
    )
    suspend fun anythingAnythingPut(): Unit

    /**
     * Returns anything passed in request data.
     *
     * Responses:
     *  - 200: Anything passed in request
     *
     * @return [Unit]
     */
    @DeleteExchange(
        url = "/anything",
    )
    suspend fun anythingDelete(): Unit

    /**
     * Returns anything passed in request data.
     *
     * Responses:
     *  - 200: Anything passed in request
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/anything",
    )
    suspend fun anythingGet(): Unit

    /**
     * Returns anything passed in request data.
     *
     * Responses:
     *  - 200: Anything passed in request
     *
     * @return [Unit]
     */
    @PatchExchange(
        url = "/anything",
    )
    suspend fun anythingPatch(): Unit

    /**
     * Returns anything passed in request data.
     *
     * Responses:
     *  - 200: Anything passed in request
     *
     * @return [Unit]
     */
    @PostExchange(
        url = "/anything",
    )
    suspend fun anythingPost(): Unit

    /**
     * Returns anything passed in request data.
     *
     * Responses:
     *  - 200: Anything passed in request
     *
     * @return [Unit]
     */
    @PutExchange(
        url = "/anything",
    )
    suspend fun anythingPut(): Unit
}
