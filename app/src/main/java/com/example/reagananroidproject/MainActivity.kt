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
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.reagananroidproject.ui.theme.ReaganAnroidProjectTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text()

        }
    }
}

@Composable
fun Text(){

    Column(modifier = Modifier.fillMaxSize()
        .verticalScroll(rememberScrollState())
    ) {
        //LottieAnimation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.ani3))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(composition, progress,
            modifier = Modifier.size(300.dp)
        )
        //End of Lottie animation

        val mContext = LocalContext.current

        androidx.compose.material3.Text(text = "Welcome to Android",
            fontSize = 30.sp,
            color= Color.Red,
           fontWeight=FontWeight.Bold,
           fontStyle=FontStyle.Italic
            )
        
        androidx.compose.material3.Text(text = "Android Operating System (OS): Definition and How It Works\n" +
                "The Android operating system is a mobile operating system that was developed by Google (GOOGL\u200B) to be primarily used for touchscreen devices, cell phones, and tablets.")

        Spacer(modifier = Modifier.height(20.dp))


        androidx.compose.material3.Text(
            text = "Types of Cars",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray)
                .height(50.dp),
            textAlign= TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.White)

        androidx.compose.material3.Text(
            text = "1.Ferrari")

        androidx.compose.material3.Text(
            text = "2.Toyota")

        androidx.compose.material3.Text(
            text = "3.Lamboghini")




        Box(modifier = Modifier
            .fillMaxWidth()
            ) {
            Button(onClick = {mContext.startActivity(Intent(mContext,WoofActivity::class.java)) })
            { Text("Woof") }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                mContext.startActivity(Intent(mContext,FirstScreenActivity::class.java))
            },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp, end = 30.dp)

        ) {
            androidx.compose.material3.Text(text = "Firstscreen")
        }




        androidx.compose.material3.Text(
            text = "Programing Languages",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray)
                .height(50.dp),
            textAlign= TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.White)


        androidx.compose.material3.Text(
            text = "1.Python")

        androidx.compose.material3.Text(
            text = "2.Java")

        androidx.compose.material3.Text(
            text = "3.Kotlin")

        androidx.compose.material3.Text(
            text = "4.Html")

        Spacer(modifier = Modifier.height(20.dp))

        Divider()

        //Centering an image
        Box(modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.anroid) ,
                contentDescription = "cars",
                modifier = Modifier
                    .size(100.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop)
        }


        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                      mContext.startActivity(Intent(mContext,LayoutActivity::class.java))
            },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp, end = 30.dp)

        ) {
            androidx.compose.material3.Text(text = "Continue")
        }


    }

}


@Preview(showBackground = true)
@Composable
fun TextPreview(){
    Text()

}