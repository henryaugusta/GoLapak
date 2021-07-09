package com.simplify.golapak.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.simplify.golapak.R
import com.simplify.golapak.databinding.FragmentAuthBinding


class AuthFragment : Fragment() {

    private var _vbind: FragmentAuthBinding? = null
    private val vbind get() = _vbind as FragmentAuthBinding

    override fun onDestroyView() {
        super.onDestroyView()
        _vbind = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_auth, container, false);
        _vbind = FragmentAuthBinding.bind(view)
        // Inflate the layout for this fragment
        return vbind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vbind.btnRegister.setOnClickListener {
            Toast.makeText(requireContext(),"Registrasi",Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_authFragment_to_authRegister)
        }

        vbind.btnLogin.setOnClickListener {
            Toast.makeText(requireContext(),"Login",Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_authFragment_to_authLogin)
        }

        vbind.btnCopyright.setOnClickListener {
            Toast.makeText(requireContext(),"Login",Toast.LENGTH_LONG).show()
            findNavController().navigate(R.id.action_authFragment_to_authLogin)
        }


    }


}