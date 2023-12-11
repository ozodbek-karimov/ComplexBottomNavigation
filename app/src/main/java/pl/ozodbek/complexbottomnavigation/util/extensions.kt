package pl.ozodbek.complexbottomnavigation.util


import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import pl.ozodbek.complexbottomnavigation.R


fun Fragment.hideBottomNavigation() {
    val bottomNavigationView = activityFor().findViewById<View>(R.id.bottomNavigationView)

    bottomNavigationView.animate()
        .translationY(bottomNavigationView.height.toFloat())
        .alpha(0f)
        .setDuration(50)
        .setListener(null)
        .withEndAction {
            bottomNavigationView.gone()
        }
}

fun Fragment.showBottomNavigation() {
    val bottomNavigationView = activityFor().findViewById<View>(R.id.bottomNavigationView)
    bottomNavigationView.animate().translationY(0f).alpha(1f)
        .setDuration(50)
        .setListener(null)
        .withStartAction {
            bottomNavigationView.show()
        }
}


fun Fragment.changeFragmentTo(destination: Any) {
    val navController = this.findNavController()

    when (destination) {
        is Int -> {
            navController.safeNavigate(destination)
        }

        is NavDirections -> {
            navController.safeNavigate(destination)
        }
    }
}

fun Fragment.changeFragmentTo(destination: Any, navController: NavController?) {

    when (destination) {
        is Int -> {
            navController?.safeNavigate(destination)
        }

        is NavDirections -> {
            navController?.safeNavigate(destination)
        }
    }
}

fun NavController.safeNavigate(direction: Any) {
    when (direction) {
        is Int -> {
            if (currentDestination?.id == direction) {
                return
            }
            navigate(direction)
        }

        is NavDirections -> {
            var isNavigationEnabled = true
            CoroutineScope(Dispatchers.Main).launch {
                if (isNavigationEnabled) {
                    isNavigationEnabled = false
                    currentDestination?.getAction(direction.actionId)?.run {
                        navigate(direction)
                    }
                    delay(1000)
                    isNavigationEnabled = true
                }
            }
        }

        else -> {
        }
    }
}

fun View.show() {
    this.visibility = View.VISIBLE
}

fun View.gone() {
    this.visibility = View.GONE
}

fun View.hide() {
    this.visibility = View.INVISIBLE
}

fun View.onClick(clickListener: (View) -> Unit) {
    setOnClickListener(clickListener)
}


fun Fragment.onBackPressed(onBackPressed: OnBackPressedCallback.() -> Unit) {
    requireActivity().onBackPressedDispatcher.addCallback(this) {
        onBackPressed()
    }
}

fun Fragment.popBackStack() {
    findNavController().popBackStack()
}



fun Fragment.activityFor(): AppCompatActivity {
    return requireActivity() as AppCompatActivity
}


fun Fragment.containerNavController() =
    requireActivity().findNavController(R.id.container_fragmentContainerView)

fun Fragment.rootNavController() =
    requireActivity().findNavController(R.id.fragmentContainerView)



fun Fragment.getColorFragment(color: Int): Int {
    return ContextCompat.getColor(this.requireContext(), color)
}


