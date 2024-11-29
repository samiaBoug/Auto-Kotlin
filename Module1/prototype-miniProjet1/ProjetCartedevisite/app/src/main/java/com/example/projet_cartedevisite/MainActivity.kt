package com.example.projet_cartedevisite

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.projet_cartedevisite.ui.theme.ProjetCarteDeVisiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProjetCarteDeVisiteTheme {

                CarteDeVisite(

                    )

            }
        }
    }
}

@Composable
fun CarteDeVisite() {
    Box{
        val backgrounImg = painterResource(R.drawable.background)
        Image (
            painter = backgrounImg ,
            contentDescription = null ,
            alpha = 0.5f ,
            contentScale = ContentScale.Crop ,
            modifier = Modifier.padding(top = 20.dp)

        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // Nom et profession
        Text(
            text = "BOUGTOUB Samia",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "Développeuse Full-Stack",
            style = MaterialTheme.typography.labelSmall,
            color = Color.DarkGray
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Coordonnées
        ContactInfo(
            label = "Téléphone :",
            value = "+212 6 12 34 56 78",
            onClick = { /* Appeler */ }
        )
        ContactInfo(
            label = "Email :",
            value = "bougtoubsamia@gmail.com",
            onClick = { /* Envoyer un email */ }
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Bouton pour site web
        Button(onClick = { /* Ouvrir le site */ }) {
            Text("Visiter mon site")
        }


    }
}
@Composable
fun ContactInfo(label: String, value: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .clickable(onClick = onClick)
            .padding(vertical = 4.dp)
    ) {
        Text(text = "$label ", fontWeight = FontWeight.Bold)
        Text(text = value, color = Color.Blue)
    }
}
@Preview(showBackground = true)
@Composable
fun CarteVisitePreview() {
    ProjetCarteDeVisiteTheme {
        CarteDeVisite(

        )
    }
}