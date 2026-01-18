package login

// Observer receives updates from an Observable.
// Here we keep it simple: State is passed directly as primitive values for simplicity.
interface Observer {
    fun observe(loggedIn: Boolean, isAdmin: Boolean, message: String)
}

