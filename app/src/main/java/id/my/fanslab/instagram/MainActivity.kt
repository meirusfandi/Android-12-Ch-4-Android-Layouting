package id.my.fanslab.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import id.my.fanslab.instagram.adapter.StoryAdapter
import id.my.fanslab.instagram.data.StoryDataSource
import id.my.fanslab.instagram.data.StoryModel
import id.my.fanslab.instagram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val listStory = ArrayList<StoryModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerStory.setHasFixedSize(true)
        listStory.addAll(StoryDataSource.listStory)
        showStory()
    }

    private fun showStory() = with(binding) {
        recyclerStory.layoutManager = LinearLayoutManager(
            applicationContext,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        val storyAdapter = StoryAdapter(listStory)
        recyclerStory.adapter = storyAdapter
    }
}