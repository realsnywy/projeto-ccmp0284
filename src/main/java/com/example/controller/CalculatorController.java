package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("/calculate")
    public String calculate(
            @RequestParam double number1,
            @RequestParam double number2,
            @RequestParam char operator) {

        double result;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 == 0) {
                    return "Error: Division by zero is not allowed.";
                }
                result = number1 / number2;
                break;
            default:
                return "Error: Invalid operator. Use +, -, *, or /.";
        }

        return "Result: " + result;
    }
}