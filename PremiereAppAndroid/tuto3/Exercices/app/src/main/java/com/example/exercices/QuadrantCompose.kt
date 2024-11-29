package com.example.exercices

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.exercices.ui.theme.ExercicesTheme

class QuadrantCompose : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExercicesTheme {

                QuadrantCompose (
                    titre1 = "Text composable",
                    titre2 = "Image composable",
                    titre3 = "Row composable",
                    titre4 = "Column composable",
                    contenue1 = "Displays text and follows the recommended Material Design guidelines." ,
                    contenue2 = "Creates a composable that lays out and draws a given Painter class object." ,
                    contenue3 = "A layout composable that places its children in a horizontal sequence." ,
                    contenue4 = "A layout composable that places its children in a vertical sequence."

                )

            }
        }
    }
}

@Composable
fun TextCompose(titre : String , text : String , modifier : Modifier){
    Column {
        Text(
            text = titre
        )
        Text(
            text = text

        )
    }
}
@Composable
fun ImageCompose(titre : String , text : String , modifier : Modifier= Modifier){
    Column {
        Text(
            text = titre
        )
        Text(
            text = text

        )
    }
}
@Composable
fun RowCompose(titre : String , text : String , modifier : Modifier= Modifier){
    Column {
        Text(
            text = titre
        )
        Text(
            text = text

        )
    }
}
@Composable
fun ColumnCompose(titre : String , text : String , modifier : Modifier= Modifier){
    Column {
        Text(
            text = titre
        )
        Text(
            text = text
        )
    }
}

@Composable
fun QuadrantCompose(titre1 : String ,titre2 : String , titre3 : String ,titre4 : String ,contenue1 : String, contenue2 : String,contenue3 : String,contenue4 : String,modifier : Modifier= Modifier){

    Column {
        Row {
            TextCompose(titre = titre1, text = contenue1, modifier = Modifier)
            ImageCompose(titre = titre2, text = contenue2, modifier = Modifier)
        }


        Row {
            RowCompose(titre = titre3, text = contenue3, modifier = Modifier)
            ColumnCompose(titre = titre4, text = contenue4, modifier = Modifier)
        }
    }

}

@Preview(showBackground = true )
@Composable
fun QuadrantComposePreview() {
    ExercicesTheme {
        QuadrantCompose (
            titre1 = "Text composable",
            titre2 = "Image composable",
            titre3 = "Row composable",
            titre4 = "Column composable",
            contenue1 = "Displays text and follows the recommended Material Design guidelines." ,
            contenue2 = "Creates a composable that lays out and draws a given Painter class object." ,
            contenue3 = "A layout composable that places its children in a horizontal sequence." ,
            contenue4 = "A layout composable that places its children in a vertical sequence."

        )




    }
}
