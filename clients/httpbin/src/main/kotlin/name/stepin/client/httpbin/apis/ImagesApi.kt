package name.stepin.client.httpbin.apis

import org.springframework.web.bind.annotation.*
import org.springframework.web.service.annotation.*

/**
 * the Images API
 */
@HttpExchange(
    url = "/",
)
interface ImagesApi {
    /**
     * Returns a simple image of the type suggest by the Accept header.
     *
     * Responses:
     *  - 200: An image.
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/image",
    )
    suspend fun imageGet(): Unit

    /**
     * Returns a simple JPEG image.
     *
     * Responses:
     *  - 200: A JPEG image.
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/image/jpeg",
    )
    suspend fun imageJpegGet(): Unit

    /**
     * Returns a simple PNG image.
     *
     * Responses:
     *  - 200: A PNG image.
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/image/png",
    )
    suspend fun imagePngGet(): Unit

    /**
     * Returns a simple SVG image.
     *
     * Responses:
     *  - 200: An SVG image.
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/image/svg",
    )
    suspend fun imageSvgGet(): Unit

    /**
     * Returns a simple WEBP image.
     *
     * Responses:
     *  - 200: A WEBP image.
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/image/webp",
    )
    suspend fun imageWebpGet(): Unit
}
