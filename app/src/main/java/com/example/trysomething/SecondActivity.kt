package com.example.trysomething

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.trysomething.ui.theme.TrysomethingTheme

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@ExperimentalMaterial3Api
@Composable
fun TopsBar(modifier: Modifier = Modifier){
    TopAppBar(title = {
        Row {
            Icon(Icons.Default.ArrowBack, contentDescription = null,modifier = Modifier.size(30.dp))
            Text(text = "Player info")
        }
    })
}

@Preview(showBackground = true, showSystemUi = true)
@ExperimentalMaterial3Api
@Composable
fun SecondScreen(){
    Scaffold(topBar = { TopsBar()}) {paddingValues ->
        Surface(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)) {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())){
                Card(modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()){
                    Row {
                        Box(contentAlignment = Alignment.BottomCenter){
                            Image(
                                painter = painterResource(id = R.drawable.standardavatar),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(128.dp)
                                    .clip(CircleShape)
                                    .padding(10.dp)
                            )
                            Image(painter = painterResource(id = R.drawable.dotaplus),
                                contentDescription = null,
                                modifier = Modifier
                                    .clip(CircleShape)
                                    .size(25.dp))
                        }
                        Column {
                            Text(text = "Nickname:", fontSize = 15.sp)
                            Text(text = "Durachyo", fontSize = 15.sp, modifier = Modifier.height(30.dp))
                            Text(text = "Last Online:", fontSize = 15.sp)
                            Text(
                                text = "12 hours ago",
                                fontSize = 15.sp,
                                modifier = Modifier.height(30.dp)
                            )
                        }
                    }

                    Column {
                        Button(onClick = { /*TODO*/ },modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)) {
                            Text(text = "PROFILE LINK")
                        }
                        Button(onClick = { /*TODO*/ },modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                        ){
                            Text(text = "STEAM PROFILE LINK")
                        }
                    }
                }
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)) {
                    Row {
                        Box(){
                            Column {
                                Text(text = "MMR",modifier = Modifier.padding(10.dp),fontSize = 16.sp, fontWeight= FontWeight.Bold)
                                Text(text = "Wins",modifier = Modifier.padding(10.dp),fontSize = 16.sp, fontWeight= FontWeight.Bold)
                                Text(text = "Losses",modifier = Modifier.padding(10.dp),fontSize = 16.sp, fontWeight= FontWeight.Bold)
                                Text(text = "Win rate %",modifier = Modifier.padding(10.dp),fontSize = 16.sp, fontWeight= FontWeight.Bold)
                            }
                        }
                        Box(modifier = Modifier.fillMaxWidth(),contentAlignment = Alignment.CenterEnd){
                            Column {
                                Text(text = "2500",modifier = Modifier.padding(10.dp),fontSize = 16.sp)
                                Text(text = "886",modifier = Modifier.padding(10.dp),fontSize = 16.sp)
                                Text(text = "774",modifier = Modifier.padding(10.dp),fontSize = 16.sp)
                                Text(text = "66,87 %",modifier = Modifier.padding(10.dp),fontSize = 16.sp)
                            }
                        }
                    }
                }
                Card(modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)){
                    Column {
                        Text(text = "Most played hero",fontSize = 16.sp, fontWeight= FontWeight.Bold,modifier = Modifier.padding(20.dp))
                        Image(painter = painterResource(id = R.drawable.bg), contentDescription = null,modifier = Modifier.fillMaxWidth())
                        Box(modifier = Modifier.padding(20.dp)){
                            Column {
                                Text(text = "Hero name",fontSize = 16.sp,fontWeight= FontWeight.Bold)
                                Text(text = "Abbadon",fontSize = 16.sp)
                            }
                        }
                    }
                }
            }
        }
    }
}
