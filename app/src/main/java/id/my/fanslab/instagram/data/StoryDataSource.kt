package id.my.fanslab.instagram.data

import id.my.fanslab.instagram.R

object StoryDataSource {
    private val storyName = arrayOf(
        "Andi Rahmadsyah",
        "Andi Rahmadsyah",
        "Andi Rahmadsyah",
        "Andi Rahmadsyah",
        "Andi Rahmadsyah",
        "Andi Rahmadsyah"
    )

    private val storyImages = intArrayOf(
        R.drawable.ic_person,
        R.drawable.ic_person,
        R.drawable.ic_person,
        R.drawable.ic_person,
        R.drawable.ic_person,
        R.drawable.ic_person
    )

    private val storyIsOpen = booleanArrayOf(
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