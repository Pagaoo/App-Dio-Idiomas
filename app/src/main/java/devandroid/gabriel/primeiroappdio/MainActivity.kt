package devandroid.gabriel.primeiroappdio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bem_vindo = findViewById<TextView>(R.id.bem_vindo)
        val name = "Gabriel"

        val texto_bem_vindo = getString(R.string.bem_vindo, name)
        bem_vindo.text = texto_bem_vindo

        val configurationButton = findViewById<Button>(R.id.configuration)
        configurationButton.setOnClickListener {
            val intent = Intent(this, TrocarLingua::class.java)
            startActivity(intent)
        }
    }
}