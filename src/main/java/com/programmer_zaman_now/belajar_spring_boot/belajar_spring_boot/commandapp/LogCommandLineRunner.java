package com.programmer_zaman_now.belajar_spring_boot.belajar_spring_boot.commandapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class LogCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Log command line runner : " + Arrays.toString(args));
    }
}
