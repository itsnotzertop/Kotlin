package com.example.trysomething

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.trysomething.ui.theme.TrysomethingTheme
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }
    }
}

@ExperimentalMaterial3Api
@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    searchFieldValue: String = "",
    onSearchFieldValueChange: (String) -> Unit = { }
){
        TopAppBar(title = {
            TextField(modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(percent = 50),
                leadingIcon = { Icon(Icons.Default.List, contentDescription = null,modifier = Modifier.size(32.dp))},
            value = searchFieldValue, onValueChange = onSearchFieldValueChange)})
}


@Composable
fun ListOfUsers(){
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(5.dp),
        shape = RoundedCornerShape(15.dp)
    ){
        Row {
            Image(painter = painterResource(id =R.drawable.standardavatar),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape))
            Box(modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp), contentAlignment = Alignment.BottomStart){
                Column {
                    Text(text = "Nickname",modifier = Modifier.width(100.dp))
                    Text(text = "Subtext",modifier = Modifier.width(100.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@ExperimentalLayoutApi
@ExperimentalMaterial3Api
@Composable
fun Somethinginit() {
    Scaffold(topBar = { TopBar(modifier = Modifier.background(color = MaterialTheme.colorScheme.onBackground))})
    { paddingValues ->
        Surface(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)){
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                TrysomethingTheme {
                    Column {
                        for (i in 0..10){
                            ListOfUsers()
                        }
                        Box(modifier = Modifier
                            .fillMaxSize()
                            .padding(10.dp), contentAlignment = Alignment.BottomEnd){
                            FloatingActionButton(onClick = {}) {
                                Icon(Icons.Default.KeyboardArrowUp, contentDescription = null)
                            }
                        }
                    }
                }
            }
        }
    }
}

