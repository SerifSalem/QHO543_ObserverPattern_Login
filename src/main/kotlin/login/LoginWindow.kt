package login

// LoginWindow is an Observer. In a real UI, this would update labels/buttons.
// Here, we simulate UI output with println.
class LoginWindow : Observer {

    override fun observe(loggedIn: Boolean, isAdmin: Boolean, message: String) {
        println("[LoginWindow] $message")

        if (loggedIn) {
            println("[LoginWindow] Showing logged-in screen.")
        } else {
            println("[LoginWindow] Staying on login screen.")
        }
    }
}
