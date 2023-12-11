package pl.ozodbek.complexbottomnavigation.ui.fragments.bottom_nav_fragments.profile_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import pl.ozodbek.complexbottomnavigation.R
import pl.ozodbek.complexbottomnavigation.databinding.FragmentContainerBinding
import pl.ozodbek.complexbottomnavigation.databinding.FragmentProfileBinding
import pl.ozodbek.datastorepractice.util.oneliner_viewbinding.viewBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private val binding by viewBinding(FragmentProfileBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}