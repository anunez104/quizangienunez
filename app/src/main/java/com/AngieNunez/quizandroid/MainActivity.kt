package com.AngieNunez.quizandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.AngieNunez.quizandroid.ui.theme.QuizAndroidAngieNunezTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun Encabezado() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp), horizontalArrangement = Arrangement.Center
    ) {
        Text(
            text = "encabezado",
            textAlign = TextAlign.Center,
            modifier = Modifier.background(color = Color.Cyan)

        )
    }
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp)
        , verticalAlignment = Alignment.CenterVertically
    ) {
        Row(modifier = Modifier.fillMaxWidth().background(color = Color.Gray), horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(
                text = "item 1",
                modifier = Modifier.background(color = Color.Green)
            )
            Text(
                text = "item 2",
                textAlign = TextAlign.Center,
                modifier = Modifier.background(color = Color.Red)

            )
            Text(
                text = "item 1",
                modifier = Modifier.background(color = Color.Yellow)
            )
        }
    }
    Row(modifier = Modifier.fillMaxHeight(), verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = "pie",
            textAlign = TextAlign.End,

        )
    }


}
