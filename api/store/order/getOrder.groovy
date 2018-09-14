import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            name 'get order'
            request {
                method 'GET'
                url $(c("/store/orders"))
            }
            response {
                status 200
                headers {
                    contentType(applicationJson())
                }
                body(file("orders.json"))
            }
        }
]
