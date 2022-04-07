package id.my.fanslab.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
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

        supportActionBar?.elevation = 0.toFloat()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvActionBar.text = getString(R.string.app_name)

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_plus -> {

            }
            R.id.menu_activity -> {
                Toast.makeText(
                    applicationContext,
                    "Menu Activity is coming Soon!!!",
                    Toast.LENGTH_LONG
                ).show()
            }
            R.id.menu_message -> {
                Toast.makeText(
                    applicationContext,
                    "Menu Direct Message is coming Soon!!!",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}