import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            name 'get shopping list'
            request {
                method 'GET'
                url $(c("/store/shoppings"))
            }
            response {
                status 200
                headers {
                    contentType(applicationJson())
                }
                body(file("shopping.json"))
            }
        }
]
