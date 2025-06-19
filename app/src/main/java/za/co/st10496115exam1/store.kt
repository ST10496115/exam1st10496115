package za.co.st10496115exam1

import android.content.Intent
import android.os.Bundle
import android.view.Display
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
var songtitle= arrayListOf<String>("")
var artistname= arrayListOf<String>("")
var rating= arrayListOf<String>("")
var comments= arrayListOf<String>("")
class store : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_playlist)

    var music=findViewById<TextView>(R.id.textView3)
    var buttonback=findViewById<Button>(R.id.button5)

    buttonback.setOnClickListener {
        val intent=Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

    var Display=""
        Display+="songtitle=${ songtitle.toString()}/n "
         Display+="artistname${artistname.toString()}/n"
        Display+="rating${rating.toString()}/n"
        Display+="comments${comments.toString()}/n"

















        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}




