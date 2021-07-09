package com.simplify.golapak.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.simplify.golapak.R
import com.simplify.golapak.databinding.FragmentAuthLoginBinding
import com.simplify.golapak.databinding.FragmentAuthRegisterBinding


class AuthLogin : Fragment() {


    var _vbind: FragmentAuthLoginBinding? = null
    val vbind get() = _vbind as FragmentAuthLoginBinding


    override fun onDestroyView() {
        super.onDestroyView()
        _vbind=null
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_auth_login, container, false)
        _vbind = FragmentAuthLoginBinding.bind(view)
        // Inflate the layout for this fragment
        return vbind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vbind.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        vbind.btnLogin.setOnClickListener {
            findNavController().navigate(R.id.action_authLogin_to_userHomeFragment)
        }

    }


}