package v2ch10._4_auth;

import javax.security.auth.Subject;
import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

/**
 * This program authenticates a user via a custom login and then executes the SysPropAction
 * with the user's privileges.
 *
 * @author Cay Horstmann
 * @version 1.02 2018-05-01
 */
public class AuthTest {
    public static void main(final String[] args) {
        System.setSecurityManager(new SecurityManager());
        try {
            var context = new LoginContext("Login1");
            context.login();
            System.out.println("Authentication successful.");
            Subject subject = context.getSubject();
            System.out.println("subject=" + subject);
            var action = new SysPropAction("user.home");
            String result = Subject.doAsPrivileged(subject, action, null);
            System.out.println(result);
            context.logout();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
