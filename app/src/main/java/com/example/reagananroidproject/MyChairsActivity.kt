package com.example.reagananroidproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.reagananroidproject.ui.theme.ReaganAnroidProjectTheme

class MyChairsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MyChairs()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyChairs(){
    Column (
        modifier = Modifier
            .fillMaxSize())

    {
        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(title = {  },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.White),
            navigationIcon = {
                IconButton(onClick = {  mContext.startActivity(Intent(mContext,FormActivity::class.java)) }) {
                    Icon(imageVector = Icons.Default.ArrowBack ,
                        contentDescription ="ArrowBack", tint = Color.Black )

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Delete
                        , contentDescription = "Add",
                        tint = Color.Black)

                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu
                        , contentDescription = "settings",
                        tint = Color.Black)

                }
            })
        //END OF TopAppBar
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            Text(
                text = "Chairs",
                fontSize = 40.sp,
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(20.dp)
            )
            Spacer(modifier = Modifier.height(10.dp))

            //Row1
            Row(modifier = Modifier
                .padding(start = 20.dp)
            ){
                //Column1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.chair1) ,
                                contentDescription = "chair",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                            text = "Amos Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "443 reviewers",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif)

                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "$ 680",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                }

                //End of Column1
                Spacer(modifier = Modifier.width(10.dp))
                //Column2
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.chair2) ,
                                contentDescription = "lacala",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Kew Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif
                    )

                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "1,952 reviewers",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif)

                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = " $580",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                }

                //End of Column2


            }

            //End of Row1
            Spacer(modifier = Modifier.height(20.dp))
            //Row2
            Row(modifier = Modifier
                .padding(start = 20.dp)
            ){
                //Column1
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.chair3) ,
                                contentDescription = "newyork",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Buro Chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "547 reviewers",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif)

                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "$680",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                }

                //End of Column1
                Spacer(modifier = Modifier.width(10.dp))


                //Column2
                Column {
                    Card(
                        modifier = Modifier
                            .height(100.dp)
                            .width(160.dp)
                    ) {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center){
                            Image(
                                painter = painterResource(id = R.drawable.chair4) ,
                                contentDescription = "newyork",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.FillBounds
                            )

                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Tina chair",
                        fontSize = 20.sp,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(5.dp))


                    Text(
                        text = "648 reviewers",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif)

                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "$480",
                        fontSize = 15.sp,
                        fontFamily = FontFamily.Serif,
                        color = Color.Blue
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                }

                //End of Column2
            }
            //End of Row2

        }


    }

}

@Preview(showBackground = true)
@Composable
fun MyChairsPreview(){
    MyChairs()
}