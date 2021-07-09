package com.simplify.golapak.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.simplify.golapak.R
import com.simplify.golapak.databinding.FragmentAuthRegisterBinding


class AuthRegister : Fragment() {

    var _vbind: FragmentAuthRegisterBinding? = null
    val vbind get() = _vbind as FragmentAuthRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_auth_register, container, false)
        _vbind = FragmentAuthRegisterBinding.bind(view)
        return vbind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        vbind.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        vbind.btnRegister.setOnClickListener {
            findNavController().navigate(R.id.action_authRegister_to_authLogin)
        }
    }




}