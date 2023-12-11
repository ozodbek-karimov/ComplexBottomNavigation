package pl.ozodbek.complexbottomnavigation.ui.fragments.bottom_nav_fragments.products_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import pl.ozodbek.complexbottomnavigation.R
import pl.ozodbek.complexbottomnavigation.databinding.FragmentContainerBinding
import pl.ozodbek.complexbottomnavigation.databinding.FragmentProductsBinding
import pl.ozodbek.datastorepractice.util.oneliner_viewbinding.viewBinding

class ProductsFragment : Fragment(R.layout.fragment_products) {

    private val binding by viewBinding(FragmentProductsBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}