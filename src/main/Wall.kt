package main

class Wall {
    private var postList : ArrayList<Post> = ArrayList()

    fun getAllPosts(): List<Post> {
        return postList
    }

    fun getPostById(postId: Int): Post? {
        return postList.find { it.id == postId }
    }

    fun addPost(newPost: Post) {
        postList.add(newPost)
    }

    fun deletePostById(postId: Int) {
        postList.removeIf { it.id == postId }
    }
}
