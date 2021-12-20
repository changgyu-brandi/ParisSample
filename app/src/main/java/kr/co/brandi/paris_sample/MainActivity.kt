package kr.co.brandi.paris_sample

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.paris.extensions.*
import kr.co.brandi.paris_sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvDsTextCode.style {
            dsTextView {
                dsText("TextView by code")
                textSizeDp(20)
                dsTextColorRes(R.color.purple_500)
                dsTextTypeFace(Typeface.BOLD)
            }
        }
        binding.tvDsTextStyleAdd.style(R.style.StyleAdd)

        binding.tvDsTextStyle.style {
            addTest()
        }

    }
}