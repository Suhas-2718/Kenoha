package com.example.kenoha1

import android.media.MediaPlayer
import android.os.Bundle
import android.telecom.Call
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kenoha1.ui.theme.Kenoha1Theme
import android.widget.Button
import android.speech.SpeechRecognizer
import android.widget.TextView
import android.widget.Toast
import org.json.JSONObject
import java.io.IOException
import android.content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quickAssistanceBtn = findViewById<Button>(R.id.button1)
        val emergencyBtn = findViewById<Button>(R.id.button2)

        // Navigate to AssistanceActivity
        quickAssistanceBtn.setOnClickListener {
            val intent = Intent(this, AssistanceActivity::class.java)
            startActivity(intent)
        }

        // Show a toast when emergency button is clicked
        emergencyBtn.setOnClickListener {
            Toast.makeText(this, "Emergency button clicked 🚨", Toast.LENGTH_SHORT).show()
        }
    }
}