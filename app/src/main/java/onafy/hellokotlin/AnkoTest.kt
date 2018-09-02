package onafy.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import onafy.hellokotlin.R.id.center
import onafy.hellokotlin.R.id.center_horizontal
import org.jetbrains.anko.*

class AnkoTest : AppCompatActivity() {
    private var name = ""
    lateinit var nameTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout{
            imageView(R.drawable.img_madrid).
                    lparams {
                        width = 250
                        height = 250
                        gravity = center_horizontal
                        padding = dip(20)
                        margin = dip(15)
                    }

            nameTextView = textView()

            button("Say Hello")
        }

        val intent = intent
        name = intent.getStringExtra("name")
        nameTextView.text = name
    }

}
