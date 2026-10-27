package com.vcc.measure

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { VccMeasureHome() }
    }
}

private val tools = listOf(
    "Régua digital", "Nível de bolha", "Inclinómetro",
    "Transferidor", "Bússola", "Medição AR",
    "Conversor", "Projetos", "Histórico"
)

@Composable
fun VccMeasureHome() {
    MaterialTheme {
        Scaffold(topBar = { Surface(tonalElevation = 3.dp) {
            Text("VCC Measure", style = MaterialTheme.typography.headlineMedium,
                modifier = Modifier.padding(20.dp))
        } }) { padding ->
            Column(Modifier.fillMaxSize().padding(padding).padding(16.dp)) {
                Text("Ferramentas de medição", style = MaterialTheme.typography.titleLarge)
                Spacer(Modifier.height(16.dp))
                LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 140.dp),
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    items(tools) { tool ->
                        ElevatedCard(modifier = Modifier.fillMaxWidth()) {
                            Text(tool, modifier = Modifier.padding(20.dp),
                                style = MaterialTheme.typography.titleMedium)
                        }
                    }
                }
            }
        }
    }
}
