package com.example.gameshop

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.mer_login_fragment.view.*

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.mer_login_fragment, container, false)
        view.next_button.setOnClickListener{
            (activity as NavigationHost).navigateTo(ProductGridFragment(), false)
        }
        return view
    }

}
