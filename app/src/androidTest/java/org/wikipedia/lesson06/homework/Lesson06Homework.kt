package org.wikipedia.lesson06.homework

import androidx.appcompat.widget.AppCompatImageView
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.progress.KSeekBar
import io.github.kakaocup.kakao.switch.KSwitch
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import org.wikipedia.R

val readingHeaderTextView = KTextView {
    withId(R.id.textSettingsCategory)
}

val themeHeaderTextView = KTextView {
    withText("Theme")
}

val textSizeTextView = KTextView {
    withId(R.id.text_size_percent)
}

val buttonDecreaseTextSize = KTextView {
    withId(R.id.buttonDecreaseTextSize)
}

val buttonIncreaseTextSize = KTextView {
    withId(R.id.buttonIncreaseTextSize)
}

val textSizeSeekBar = KSeekBar {
    withId(R.id.text_size_seek_bar)
}

val sansSerifButton = KButton {
    withId(R.id.button_font_family_sans_serif)
}

val serifButton = KButton {
    withId(R.id.button_font_family_serif)
}

val glassesImage = KImageView {
    isInstanceOf(AppCompatImageView::class.java)
}

val focusModeSwitch = KSwitch {
    withId(R.id.theme_chooser_reading_focus_mode_switch)
}

val focusModeHint = KTextView {
    withText("Hides edit features and bottom toolbar on scroll")
}

val lightThemeButton = KButton {
    withId(R.id.button_theme_light)
}

val sepiaThemeButton = KButton {
    withId(R.id.button_theme_sepia)
}

val darkThemeButton = KButton {
    withId(R.id.button_theme_dark)
}

val blackThemeButton = KButton {
    withId(R.id.button_theme_black)
}

val matchSystemThemeSwitch = KSwitch {
    withId(R.id.theme_chooser_match_system_theme_switch)
}

val imageDimmingSwitch = KSwitch {
    withId(R.id.theme_chooser_dark_mode_dim_images_switch)
}
