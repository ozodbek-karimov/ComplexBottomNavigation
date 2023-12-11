package pl.ozodbek.complexbottomnavigation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pl.ozodbek.complexbottomnavigation.databinding.ActivityMainBinding
import pl.ozodbek.complexbottomnavigation.util.activityFor
import pl.ozodbek.datastorepractice.util.oneliner_viewbinding.viewBinding

class MainActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }
}