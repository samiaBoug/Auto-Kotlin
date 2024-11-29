package com.example.exercices



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.exercices.ui.theme.ExercicesTheme

class ArticleSurCompose : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExercicesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                TutorialJetpack(
                    titre = stringResource(R.string.titre),
                    article1 = stringResource(R.string.article1),
                    article2 = stringResource(R.string.article2),

                    )

        }
        }
    }
}
}

@Composable
fun TutorialJetpack( titre : String , article1 : String,article2 : String , modifier : Modifier = Modifier){

    Column (modifier) {

        val image = painterResource(R.drawable.bg_compose_background)

        Image (
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit


            )
        Text(
            text = titre ,
            fontSize = 24.sp ,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = article1 ,
            fontSize = 16.sp ,
            modifier = Modifier.padding(16.dp) ,
            textAlign = TextAlign.Justify
        )
        Text(
            text = article2 ,
            fontSize = 16.sp ,
            modifier = Modifier.padding(16.dp) ,
            textAlign = TextAlign.Justify

        )
    }



}

@Preview(showBackground = true)
@Composable
fun TutorialJetpackPreview() {
    ExercicesTheme {
        TutorialJetpack(
            titre = stringResource(R.string.titre),
            article1 = stringResource(R.string.article1),
            article2 =  stringResource(R.string.article2)
        )

    }
}
