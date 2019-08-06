package test

import main.Post
import org.junit.Test
import kotlin.test.assertEquals

internal class PostTest {
    private val testPost = Post("This is a test post")

    @Test
    fun shouldReturnTotalNumberOfLikes() {
        assertEquals(0, testPost.getNumberOfLikes())
    }

    @Test
    fun shouldLikePost() {
        assertEquals(1, testPost.like())
    }

    @Test
    fun shouldUnlikePost() {
        testPost.like()

        assertEquals(0, testPost.unlike())
    }

    @Test
    fun shouldNotUnlikeWhenTotalLikesIsZero() {
        assertEquals(0, testPost.unlike())
    }

    @Test
    fun shouldAddComment() {
        val testCommentList: ArrayList<String> = ArrayList()

        testCommentList.add("This is a test comment")
        testPost.addComment(testCommentList[0])

        assertEquals(testCommentList, testPost.getAllComments())
    }
}