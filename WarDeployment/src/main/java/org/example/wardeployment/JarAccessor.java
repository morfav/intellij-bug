package org.example.wardeployment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Main;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Service
public class JarAccessor {

    @PostConstruct
    public void init() {
        Logger logger = LogManager.getLogger(JarAccessor.class.getName());
        logger.warn("JarAccessor initialized");
        Main.main(new String[0]);
    }
}
