package com.testDynamoDB.testDynamoDB.controller;

import com.testDynamoDB.testDynamoDB.dtos.StudentDTO;
import com.testDynamoDB.testDynamoDB.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dynamoDb")
public class DynamoDbController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public StudentDTO insertIntoDynamoDB(@RequestBody StudentDTO dto) {
        return  studentService.insertIntoDynamoDB(dto);
    }
}
