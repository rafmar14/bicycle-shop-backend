package com.example.bicycleshop.core.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

class ControllerException {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    class ResourceNotFoundException(message: String) : RuntimeException(message)

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    class BadRequestException(message: String) : RuntimeException(message)
}