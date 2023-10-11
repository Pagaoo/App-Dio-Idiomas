package devandroid.gabriel.primeiroappdio

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import java.util.Locale

class TrocarLingua : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trocar_lingua)

        val spinner_idiomas = findViewById<Spinner>(R.id.spinner_idiomas)
        val data = resources.getStringArray(R.array.language_list)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, data)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner_idiomas.adapter = adapter

        spinner_idiomas.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when (p2) {
                    1 -> {
                        LanguageSelection("pt")
                        val intent = Intent(this@TrocarLingua, MainActivity::class.java)
                        startActivity(intent)
                    }
                    2 -> {
                        LanguageSelection("en")
                        val intent = Intent(this@TrocarLingua, MainActivity::class.java)
                        startActivity(intent)
                    }
                    3 -> {
                        LanguageSelection("it")
                        val intent = Intent(this@TrocarLingua, MainActivity::class.java)
                        startActivity(intent)
                    }
                    4 -> {
                        LanguageSelection("es")
                        val intent = Intent(this@TrocarLingua, MainActivity::class.java)
                        startActivity(intent)
                    }
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }

    private fun LanguageSelection(language: String) {
        val locale = Locale(language)
        Locale.setDefault(locale)
        val res = this.resources
        val config = res.configuration
        config.setLocale(locale)
        resources.updateConfiguration(config, res.displayMetrics)
    }
}