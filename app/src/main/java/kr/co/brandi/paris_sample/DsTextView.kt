package kr.co.brandi.paris_sample

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.paris.annotations.Attr
import com.airbnb.paris.annotations.Style
import com.airbnb.paris.annotations.Styleable
import com.airbnb.paris.annotations.StyleableChild
import com.airbnb.paris.extensions.*
import kr.co.brandi.paris_sample.databinding.DsTextBinding

@SuppressLint("ResourceType")
@Styleable("DsText")
class DsTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    val binding: DsTextBinding by lazy { DsTextBinding.bind(this) }

    @StyleableChild(R2.styleable.DsText_dsTextView)
    val dsTextView: TextView by lazy { binding.tvDsText }

    init {
        initAttributes(attrs)
    }

    @Attr(R2.styleable.DsText_dsText)
    fun setText(text: String) {
        dsTextView.text = text
    }

    @Attr(R2.styleable.DsText_dsTextColor)
    fun setTextColor(@ColorInt color: Int) {
        dsTextView.setTextColor(color)
    }

    @Attr(R2.styleable.DsText_dsTextTypeFace)
    fun setTextTypeFace(typeFace: Int) {
        dsTextView.setTypeface(dsTextView.typeface, typeFace)
    }

    private fun initAttributes(attrs: AttributeSet?) {
        inflate(context, R.layout.ds_text, this)
        style(attrs)
    }

    companion object {
        @Style
        val testStyle = dsTextViewStyle {
            dsTextView {
                dsText("TextView by @Style")
                dsTextColorRes(R.color.black)
                dsTextTypeFace(Typeface.NORMAL)
                textSizeDp(20)
            }
        }
    }
}