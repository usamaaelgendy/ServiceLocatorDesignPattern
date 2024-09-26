interface EmailService {
    fun sendEmail(recipient: String, subject: String, body: String)
}