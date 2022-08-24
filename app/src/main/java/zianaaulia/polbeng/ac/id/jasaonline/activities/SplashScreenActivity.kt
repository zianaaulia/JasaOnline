package zianaaulia.polbeng.ac.id.jasaonline.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import zianaaulia.polbeng.ac.id.jasaonline.R
import zianaaulia.polbeng.ac.id.jasaonline.helpers.Config

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, Config.SPLASH_TIME_OUT)
    }
}