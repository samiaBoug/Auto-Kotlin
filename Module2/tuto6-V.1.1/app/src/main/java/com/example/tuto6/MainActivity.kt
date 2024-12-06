package com.example.tuto6

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tuto6.ui.theme.Tuto6Theme
import kotlinx.coroutines.delay
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tuto6Theme {
                AsyncDataLoader()
            }
        }
    }
}

@Composable
fun AsyncDataLoader(modifier: Modifier=Modifier){
    var data by remember { mutableStateOf("loading...") }
    LaunchedEffect(Unit) {
        data = fetchData()
    }

    Text(
        text = data ,
        style = MaterialTheme.typography.headlineSmall
    )

}

@SuppressLint("NewApi")
suspend fun fetchData(): String{
    delay(5000)
    val currentTime = LocalTime.now()
    //val formatter = DateTimeFormatter.ofPattern("HH:mm:ss")
   // return "Date et heure actuelles : ${currentTime.format(formatter)}"
    return " Date et heure : $currentTime "
}

@Preview(showBackground = true)
@Composable
fun AsynchDataLoaderPreview(){
    AsyncDataLoader()
}


