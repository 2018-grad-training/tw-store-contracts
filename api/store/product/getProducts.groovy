import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            name 'get products list'
            request {
                method 'GET'
                url $(c("/store/products"))
            }
            response {
                status 200
                headers {
                    contentType(applicationJson())
                }
                body(file("products.json"))
            }
        }
]
