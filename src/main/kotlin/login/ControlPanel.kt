package login

// ControlPanel reacts to login state changes and prints
// different fictional options depending on the user role.

class ControlPanel : Observer {

    override fun observe(loggedIn: Boolean, isAdmin: Boolean, message: String) {

        when {
            loggedIn && isAdmin -> {
                println("[ControlPanel] Admin options:")
                printAdminOptions()
            }

            loggedIn && !isAdmin -> {
                println("[ControlPanel] User options:")
                printUserOptions()
            }

            else -> {
                println("[ControlPanel] WARNING: Access denied. Please log in.")
            }
        }
    }

    /**
     * Fictional admin-only options.
     */
    private fun printAdminOptions() {
        println(" - View all users")
        println(" - Manage system settings")
        println(" - Generate reports")
        println(" - Reset user passwords")
    }

    /**
     * Fictional standard-user options.
     */
    private fun printUserOptions() {
        println(" - View profile")
        println(" - Update personal details")
        println(" - Change password")
        println(" - Browse content")
    }
}
