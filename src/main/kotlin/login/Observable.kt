package login

// Observable keeps a list of observers and notifies them when state changes.
// This version is intentionally minimal (no generics) to reduce complexity.
interface Observable {

    val observers: MutableList<Observer>

    fun addObserver(o: Observer) {
        observers.add(o)
    }

    fun notifyObservers(loggedIn: Boolean, isAdmin: Boolean, message: String) {
        observers.forEach { it.observe(loggedIn, isAdmin, message) }
    }
}
