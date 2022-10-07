package com.example.dialogfragment_14

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.dialogfragment_14.databinding.FragmentCustomDialogBinding
import kotlinx.android.synthetic.main.fragment_custom_dialog.*
import kotlinx.android.synthetic.main.fragment_custom_dialog.view.*


class CustomDialogFragment : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_custom_dialog, container, false)

        rootView.buttonCancel.setOnClickListener {
            dismiss()
        }

        rootView.buttonSubmit.setOnClickListener {

            val selectedID = radioGroupRating.checkedRadioButtonId
            val radio = rootView.findViewById<RadioButton>(selectedID)

            val ratingResult = radio.text.toString()

            Toast.makeText(context, "You rated: $ratingResult", Toast.LENGTH_SHORT).show()
            dismiss()
        }

        return rootView
    }

}