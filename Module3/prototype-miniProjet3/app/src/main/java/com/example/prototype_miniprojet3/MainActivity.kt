package com.example.prototype_miniprojet3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.prototype_miniprojet3.ui.theme.PrototypeminiProjet3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrototypeminiProjet3Theme {
                AffirmationApp()
            }
        }
    }
}
val affirmations = listOf(
    "Crois en toi-même et en toutes tes capacités.",
    "Chaque jour est une nouvelle opportunité.",
    "Tu es plus fort que tu ne le penses.",
    "N'abandonne jamais, les miracles prennent du temps.",
    "Le succès commence par la volonté de l'atteindre."
)

@Composable
fun AffirmationList(affirmations: List<String>){
    LazyColumn {
        items(affirmations){ affirmation->
            AffirmationCard(affirmation)
        }
    }
}
@Composable
fun AffirmationCard(affirmation : String){
    Card(modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)){
        Text(
            text = affirmation ,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(16.dp),
            color = MaterialTheme.colorScheme.onSurface
        )
    }
}

@Composable
fun AffirmationApp(){
    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = Color(0xE1246521),
            onPrimary = Color.White ,
            background = Color(0xBCE8AE55),
            surface =  Color(0xE17DEC7A),
            onSurface = Color.Black
        )
    ){
        Surface (
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){
            AffirmationList(affirmations)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AffirmationCardPreview(){
    AffirmationApp()
}
