package com.codingwithmitch.espressouitestexamples.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.codingwithmitch.espressouitestexamples.databinding.FragmentDirectorsBinding

class DirectorsFragment : Fragment() {

    private var _binding: FragmentDirectorsBinding? = null
    private val binding get() = _binding!!

    private val directors: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let { args ->
            directors.addAll(args.get("args_directors") as List<String>)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDirectorsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setDirectors()
    }

    private fun setDirectors() {
        binding.directorsText.text = stringBuilderForDirectors(directors)
    }

    companion object {
        fun stringBuilderForDirectors(directors: ArrayList<String>): String {
            val sb = StringBuilder()
            for (director in directors) {
                sb.append(director).append("\n")
            }
            return sb.toString()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
