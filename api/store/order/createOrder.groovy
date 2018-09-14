import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            name 'create order'
            request {
                method 'POST'
                url $(c("/store/orders"))
                body(
                        items: [
                                [product: [id: $(c(regex('^(.){1,30}$')))],
                                 amount : $(c(regex('^(.){1,30}$')))
                                ]
                        ]
                )
            }
            response {
                status 201
                headers {
                    contentType(applicationJson())
                }
                body(
                        id: $(anyNumber())
                )
            }
        }
]
