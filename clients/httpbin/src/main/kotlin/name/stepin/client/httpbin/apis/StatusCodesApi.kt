package name.stepin.client.httpbin.apis

import org.springframework.web.bind.annotation.*
import org.springframework.web.service.annotation.*

/**
 * the StatusCodes API
 */
@HttpExchange(
    url = "/",
)
interface StatusCodesApi {
    /**
     * Return status code or random status code if more than one are given
     *
     * Responses:
     *  - 100: Informational responses
     *  - 200: Success
     *  - 300: Redirection
     *  - 400: Client Errors
     *  - 500: Server Errors
     *
     * @param codes
     * @return [Unit]
     */
    @DeleteExchange(
        url = "/status/{codes}",
    )
    suspend fun statusCodesDelete(
        @PathVariable("codes") codes: Any,
    ): Unit

    /**
     * Return status code or random status code if more than one are given
     *
     * Responses:
     *  - 100: Informational responses
     *  - 200: Success
     *  - 300: Redirection
     *  - 400: Client Errors
     *  - 500: Server Errors
     *
     * @param codes
     * @return [Unit]
     */
    @GetExchange(
        url = "/status/{codes}",
    )
    suspend fun statusCodesGet(
        @PathVariable("codes") codes: Any,
    ): Unit

    /**
     * Return status code or random status code if more than one are given
     *
     * Responses:
     *  - 100: Informational responses
     *  - 200: Success
     *  - 300: Redirection
     *  - 400: Client Errors
     *  - 500: Server Errors
     *
     * @param codes
     * @return [Unit]
     */
    @PatchExchange(
        url = "/status/{codes}",
    )
    suspend fun statusCodesPatch(
        @PathVariable("codes") codes: Any,
    ): Unit

    /**
     * Return status code or random status code if more than one are given
     *
     * Responses:
     *  - 100: Informational responses
     *  - 200: Success
     *  - 300: Redirection
     *  - 400: Client Errors
     *  - 500: Server Errors
     *
     * @param codes
     * @return [Unit]
     */
    @PostExchange(
        url = "/status/{codes}",
    )
    suspend fun statusCodesPost(
        @PathVariable("codes") codes: Any,
    ): Unit

    /**
     * Return status code or random status code if more than one are given
     *
     * Responses:
     *  - 100: Informational responses
     *  - 200: Success
     *  - 300: Redirection
     *  - 400: Client Errors
     *  - 500: Server Errors
     *
     * @param codes
     * @return [Unit]
     */
    @PutExchange(
        url = "/status/{codes}",
    )
    suspend fun statusCodesPut(
        @PathVariable("codes") codes: Any,
    ): Unit
}
