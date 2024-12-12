package com.example.bycicleshop.core.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler

@ControllerAdvice
class ControllerExceptionHandler {
    @ExceptionHandler(ControllerException.ResourceNotFoundException::class)
    fun handleResourceNotFoundException(ex: ControllerException.ResourceNotFoundException): ResponseEntity<ErrorResponse> {
        val errorResponse = ErrorResponse(
            status = HttpStatus.NOT_FOUND.value(),
            message = ex.message ?: "Resource not found"
        )
        return ResponseEntity(errorResponse, HttpStatus.NOT_FOUND)
    }

    @ExceptionHandler(ControllerException.BadRequestException::class)
    fun handleResourceNotFoundException(ex: ControllerException.BadRequestException): ResponseEntity<ErrorResponse> {
        val errorResponse = ErrorResponse(
            status = HttpStatus.BAD_REQUEST.value(),
            message = ex.message ?: "Bad Request"
        )
        return ResponseEntity(errorResponse, HttpStatus.BAD_REQUEST)
    }
}

data class ErrorResponse(
    val status: Int,
    val message: String
)
