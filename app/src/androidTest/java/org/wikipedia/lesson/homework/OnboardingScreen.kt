package org.wikipedia.lesson.homework

import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.google.android.material.tabs.TabLayout
import org.wikipedia.R
import org.wikipedia.views.AppTextView

val imageView = listOf(
    AppCompatImageView::class.java,
    R.id.imageViewCentered
)

val titleView = listOf(
    AppTextView::class.java,
    R.id.primaryTextView,
    R.string.onboarding_welcome_title_v2
)

val secondaryTextView = listOf(
    AppTextView::class.java,
    R.id.secondaryTextView
)

val languageListRecyclerView = listOf(
    RecyclerView::class.java,
    R.id.languagesList
)

val languageListItem = listOf(
    AppTextView::class.java,
    R.id.option_label
)

val addLanguageButton = listOf(
    MaterialButton::class.java,
    R.id.addLanguageButton,
    R.string.onboarding_multilingual_add_language_text
)

val skipButton = listOf(
    MaterialButton::class.java,
    R.id.fragment_onboarding_skip_button,
    R.string.onboarding_skip
)

val tabLayout = listOf(
    TabLayout::class.java,
    R.id.view_onboarding_page_indicator
)

val continueButton = listOf(
    MaterialButton::class.java,
    R.id.fragment_onboarding_forward_button,
    R.string.onboarding_continue
)

val onboardingDoneButton = listOf(
    MaterialButton::class.java,
    R.id.fragment_onboarding_done_button,
    R.string.onboarding_get_started
)
