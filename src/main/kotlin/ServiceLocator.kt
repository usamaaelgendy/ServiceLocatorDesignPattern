object ServiceLocator {
    private val services = mutableMapOf<String, Any>()

    fun registerService(identifier: String, service: Any) {
        services[identifier] = service
    }

    fun <T> getService(identifier: String): T {
        return services[identifier] as T
    }
}