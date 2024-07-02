package name.stepin.client.httpbin.apis

import org.springframework.web.bind.annotation.*
import org.springframework.web.service.annotation.*

/**
 * the HTTPMethods API
 */
@HttpExchange(
    url = "/",
)
interface HTTPMethodsApi {
    /**
     * The request&#39;s DELETE parameters.
     *
     * Responses:
     *  - 200: The request's DELETE parameters.
     *
     * @return [Unit]
     */
    @DeleteExchange(
        url = "/delete",
    )
    suspend fun deleteDelete(): Unit

    /**
     * The request&#39;s query parameters.
     *
     * Responses:
     *  - 200: The request's query parameters.
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/get",
    )
    suspend fun getGet(): Unit

    /**
     * The request&#39;s PATCH parameters.
     *
     * Responses:
     *  - 200: The request's PATCH parameters.
     *
     * @return [Unit]
     */
    @PatchExchange(
        url = "/patch",
    )
    suspend fun patchPatch(): Unit

    /**
     * The request&#39;s POST parameters.
     *
     * Responses:
     *  - 200: The request's POST parameters.
     *
     * @return [Unit]
     */
    @PostExchange(
        url = "/post",
    )
    suspend fun postPost(): Unit

    /**
     * The request&#39;s PUT parameters.
     *
     * Responses:
     *  - 200: The request's PUT parameters.
     *
     * @return [Unit]
     */
    @PutExchange(
        url = "/put",
    )
    suspend fun putPut(): Unit
}
