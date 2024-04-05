package org.d3if3133.myapplication


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import org.d3if3133.myapplication.model.Diskon
import org.d3if3133.myapplication.navigation.SetupNavGraph
import org.d3if3133.myapplication.ui.screen.GambarDiskon
import org.d3if3133.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {

    private val data = getData()
    private var index by mutableIntStateOf(0)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    SetupNavGraph()
                }
            }
        }
    }
    private fun  getData(): List<Diskon>{
        return listOf(
            Diskon("Diskon", R.drawable.diskon)
        )
    }
}

