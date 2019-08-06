package test

import main.Post
import org.junit.Test
import kotlin.test.assertEquals

internal class PostTest {

    @Test
    fun shouldReturnTotalNumberOfLikes() {
        val testPost = Post("This is a test post")

        assertEquals(0, testPost.getNumberOfLikes())
    }

    @Test
    fun shouldLikePost() {
        val testPost = Post("This is a test post")

        assertEquals(1, testPost.like())
    }

    @Test
    fun shouldUnlikePost() {
        val testPost = Post("This is a test post")

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