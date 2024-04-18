package com.example.reagananroidproject

import android.content.Intent
import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.reagananroidproject.ui.theme.ReaganAnroidProjectTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
    Column(modifier = Modifier.fillMaxSize()) {

        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(title = { androidx.compose.material3.Text(text = "HOME", color = Color.White) } ,
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.DarkGray),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu ,
                        contentDescription ="menu", tint = Color.White )

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share
                        , contentDescription = "share",
                        tint = Color.White)

                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings
                        , contentDescription = "settings",
                        tint = Color.White)

                }
            })
        //END OF TopAppBar

        Spacer(modifier =Modifier.height(5.dp))

        androidx.compose.material3.Text(
            text = "BREED OF DOGS",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        //first row

        Row {
            Image(painter = painterResource(id = R.drawable.german)
                , contentDescription ="Madola",
                modifier = Modifier.size(width = 200.dp, height = 145.dp)
            )

            Spacer(modifier =Modifier.width(10.dp))

            Column {
                Text(text="German shepherd", fontWeight =FontWeight.Bold, fontSize = 15.sp)
                Text(text= "This is the best Dog in The World")
            }

            Spacer(modifier =Modifier.height(10.dp))
        }
        // end of Row 1

        // second row

        Row {
            Image(painter = painterResource(id = R.drawable.labrado)
                , contentDescription ="Madola",
                modifier = Modifier.size(width = 200.dp, height = 145.dp)
            )

            Spacer(modifier =Modifier.width(10.dp))

            Column {
                Text(text="Labrado", fontWeight =FontWeight.Bold, fontSize = 15.sp)
                Text(text= "This is the most dicsiplin dog in the world")
            }

            Spacer(modifier =Modifier.height(10.dp))
        }
        // end of Row 2



        //third raw

        Row {
            Image(painter = painterResource(id = R.drawable.alaskan)
                , contentDescription ="Madola",
                modifier = Modifier.size(width = 200.dp, height = 145.dp)
            )

            Spacer(modifier =Modifier.width(10.dp))

            Column {
                Text(text="Alaskan", fontWeight =FontWeight.Bold, fontSize = 15.sp)
                Text(text= "Alaskan is the mos hairy dog in the kenyan nation")
            }

            Spacer(modifier =Modifier.height(10.dp))
        }
        // end of Row 3
        
        Row {
            Button(onClick = {
                mContext.startActivity(Intent(mContext,MainActivity::class.java))
            },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.DarkGray),) {
                Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription = "ArrowBack", tint = Color.White)
                androidx.compose.material3.Text(text = "back")

            }
            Spacer(modifier =Modifier.width(10.dp))

            Button(onClick = { mContext.startActivity(Intent(mContext,IntentActivity::class.java)) },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.DarkGray),) {
                androidx.compose.material3.Text(text = "Next")

            }
        }





        }
    }




@Preview(showBackground = true)
@Composable
fun Layoutpreview(){

    Layout()

}