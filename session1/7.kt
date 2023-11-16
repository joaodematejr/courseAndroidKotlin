fun main() {
 var email = "test@example.com"
    println(emailValido(email))
}

fun emailValido(email: String): Boolean {
 return email.contains("@")
}