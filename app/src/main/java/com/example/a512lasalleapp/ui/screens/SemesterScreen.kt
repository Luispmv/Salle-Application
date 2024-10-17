package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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





@Composable
fun SemesterScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp).
            verticalScroll(rememberScrollState())
    ) {
        Icon(
            painter = painterResource(id = R.drawable.back_icon),
            contentDescription = "Back Icon",
            modifier = Modifier
                .size(36.dp)
        )

        Text(
            text = "Semestre",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            // Parcial headers and items
            ParcialList("1er parcial", listOf(
                "Fundamentos de Ingenieria" to "8.5",
                "Metodologia" to "8.5",
                "Taller" to "8.5",
                "Bases de Datos" to "8.5",
                "Modelos Matematicos" to "8.5",
                "Comunicacion" to "8.5",
                "Contexto Mundial" to "8.5"
            ))

            ParcialList("2do parcial", listOf(
                "Fundamentos de Ingenieria" to "8.5",
                "Metodologia" to "8.5",
                "Taller" to "8.5",
                "Bases de Datos" to "8.5",
                "Modelos Matematicos" to "8.5",
                "Comunicacion" to "8.5",
                "Contexto Mundial" to "8.5"
            ))

            ParcialList("3er parcial", listOf(
                "Fundamentos de Ingenieria" to "8.5",
                "Metodologia" to "8.5",
                "Taller" to "8.5",
                "Bases de Datos" to "8.5",
                "Modelos Matematicos" to "8.5",
                "Comunicacion" to "8.5",
                "Contexto Mundial" to "8.5"
            ))

            // Footer
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF002F5D))
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Promedio", color = Color(0xFFEBEBEB), fontWeight = FontWeight.Bold)
                Text(text = "8.5", color = Color(0xFFEBEBEB), fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Composable
fun ParcialList(headerText: String, items: List<Pair<String, String>>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFEBEBEB))
            .padding(horizontal = 20.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "Materia", color = Color(0xFF002F5D), fontWeight = FontWeight.Bold)
            Text(text = headerText, color = Color(0xFF002F5D), fontWeight = FontWeight.Bold)
        }

        items.forEach { item ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = item.first, color = Color(0xFF002F5D))
                Text(text = item.second, color = Color(0xFF002F5D))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SemesterScreenPreview() {
    SemesterScreen()
}
