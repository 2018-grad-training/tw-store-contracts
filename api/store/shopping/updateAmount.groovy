import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            name 'update shopping'
            request {
                method 'PATCH'
                url $(c("/store/shoppings/${regex(number())}"), p("/shopping/1"))
                headers {
                    contentType(applicationJson())
                }
                body(
                        items: [
                                [
                                        product: [id: $(c(regex('^(.){1,30}$')))],
                                        amount : $(c(regex('^(.){1,30}$')))
                                ]
                        ]
                )
            }
            response {
                status 204
            }
        }
]
