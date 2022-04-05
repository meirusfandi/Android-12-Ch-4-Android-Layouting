package id.my.fanslab.instagram.data

import id.my.fanslab.instagram.R

object StoryDataSource {
    private val storyName = arrayOf(
        "artstory",
        "bridges",
        "capture",
        "captures",
        "chars",
        "h_co",
        "home",
        "maxwell",
        "news_update",
        "profile",
        "art_profile",
        "profilers"
    )

    private val storyImages = intArrayOf(
        R.drawable.art,
        R.drawable.bridges,
        R.drawable.capture,
        R.drawable.captures,
        R.drawable.chars,
        R.drawable.hco,
        R.drawable.home,
        R.drawable.maxwell,
        R.drawable.news,
        R.drawable.profile,
        R.drawable.profile_art,
        R.drawable.profiles
    )

    private val storyIsOpen = booleanArrayOf(
        true,
        true,
        false,
        true,
        false,
        false,
        true,
        true,
        false,
        true,
        false,
        false
    )

    val listStory: ArrayList<StoryModel>
        get() {
            val list = arrayListOf<StoryModel>()
            for (position in storyName.indices) {
                val story = StoryModel()
                story.name = storyName[position]
                story.images = storyImages[position]
                story.isOpen = storyIsOpen[position]
                list.add(story)
            }
            return list
        }
}