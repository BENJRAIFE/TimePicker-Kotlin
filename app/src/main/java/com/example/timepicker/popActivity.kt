package com.example.timepicker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TimePicker
import androidx.fragment.app.DialogFragment


class popActivity:  DialogFragment(),View.OnClickListener {
     lateinit var timePicker:TimePicker
     lateinit var myview: View
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)

        myview=inflater.inflate(R.layout.pop_activity,container,false)

        var button_close:Button=myview.findViewById(R.id.close)
        timePicker=myview.findViewById(R.id.simpleTimePicker)
        button_close.setOnClickListener (this)
        return view
    }
    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
        this.dismiss()
        var myTime:String="${timePicker.hour} : ${timePicker.minute} "
        val main:MainActivity= activity as MainActivity
        main.setDate(myTime)
    }
}