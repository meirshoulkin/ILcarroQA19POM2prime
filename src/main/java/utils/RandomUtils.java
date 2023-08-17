package utils;

import java.util.Random;

public class RandomUtils {

    public String generateRandomEmail() {
        String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "example.com"};
        String[] usernames = {"john", "jane", "doe", "smith", "user"};

        Random random = new Random();
        int digit = random.nextInt(1000);
        String username = usernames[random.nextInt(usernames.length)];
        String domain = domains[random.nextInt(domains.length)];

        return username + digit + "autotest" + "@" + domain;
    }

}
