package id.my.fanslab.instagram.data

data class FeedModel(
    var name: String = "",
    var profileImages: Int = 0,
    var feedImages: Int = 0,
    var isLike: Boolean = false,
    var isSave: Boolean = false,
    var feedContent: String = ""
)
