package com.tag_excel_database_spring.tag_excel_database_spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TagExcelDatabaseSpringController
{
    @RequestMapping("/")
    public String index()
    {
        return "static/index";
    }
}
