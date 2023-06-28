package otus.gpb.homework.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class FragmentAA : Fragment() {

    companion object {                                                    //для принятия информации
        private const val ARG_VALUE = "backcolor"
        fun create(value: Int): FragmentAA {
            val fragment = FragmentAA()
            val arguments = Bundle()
            arguments.putInt(ARG_VALUE, value)
            fragment.arguments = arguments
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_a_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = view.findViewById<TextView>(R.id.textFragmentAA)
        val button = view.findViewById<Button>(R.id.buttonFragmentAA)
        button.setOnClickListener(){
            childFragmentManager.beginTransaction().replace(R.id.fragmentAB, FragmentAB.create(ColorGenerator.generateColor())).addToBackStack(null).commit()
        }


    val background = arguments?.getInt(ARG_VALUE)                      //использование принятой информации
    if (background != null) {
        text.setTextColor(background)
    }
}

}