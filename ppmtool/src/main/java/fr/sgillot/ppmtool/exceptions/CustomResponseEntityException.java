package fr.sgillot.ppmtool.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomResponseEntityException extends ResponseEntityExceptionHandler {
    @ExceptionHandler
    public final ResponseEntity<Object> handleProjectIdException(ProjectIdException pie, WebRequest wr) {
        ProjectIdExceptionResponse projectIdExceptionResponse = new ProjectIdExceptionResponse(pie.getMessage());
        return new ResponseEntity(projectIdExceptionResponse, HttpStatus.BAD_REQUEST);
    }
}
