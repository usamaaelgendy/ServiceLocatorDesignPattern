fun main() {

    ServiceLocator.registerService("emailService", GmailService())

    val emailService = ServiceLocator.getService<EmailService>("emailService")
    println(emailService.hashCode())
    emailService.sendEmail("user@example.com", "Hello", "This is a test email")

    val emailService1 = ServiceLocator.getService<EmailService>("emailService")

    println(emailService1.hashCode())


}




