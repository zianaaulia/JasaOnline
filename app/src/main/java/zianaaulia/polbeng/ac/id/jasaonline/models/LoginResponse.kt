package zianaaulia.polbeng.ac.id.jasaonline.models

data class LoginResponse (
    val message: String,
    val error: Boolean,
    val data: User
)