package name.stepin.client.petstore.apis

import name.stepin.client.petstore.models.Order
import org.springframework.web.bind.annotation.*
import org.springframework.web.service.annotation.*

/**
 * the Store API
 */
@HttpExchange(
    url = "/",
)
interface StoreApi {
    /**
     * Delete purchase order by ID
     * For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors
     * Responses:
     *  - 400: Invalid ID supplied
     *  - 404: Order not found
     *
     * @param orderId ID of the order that needs to be deleted
     * @return [Unit]
     */
    @DeleteExchange(
        url = "/store/order/{orderId}",
    )
    suspend fun deleteOrder(
        @PathVariable("orderId") orderId: Long,
    ): Unit

    /**
     * Returns pet inventories by status
     * Returns a map of status codes to quantities
     * Responses:
     *  - 200: successful operation
     *
     * @return [Map<String, Int>]
     */
    @GetExchange(
        url = "/store/inventory",
    )
    suspend fun getInventory(): Map<String, Int>

    /**
     * Find purchase order by ID
     * For valid response try integer IDs with value &gt;&#x3D; 1 and &lt;&#x3D; 10. Other values will generated exceptions
     * Responses:
     *  - 200: successful operation
     *  - 400: Invalid ID supplied
     *  - 404: Order not found
     *
     * @param orderId ID of pet that needs to be fetched
     * @return [Order]
     */
    @GetExchange(
        url = "/store/order/{orderId}",
    )
    suspend fun getOrderById(
        @PathVariable("orderId") orderId: Long,
    ): Order

    /**
     * Place an order for a pet
     *
     * Responses:
     *  - 200: successful operation
     *  - 400: Invalid Order
     *
     * @param body order placed for purchasing the pet
     * @return [Order]
     */
    @PostExchange(
        url = "/store/order",
        accept = ["application/json"],
        contentType = "application/json",
    )
    suspend fun placeOrder(
        @RequestBody body: Order,
    ): Order
}
