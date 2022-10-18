package otus.gpb.homework.fragments

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var buttonGoFragmentA: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonGoFragmentA = findViewById(R.id.Button1)
        buttonGoFragmentA.setOnClickListener{
            Toast.makeText(this, "нажатие", Toast.LENGTH_SHORT).show()
            //supportFragmentManager.beginTransaction().replace(R.id.fragmentA, FragmentA.newInstance()).commit()
            supportFragmentManager.beginTransaction().replace(R.id.fragmentA, FragmentA()).commit()
        }
    }

}