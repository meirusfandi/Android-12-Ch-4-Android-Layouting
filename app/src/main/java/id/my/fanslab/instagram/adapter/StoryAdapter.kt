package id.my.fanslab.instagram.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.my.fanslab.instagram.R
import id.my.fanslab.instagram.data.StoryModel
import id.my.fanslab.instagram.databinding.ItemStoryBinding


class StoryAdapter(private val listStoryModel: ArrayList<StoryModel>):
    RecyclerView.Adapter<StoryAdapter.StoryViewHolder>() {

    class StoryViewHolder(private val binding: ItemStoryBinding):
        RecyclerView.ViewHolder(binding.root) {
        fun bind(storyModel: StoryModel) {
            binding.itemName.text = storyModel.name
            binding.itemImages.setImageResource(storyModel.images)
            if (!storyModel.isOpen) {
                binding.itemImages.setBackgroundResource(R.drawable.story_background)
            }
//            Glide.with(itemView.context)
//                .load(storyModel.images)
//                .apply(RequestOptions().override(60, 60))
//                .into(binding.itemImages)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryViewHolder =
        StoryViewHolder(ItemStoryBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)
        )

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        holder.bind(listStoryModel[position])
    }

    override fun getItemCount(): Int = listStoryModel.size
}