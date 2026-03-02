package org.wikipedia.lesson08.homework

import android.view.View
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.text.KTextView
import org.hamcrest.Matcher
import org.wikipedia.R

class NewsItem(matcher: Matcher<View>) : KRecyclerItem<NewsItem>(matcher) {
    val title = KTextView(matcher) {
        withId(R.id.view_card_header_title)
    }

    val recycler = KRecyclerView(
        builder = {
            withId(R.id.news_cardview_recycler_view)
        },
        itemTypeBuilder = {
            itemType(::NewsRecyclerItem)
        },
        parent = matcher
    )
}
