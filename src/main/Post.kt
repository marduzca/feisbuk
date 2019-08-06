package main

import java.util.ArrayList

class Post(val content: String) {
    private var commentList: ArrayList<String> = ArrayList()
    private var totalLikes: Int = 0
    val id: Int = generatePostId()

    fun getNumberOfLikes(): Int {
        return totalLikes
    }

    fun like(): Int {
        return ++totalLikes
    }

    fun unlike(): Int {
        return if (totalLikes > 0) --totalLikes else totalLikes
    }

    fun getAllComments(): ArrayList<String> {
        return commentList
    }

    fun addComment(comment: String) {
        commentList.add(comment)
    }
}