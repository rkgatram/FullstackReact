package com.rkgatram.ppmtool.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ravikumar.g
 * Date 2021-07-22
 */
@Service
public class MapValidationErrorService {

    public ResponseEntity<?> validationService(BindingResult result){
        if(result.hasErrors()){
            Map<String, String> errorMap = new HashMap<>();
            result.getFieldErrors().forEach(fieldError -> errorMap.put(fieldError.getField(), fieldError.getDefaultMessage()));
            return new ResponseEntity<>(errorMap, HttpStatus.BAD_REQUEST);
        }

        return null;
    }
}
