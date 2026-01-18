package login

/* Interactive runner:
  - prompts the user for username/password
  - calls LoginHandler.login(...)
  - observers react (LoginWindow + ControlPanel) */

fun main() {

    val loginHandler = LoginHandler()

    // Observers (UI-like components)
    val loginWindow = LoginWindow()
    val controlPanel = ControlPanel()

    // Subscribe observers
    loginHandler.addObserver(loginWindow)
    loginHandler.addObserver(controlPanel)

    println("=== Login System (Observer Pattern Demo) ===")
    println("Type 'q' at username to quit.")
    println("Test accounts: admin/admin or user/user")
    println()

    var running = true
    while (running) {

        print("Username: ")
        val username = readln().trim()

        if (username.equals("q", ignoreCase = true)) {
            running = false
            continue
        }

        print("Password: ")
        val password = readln().trim()

        // Observable emits the login state; observers react accordingly.
        loginHandler.login(username, password)

        println()
    }

    println("Goodbye.")
}
