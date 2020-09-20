package sda.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sda.app.logger.HelloLogger;
import sda.app.logger.HeyLogger;
import sda.app.logger.HiLogger;


@Component
public class ApplicationStartupRunner implements CommandLineRunner {


    @Autowired
    private HelloLogger logger1; //wskrzykiwanie przy pomocy pola
    private HiLogger logger2; //wskrzykiwanie setterem
    private HeyLogger logger3; //wstrzykiwanie za pomocą konstruktora

    @Autowired //wstrzykiwanie za pomocą konstruktora
    public ApplicationStartupRunner(HeyLogger logger3) {
        this.logger3 = logger3;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello");
        logger1.log();
        logger2.log();
        logger3.log();
    }

    @Autowired //wstrzykiwanie przez settera
    public void setLogger2(HiLogger logger2) {
        this.logger2 = logger2;
    }

}
