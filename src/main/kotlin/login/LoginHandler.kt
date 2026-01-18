package login
// LoginHandler is the Observable implementation.
// It owns the authentication logic and emits LoginState updates.
class LoginHandler : Observable {

    override val observers = mutableListOf<Observer>()

    // Internal state (not exposed directly)
    private var loggedIn: Boolean = false
    private var isAdmin: Boolean = false

    // Simple authentication rules for demonstration.
    fun login(username: String, password: String) {

        when {
            username == "admin" && password == "admin" -> {
                loggedIn = true
                isAdmin = true
                notifyObservers(loggedIn, isAdmin, "Admin login successful.")
            }

            username == "user" && password == "user" -> {
                loggedIn = true
                isAdmin = false
                notifyObservers(loggedIn, isAdmin, "User login successful.")
            }

            else -> {
                loggedIn = false
                isAdmin = false
                notifyObservers(loggedIn, isAdmin, "Login failed: invalid credentials.")
            }
        }
    }
}