package otus.gpb.homework.fragments.Number2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable
import androidx.fragment.app.setFragmentResultListener
import org.w3c.dom.Text
import otus.gpb.homework.fragments.ColorGenerator
import otus.gpb.homework.fragments.FragmentAA
import otus.gpb.homework.fragments.R


class FragmentBA : Fragment() {

     companion object {                                                    //для принятия информации
        private const val ARG_VALUE = "backcolor"
        fun create(value: Int): FragmentBA {
            val fragment = FragmentBA()
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
        return inflater.inflate(R.layout.fragment_b_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text = view.findViewById<TextView>(R.id.text_fragmentBA)

        view.findViewById<Button>(R.id.go_to_fragmentBB).setOnClickListener() {

            parentFragmentManager
                .beginTransaction()
                .add(R.id.place_fragmentBA_vertical, FragmentBB())
                .addToBackStack(null)
                .commit()
        }

        val background = arguments?.getInt(ARG_VALUE)
        if (background != null) {
            text.setTextColor(background)
        }

    }


}