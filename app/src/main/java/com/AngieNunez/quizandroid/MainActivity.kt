package com.AngieNunez.quizandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
            .padding(30.dp), verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Gray),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
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

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun Perfil() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val painter = painterResource(R.drawable.ic_launcher_background)
        Image(
            painter = painter,
            contentDescription = "max",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(CircleShape)
                .size(200.dp)
        )
        Text(
            text = "Juan Perez",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "desarrollador android apasionado por la tecnologia y el diseño",
            fontSize = 15.sp,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(12.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(
                text = "150",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Text(
                text = "2.3k",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Text(
                text = "980",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp)

        }

        Spacer(modifier = Modifier.height(4.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(
                text = "post",
                color = Color.Gray,
                fontSize = 12.sp,
            )
            Text(
                text = "follows",
                color = Color.Gray,
                fontSize = 12.sp,
            )
            Text(
                text = "likes",
                color = Color.Gray,

                fontSize = 12.sp
            )

        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Button(
                onClick = {},

            ) { Text("Seguir")}
            Button(
                onClick = {},
                ) { Text("Seguir")}
        }


    }


}
