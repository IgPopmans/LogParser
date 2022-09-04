package com.project.logparser.service;

import com.project.logparser.model.User;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;


public class LogServiceImpl implements LogService {

  //Structure


    private UserService userService;

    public LogServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void prepareStructure() throws IOException {
        File file = new File("resources/log.txt");
        try (Scanner scanner = new Scanner(file, StandardCharsets.UTF_8)) {
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] s1 = s.split(" ");

            }
        }
        //  Path path = Path.of("resources","log.txt");
        //  try (Stream<String> lines = Files.lines(path)) {
        //    List<String> list = lines.toList();


    }
    // Read file and get String

    //  String username = "User";
    // User userByName = userService.getUserByName(username);
}


