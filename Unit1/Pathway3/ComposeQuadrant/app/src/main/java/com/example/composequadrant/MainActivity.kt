package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                ComposeQuadrantApp()
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column() {
        Row(modifier = Modifier.weight(1f)) {
            ComposableInfoCard(
                "Text composable",
                "Displays text and follows Material Design guidelines.",
                Color.Green,
                Modifier.weight(1f)

            )
            ComposableInfoCard(
                "Image composable",
                "Creates a composable that lays out and draws a given Painter class object.",
                Color.Yellow,
                Modifier.weight(1f)
            )
        }
        Row(modifier = Modifier.weight(1f)) {
            ComposableInfoCard(
                "Row composable",
                "A layout composable that places its children in a horizontal sequence.",
                Color.Cyan,
                Modifier.weight(1f)
            )
            ComposableInfoCard(
                "Column composable",
                "A layout composable that places its children in a vertical sequence.",
                Color.LightGray,
                Modifier.weight(1f)
            )
        }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxHeight()
            .background(backgroundColor)
            .padding(16.dp)
    ) {
        Text(
            text = title,
            modifier = Modifier
                .padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantApp()
}