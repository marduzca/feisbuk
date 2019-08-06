package test

import main.Post
import main.Wall
import org.junit.Test
import kotlin.test.assertEquals

internal class WallTest {
    private val wall = Wall()
    private val testPost = Post("This is a test post")

    @Test
    fun shouldReturnAllPosts() {
        val testPostList: ArrayList<Post> = ArrayList()

        testPostList.add(testPost)
        wall.addPost(testPost)

        assertEquals(testPostList, wall.getAllPosts())
    }

    @Test
    fun shouldReturnSpecificPost() {
        wall.addPost(testPost)

        assertEquals(testPost, wall.getPostById(testPost.id))
    }

    @Test
    fun shouldAddNewPost() {
        wall.addPost(testPost)
        assertEquals(1, wall.getAllPosts().size)
    }

    @Test
    fun shouldDeleteSpecificPost() {
        wall.addPost(testPost)
        wall.deletePostById(testPost.id)

        assertEquals(null, wall.getPostById(testPost.id))
    }
}