package fr.sgillot.ppmtool.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.Map;

@Service
public class ValidationService {

    public ResponseEntity<?> projectValidation(BindingResult bindingResult) {
        Map<String, String> mapError = new HashMap<>();
        if (bindingResult.hasErrors()) {
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                mapError.put(fieldError.getField(), fieldError.getDefaultMessage());
            }
            return new ResponseEntity<>(mapError, HttpStatus.BAD_REQUEST);
        }
        return null;
    }


}
