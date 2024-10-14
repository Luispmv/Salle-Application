package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a512lasalleapp.R
import com.example.a512lasalleapp.ui.components.ScreenTemplate

@Composable
fun GradesScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(0.dp)
            .background(Color.White)
            .padding(30.dp),
        verticalArrangement = Arrangement.spacedBy(30.dp)
    ) {
        // Back Icon
        Image(
            painter = painterResource(id = R.drawable.back_icon),
            contentDescription = "back-icon",
            modifier = Modifier
                .size(36.dp)
        )

        // Pagos Box
        Box(
            modifier = Modifier
                .size(175.dp)
                .background(Color(0xFFEBEBEB)),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.note_icon),
                    contentDescription = "note-icon",
                    modifier = Modifier.size(84.dp)
                )
                Text(
                    text = "Calificaciones",
                    color = Color(0xFF002F5D),
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
            }
        }

        // Semestres
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            // Semestre Card
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFEBEBEB))
                    .padding(horizontal = 20.dp, vertical = 10.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "1er semestre",
                    color = Color(0xFF002F5D)
                )
                Image(
                    painter = painterResource(id = R.drawable.next_icon),
                    contentDescription = "next-icon"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewGradesScreen() {
    GradesScreen()
}
