class GmailService : EmailService {
    override fun sendEmail(recipient: String, subject: String, body: String) {
        println("Sending email to $recipient with subject '$subject' and body '$body'")
    }
}
