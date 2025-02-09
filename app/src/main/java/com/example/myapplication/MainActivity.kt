package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // `onCreate` is the entry point, similar to `main`.
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { // Call functions to create UI components here.
            About(title = "Welcome!", body = "This is my first Android app. I made this with Android Studio.\n - Faseeh")
        }
    }
}

@Preview(showBackground = true) // To show the preview in Android Studio sidebar.
@Composable // A composable function which is called in `setContent`.
fun About(title: String = "Title", body: String = "Body") {
    Column(modifier = Modifier.padding(24.dp)) { // A function which creates a column which can store elements.
        Text(text = title, fontSize = 18.sp) // A text element.
        Text(text = body)
    }
}
