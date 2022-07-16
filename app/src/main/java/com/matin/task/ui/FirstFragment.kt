package com.matin.task.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.matin.task.adapter.FeedAdapter
import com.matin.task.data.MainViewModel
import com.matin.task.databinding.FragmentFirstBinding
import com.matin.task.model.ApiResponse
import com.matin.task.model.Docs
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.catch

@AndroidEntryPoint
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    private val viewModel: MainViewModel by viewModels()
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycleScope.launchWhenStarted {
            viewModel.getFeeds()
                .catch {

                }
                .collect{
                    handleResponse(it)
                }
        }

    }

    private fun handleResponse(response: ApiResponse) {
        setAdapter(response.docs)
    }

    private fun setAdapter(feeds: ArrayList<Docs>) {
        val adapter = FeedAdapter(feeds)
        binding.feedRecyclerview.layoutManager = GridLayoutManager(requireContext(), 1)
        binding.feedRecyclerview.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}