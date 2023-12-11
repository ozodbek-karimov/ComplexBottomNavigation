package pl.ozodbek.complexbottomnavigation.ui.fragments.container_fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import pl.ozodbek.complexbottomnavigation.R
import pl.ozodbek.complexbottomnavigation.databinding.FragmentContainerBinding
import pl.ozodbek.complexbottomnavigation.util.activityFor
import pl.ozodbek.complexbottomnavigation.util.changeFragmentTo
import pl.ozodbek.complexbottomnavigation.util.containerNavController
import pl.ozodbek.complexbottomnavigation.util.getColorFragment
import pl.ozodbek.complexbottomnavigation.util.hideBottomNavigation
import pl.ozodbek.complexbottomnavigation.util.rootNavController
import pl.ozodbek.complexbottomnavigation.util.showBottomNavigation
import pl.ozodbek.datastorepractice.util.oneliner_viewbinding.viewBinding


class ContainerFragment : Fragment(R.layout.fragment_container) {

    private val binding by viewBinding(FragmentContainerBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {


        val navHostFragment =
            childFragmentManager.findFragmentById(R.id.container_fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.findNavController()
        binding.bottomNavigationView.setupWithNavController(navController)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.productsFragment,
                R.id.exploreFragment,
                R.id.cartFragment,
                R.id.profileFragment,
                -> {

                    showBottomNavigation()
                    activityFor().window?.navigationBarColor =
                        getColorFragment(R.color.transparentColor)
                    activityFor().window.decorView.systemUiVisibility =
                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                }

                else -> {
                    hideBottomNavigation()
                    activityFor().window?.navigationBarColor = getColorFragment(R.color.black)
                    activityFor().window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_VISIBLE
                }
            }
        }
    }
}