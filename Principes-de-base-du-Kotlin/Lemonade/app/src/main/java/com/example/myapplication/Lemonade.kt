package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
class Lemonade : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {



        }
    }
}

@Composable
fun LemonApplication(){
    Surface {
        Column {
        Button(onClick = {}) {
            Image(
                painter = painterResource(R.drawable.lemon_tree) ,
                contentDescription = null
            )
        }
        Text(
            text = stringResource(R.string.lemonTree)
        )
    }
    }
}
@Preview
@Composable
fun LemonAppPreview(){
    LemonApplication()
}








