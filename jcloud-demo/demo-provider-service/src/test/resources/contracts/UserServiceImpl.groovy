package contracts

import org.springframework.cloud.contract.spec.Contract

/**
 * @Author: cy
 */
Contract.make {
    request {
        method 'GET'
        url('/loadUser') {
            queryParameters {
                parameter("userName", "admin")
            }
        }
    }
    response {
        status 200
        body(
                '''
            {
                "displayName": "系统管理员",
                "msg": null,
                "phone": "13787328762",
                "statusCode": 1,
                "userName": "admin"
            }
            '''
        )
        headers {
            header('Content-Type': 'application/json;charset=UTF-8')
        }
    }
}
