package org.wikipedia.lesson08.homework

import android.view.View
import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R
import org.wikipedia.views.GraphView

class TopReadRecyclerItem(matcher: Matcher<View>) : KRecyclerItem<TopReadRecyclerItem>(matcher) {
    val numberView = KTextView(matcher) {
        withId(R.id.numberView)
    }

    val title = KTextView(matcher) {
        withId(R.id.view_list_card_item_title)
    }

    val subtitle = KTextView(matcher) {
        withId(R.id.view_list_card_item_subtitle)
    }

    val graph = KView(matcher) {
        isInstanceOf(GraphView::class.java)
    }

    val pageViews = KTextView(matcher) {
        withId(R.id.view_list_card_item_pageviews)
    }

    val image = KImageView(matcher) {
        withId(R.id.view_list_card_item_image)
    }
}
