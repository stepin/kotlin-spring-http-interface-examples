package name.stepin.server

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import org.apache.logging.log4j.kotlin.Logging
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/sample")
class SampleController {

    companion object : Logging

    data class User(
        val id: Int,
        val name: String,
        val email: String?,
    )

    @GetMapping("/{id}")
    suspend fun findById(
        @PathVariable id: Long,
        @RequestParam param1: String?,
        @RequestHeader("X-Api-Key") apiKey: String,
    ): String {
        logger.info { "findById $id $param1 $apiKey" }
        return "Some string1 $id $param1 $apiKey"
    }

    @GetMapping("/")
    suspend fun list(): List<User> {
        logger.info { "list suspend" }
        return listOf(
            User(100, "user 100", null),
            User(101, "user 101", "101@example.com"),
        )
    }

    @GetMapping("/v2")
    fun listV2(): Flow<User> {
        logger.info { "list flow" }
        return flowOf(
            User(100, "user 100", null),
            User(101, "user 101", "101@example.com"),
        )
    }

    @PutMapping("/{id}")
    fun update(@PathVariable("id") id: String?, @RequestBody user: User) {
        logger.info { "updated $id / $user" }
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@PathVariable("id") id: String?, @RequestBody user: User): User {
        logger.info { "created $id / $user" }
        return user
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    suspend fun delete(@PathVariable("id") id: String?) {
        logger.info { "deleted $id" }
    }
}
