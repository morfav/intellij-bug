package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.jar.JarFile;

public class Main {

    static {
        Logger logger = LoggerFactory.getLogger(Main.class.getName());
        String jarLocation = Main.class.getProtectionDomain().getCodeSource().getLocation().getFile();
        logger.warn("Jar file: " + jarLocation);
        try (JarFile jarFile = new JarFile(jarLocation)) {
            jarFile.getManifest().getMainAttributes().forEach((k, v) -> logger.warn(k + ": " + v));
        } catch (IOException e) {
            logger.error("Error reading jar file", e);
        }
    }

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class.getName());
        logger.warn("Main.main!");
    }
}
