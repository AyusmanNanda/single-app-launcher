package io.github.launchapp.singleapplauncher

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.github.launchapp.singleapplauncher.ui.theme.LaunchTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LaunchTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LauncherSetupScreen(
                        name = "Single App Launcher",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun LauncherSetupScreen(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(24.dp)) {
        Text(text = name)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Turn your device into a dedicated launcher for a single application.")
        Spacer(modifier = Modifier.height(24.dp))
        Button(
            onClick = { Log.d("SingleAppLauncher", "Set launcher button clicked") }) {
                Text("Set as Default Launcher")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LauncherSetupScreenPreview() {
    LaunchTheme {
        LauncherSetupScreen("Single App Launcher")
    }
}