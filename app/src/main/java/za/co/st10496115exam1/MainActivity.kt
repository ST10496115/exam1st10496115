package za.co.st10496115exam1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var playlist=findViewById<TextView>(R.id.playlist)
       var songtitle= findViewById<EditText>(R.id.songtitle)
        var artistname=findViewById<EditText>(R.id.artistname)

        var rating=findViewById<EditText>(R.id.rating)
        var `nextbutton`=findViewById<Button>(R.id.button)
        var enterbutton=findViewById<Button>(R.id.button2)

       `nextbutton`.setOnClickListener {
           val intent=Intent(this,store::class.java)
           startActivity(intent)
       }







        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

    }
}

}













