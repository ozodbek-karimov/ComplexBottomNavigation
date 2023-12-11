package pl.ozodbek.complexbottomnavigation.ui.fragments.bottom_nav_fragments.cart_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import pl.ozodbek.complexbottomnavigation.R
import pl.ozodbek.complexbottomnavigation.databinding.FragmentCartBinding
import pl.ozodbek.complexbottomnavigation.databinding.FragmentContainerBinding
import pl.ozodbek.complexbottomnavigation.util.changeFragmentTo
import pl.ozodbek.complexbottomnavigation.util.containerNavController
import pl.ozodbek.complexbottomnavigation.util.onClick
import pl.ozodbek.datastorepractice.util.oneliner_viewbinding.viewBinding

class CartFragment : Fragment(R.layout.fragment_cart) {

    private val binding by viewBinding(FragmentCartBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.onClick {
            changeFragmentTo(CartFragmentDirections.actionCartFragmentToCartExampleFragment())
        }

    }
}