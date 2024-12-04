package com.example.tuto3plus


import android.content.Intent

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


import com.example.tuto3plus.ui.theme.Tuto3plusTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tuto3plusTheme {
            Tuto3 { intent -> startActivity(intent) }
            }
        }
    }
}

@Composable
fun Tuto3(startActivity : (Intent) -> Unit){
    Column(){
        Text("Utilisation des boutons ")
        Button(onClick = {
            val webSiteIntent = Intent(Intent.ACTION_VIEW , Uri.parse("http://www.google.com"))
            startActivity(webSiteIntent)
        }) {
        Text("Ouvrir un site web")
        }

        Button(onClick = {
            val callIntent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:+33612345678")
            }
            startActivity(callIntent)
        }) {
            Text("Téléphone : +33 6 12 34 56 78")
        }

        Button(onClick = {
            val emailIntent = Intent(Intent.ACTION_SENDTO).apply{
                data = Uri.parse("mailto:mailto:test@example.com")
            }
            startActivity(emailIntent)
        }){

        }

    }
}