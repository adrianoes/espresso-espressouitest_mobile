package com.codingwithmitch.espressouitestexamples.ui.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.codingwithmitch.espressouitestexamples.databinding.LayoutMovieListItemBinding
import com.codingwithmitch.espressouitestexamples.data.Movie
import com.codingwithmitch.espressouitestexamples.EspressoIdlingResource

class MoviesListAdapter(private val interaction: Interaction? = null) :
    RecyclerView.Adapter<MoviesListAdapter.MovieViewHolder>() {

    private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Movie>() {

        override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem == newItem
        }
    }

    private val differ = AsyncListDiffer(this, DIFF_CALLBACK)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val binding = LayoutMovieListItemBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return MovieViewHolder(binding, interaction)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }

    override fun getItemCount(): Int = differ.currentList.size

    fun submitList(list: List<Movie>) {
        EspressoIdlingResource.increment()
        val dataCommitCallback = Runnable {
            EspressoIdlingResource.decrement()
        }
        differ.submitList(list, dataCommitCallback)
    }

    class MovieViewHolder(
        private val binding: LayoutMovieListItemBinding,
        private val interaction: Interaction?
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Movie) = with(binding) {
            root.setOnClickListener {
                interaction?.onItemSelected(adapterPosition, item)
            }
            movieTitle.text = item.title
            Glide.with(root.context)
                .load(item.image)
                .into(movieImage)
            movieStarActors.text = "" // Clear previous text
            item.star_actors?.let {
                val actorsText = it.joinToString(", ")
                movieStarActors.text = actorsText
            }
        }
    }

    interface Interaction {
        fun onItemSelected(position: Int, item: Movie)
    }
}
