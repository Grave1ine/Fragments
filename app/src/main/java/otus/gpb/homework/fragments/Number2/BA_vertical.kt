package otus.gpb.homework.fragments.Number2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.setFragmentResultListener
import otus.gpb.homework.fragments.FragmentAA
import otus.gpb.homework.fragments.FragmentAB
import otus.gpb.homework.fragments.R


class BA_vertical : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        return inflater.inflate(R.layout.fragment_b_a_horizontal, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = view.findViewById<TextView>(R.id.text_fragmentBA_vertical)

        setFragmentResultListener("key") { _, bundle ->
            val color = bundle.getInt("color")               // Здесь можно передать любой тип, поддерживаемый Bundle-ом

            text.setTextColor(color)
        }



    }



}