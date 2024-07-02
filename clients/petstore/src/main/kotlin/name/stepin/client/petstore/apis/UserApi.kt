package name.stepin.client.petstore.apis

import name.stepin.client.petstore.models.User
import org.springframework.web.bind.annotation.*
import org.springframework.web.service.annotation.*

/**
 * the User API
 */
@HttpExchange(
    url = "/",
)
interface UserApi {
    /**
     * Create user
     * This can only be done by the logged in user.
     * Responses:
     *  - 0: successful operation
     *
     * @param body Created user object
     * @return [Unit]
     */
    @PostExchange(
        url = "/user",
        accept = ["application/json"],
    )
    suspend fun createUser(
        @RequestBody body: User,
    ): Unit

    /**
     * Creates list of users with given input array
     *
     * Responses:
     *  - 0: successful operation
     *
     * @param body List of user object
     * @return [Unit]
     */
    @PostExchange(
        url = "/user/createWithArray",
        accept = ["application/json"],
    )
    suspend fun createUsersWithArrayInput(
        @RequestBody body: List<User>,
    ): Unit

    /**
     * Creates list of users with given input array
     *
     * Responses:
     *  - 0: successful operation
     *
     * @param body List of user object
     * @return [Unit]
     */
    @PostExchange(
        url = "/user/createWithList",
        accept = ["application/json"],
    )
    suspend fun createUsersWithListInput(
        @RequestBody body: List<User>,
    ): Unit

    /**
     * Delete user
     * This can only be done by the logged in user.
     * Responses:
     *  - 400: Invalid username supplied
     *  - 404: User not found
     *
     * @param username The name that needs to be deleted
     * @return [Unit]
     */
    @DeleteExchange(
        url = "/user/{username}",
    )
    suspend fun deleteUser(
        @PathVariable("username") username: String,
    ): Unit

    /**
     * Get user by user name
     *
     * Responses:
     *  - 200: successful operation
     *  - 400: Invalid username supplied
     *  - 404: User not found
     *
     * @param username The name that needs to be fetched. Use user1 for testing.
     * @return [User]
     */
    @GetExchange(
        url = "/user/{username}",
    )
    suspend fun getUserByName(
        @PathVariable("username") username: String,
    ): User

    /**
     * Logs user into the system
     *
     * Responses:
     *  - 200: successful operation
     *  - 400: Invalid username/password supplied
     *
     * @param username The user name for login
     * @param password The password for login in clear text
     * @return [String]
     */
    @GetExchange(
        url = "/user/login",
    )
    suspend fun loginUser(
        @RequestParam("username") username: String,
        @RequestParam("password") password: String,
    ): String

    /**
     * Logs out current logged in user session
     *
     * Responses:
     *  - 0: successful operation
     *
     * @return [Unit]
     */
    @GetExchange(
        url = "/user/logout",
    )
    suspend fun logoutUser(): Unit

    /**
     * Updated user
     * This can only be done by the logged in user.
     * Responses:
     *  - 400: Invalid user supplied
     *  - 404: User not found
     *
     * @param username name that need to be updated
     * @param body Updated user object
     * @return [Unit]
     */
    @PutExchange(
        url = "/user/{username}",
        accept = ["application/json"],
    )
    suspend fun updateUser(
        @PathVariable("username") username: String,
        @RequestBody body: User,
    ): Unit
}
