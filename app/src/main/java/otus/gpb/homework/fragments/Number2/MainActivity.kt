package otus.gpb.homework.fragments.Number2

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import otus.gpb.homework.fragments.R

class MainActivity2 : AppCompatActivity() {

    private var isLandscape: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        isLandscape = (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE)
        val resource = if (isLandscape) R.layout.activity_main2_dz2 else R.layout.activity_main_dz2
        setContentView(resource)


        if (isLandscape) {
            supportFragmentManager.beginTransaction()
                .add(R.id.place_fragmentBA_horizontal, BA_vertical()).commit()
            supportFragmentManager.beginTransaction()
                .add(R.id.place_fragmentBB, FragmentBB()).commit()
        } else {supportFragmentManager.beginTransaction()
            .add(R.id.place_fragmentBA_vertical, FragmentBA()).commit()
        }

    }


}