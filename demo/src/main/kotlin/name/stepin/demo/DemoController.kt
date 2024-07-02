package name.stepin.demo

import name.stepin.client.httpbin.apis.AnythingApi
import name.stepin.client.petstore.apis.PetApi
import name.stepin.client.simple.apis.SampleControllerApi
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DemoController(
    private val sampleApi: SampleControllerApi,
    private val petApi: PetApi,
    private val anythingApi: AnythingApi,
) {

    @GetMapping("/")
    suspend fun index(): String {
        return sampleApi.list().joinToString { it.name }
    }
}
