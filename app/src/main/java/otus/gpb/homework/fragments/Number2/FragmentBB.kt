package otus.gpb.homework.fragments.Number2

import android.content.res.Configuration
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.widget.AppCompatButton
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.setFragmentResult
import otus.gpb.homework.fragments.ColorGenerator
import otus.gpb.homework.fragments.FragmentAA
import otus.gpb.homework.fragments.FragmentAB
import otus.gpb.homework.fragments.R


class FragmentBB : Fragment() {



    private var isLandscape: Boolean = true

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        isLandscape = (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE)
        return inflater.inflate(R.layout.fragment_b_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        isLandscape = (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE)


        view.findViewById<Button>(R.id.go_to_fragmentBA).setOnClickListener {

            if (isLandscape) {
                setFragmentResult("key", bundleOf("color" to ColorGenerator.generateColor())) //отправка информации хорошо подходит кога фрагменты на одном экране
            }
            else
            {
               parentFragmentManager.beginTransaction().replace(R.id.place_fragmentBA_vertical, FragmentBA.create(ColorGenerator.generateColor())).addToBackStack(null).commit()
            }
        }
    }

}