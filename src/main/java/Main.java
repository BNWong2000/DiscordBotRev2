import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;
import java.util.Scanner;

/**
 * A class which runs the main function for the discord bot.
 * @author Branden Wong
 * @since April 20, 2020
 */
public class Main {

    /**
     * Main function for the program. Retrieves the bot token from the user then generates the bot.
     * @param args input arguments. unusued
     * @throws LoginException
     */
    public static void main(String[] args) throws LoginException {
        // First retrieve bot token from the user
        Scanner scan = new Scanner(System.in);
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        System.out.print("Please Enter the bot token. \n");
        String token = scan.nextLine();

        // Then create the bot with the bot token.
        builder.setToken(token);
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setActivity(Activity.listening("!blackjack"));
        //builder.addEventListeners(reader);
        builder.build();
    }
}
