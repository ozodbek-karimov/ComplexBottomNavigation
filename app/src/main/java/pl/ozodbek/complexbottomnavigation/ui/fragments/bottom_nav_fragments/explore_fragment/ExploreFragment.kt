package pl.ozodbek.complexbottomnavigation.ui.fragments.bottom_nav_fragments.explore_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import pl.ozodbek.complexbottomnavigation.R
import pl.ozodbek.complexbottomnavigation.databinding.FragmentContainerBinding
import pl.ozodbek.complexbottomnavigation.databinding.FragmentExploreBinding
import pl.ozodbek.complexbottomnavigation.ui.fragments.bottom_nav_fragments.cart_fragment.CartFragmentDirections
import pl.ozodbek.complexbottomnavigation.util.changeFragmentTo
import pl.ozodbek.complexbottomnavigation.util.onClick
import pl.ozodbek.datastorepractice.util.oneliner_viewbinding.viewBinding

class ExploreFragment : Fragment(R.layout.fragment_explore) {

    private val binding by viewBinding(FragmentExploreBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.onClick {
            changeFragmentTo(ExploreFragmentDirections.actionExploreFragmentToExploreExampleFragment())
        }

    }
}