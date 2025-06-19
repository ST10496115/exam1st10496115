package za.co.st10496115exam1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("UNUSED_VARIABLE")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


       var playlist=findViewById<TextView>(R.id.textView2)
        var songtitle=findViewById<TextView>(R.id.textView)
        var artistname=findViewById<EditText>(R.id.editTextText)
        var rating=findViewById<EditText>(R.id.editTextText2)
        var comments=findViewById<EditText>(R.id.editTextText3)
        var enter=findViewById<Button>(R.id.button)
        val next=findViewById<Button>(R.id.button2)


      next.setOnClickListener {
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













