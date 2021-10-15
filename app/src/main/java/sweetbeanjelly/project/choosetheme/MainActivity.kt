package sweetbeanjelly.project.choosetheme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt = findViewById<TextView>(R.id.txt)
        val image = findViewById<ImageView>(R.id.image)

        image.setImageResource(R.drawable.ic_light)

        val radio = findViewById<RadioGroup>(R.id.radio)

        radio.setOnCheckedChangeListener { _, id ->
            when(id) {
                R.id.btnLight -> {
                    image.setImageResource(R.drawable.ic_light)
                    txt.text = "현재 라이트 모드 입니다."
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                }
                R.id.btnDark -> {
                    image.setImageResource(R.drawable.ic_dark)
                    txt.text = "현재 다크 모드 입니다."
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                }
                R.id.btnSystem -> {
                    image.setImageResource(R.drawable.ic_system)
                    txt.text = "현재 시스템 설정 모드 입니다."
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
                }
            }
        }
    }
}