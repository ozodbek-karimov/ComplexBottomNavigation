package pl.ozodbek.complexbottomnavigation.ui.fragments.bottom_nav_fragments.explore_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import pl.ozodbek.complexbottomnavigation.R
import pl.ozodbek.complexbottomnavigation.databinding.FragmentCartExampleBinding
import pl.ozodbek.complexbottomnavigation.databinding.FragmentContainerBinding
import pl.ozodbek.complexbottomnavigation.databinding.FragmentExploreExampleBinding
import pl.ozodbek.complexbottomnavigation.util.activityFor
import pl.ozodbek.complexbottomnavigation.util.getColorFragment
import pl.ozodbek.complexbottomnavigation.util.onBackPressed
import pl.ozodbek.complexbottomnavigation.util.popBackStack
import pl.ozodbek.datastorepractice.util.oneliner_viewbinding.viewBinding

class ExploreExampleFragment : Fragment(R.layout.fragment_explore_example) {

    private val binding by viewBinding(FragmentExploreExampleBinding::bind)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onBackPressed {
            popBackStack()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activityFor().setSupportActionBar(binding.toolbar)
        activityFor().window?.navigationBarColor = getColorFragment(R.color.black)
        activityFor().title = "Explore example"
        binding.toolbar.setNavigationOnClickListener {
            popBackStack()
        }

    }
}