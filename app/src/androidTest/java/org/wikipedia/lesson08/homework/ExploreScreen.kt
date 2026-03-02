package org.wikipedia.lesson08.homework

import com.kaspersky.kaspresso.screens.KScreen
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerView
import org.wikipedia.R
import org.wikipedia.feed.view.FeedView

object ExploreScreen : KScreen<ExploreScreen>() {
    override val layoutId: Int = R.layout.fragment_feed
    override val viewClass = FeedView::class.java

    val logo = KImageView {
        withId(R.id.main_toolbar_wordmark)
    }

    val feed = KRecyclerView(
        builder = {
            withId(R.id.main_view_pager)
        },
        itemTypeBuilder = {
            itemType(::SearchItem)
            itemType(::CustomizeItem)
            itemType(::DayItem)
            itemType(::TopReadItem)
            itemType(::NewsItem)
        }
    )
}
