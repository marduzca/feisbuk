package main

class Page(idName: String, pageName: String, val topic: Topic) : FeisbukObject(idName, pageName) {
    val followersList: ArrayList<Person> = ArrayList()
}