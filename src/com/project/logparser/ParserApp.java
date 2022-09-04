package com.project.logparser;

import com.project.logparser.service.LogService;
import com.project.logparser.service.LogServiceImpl;
import com.project.logparser.service.UserService;
import com.project.logparser.service.UserServiceImpl;

import java.io.IOException;

public class ParserApp {
    public static void main(String[] args) throws IOException {

        UserService userService = new UserServiceImpl();
        LogService logService = new LogServiceImpl(userService);
        logService.prepareStructure();
    }

}
