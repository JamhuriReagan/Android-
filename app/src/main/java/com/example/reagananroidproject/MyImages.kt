package com.example.reagananroidproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.reagananroidproject.ui.theme.Pink40
import com.example.reagananroidproject.ui.theme.ReaganAnroidProjectTheme

class MyImages : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MyImage()
        }
    }
}

@Composable
fun MyImage(){
    Column(modifier = Modifier
        .fillMaxSize() ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)

    {
        val mContext = LocalContext.current

        Spacer(modifier = Modifier.height(50.dp))

            Image(painter = painterResource(id = R.drawable.product5) ,
                contentDescription = "cars",
                modifier = Modifier
                    .size(250.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)

        Spacer(modifier = Modifier.height(20.dp))

            androidx.compose.material3.Text(
                text = "Choose your product",
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.ExtraBold,)


        Spacer(modifier = Modifier.height(20.dp))

        androidx.compose.material3.Text(text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam non lorem nunc. Vestibulum tortor nisl, facilisis ut facilisis in, facilisis at eros. Pellentesque diam diam, facilisis in elit vitae, euismod consectetur risus. Aliquam nibh sem, finibus et rutrum quis, pretium eu elit. ")

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {
                mContext.startActivity(Intent(mContext,Image2Activity::class.java))
            },
            shape = RoundedCornerShape(100.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp, end = 30.dp)

        ) {
            Text(text = "Next")
        }


    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyImagePreview(){
    MyImage()
}