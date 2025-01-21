package com.example.mybusinesscard

import android.graphics.Color
import android.os.Bundle
import android.provider.ContactsContract.Profile
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mybusinesscard.ui.theme.MyBusinessCardTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyBusinessCardTheme {
                Surface {  }
            }
        }
    }
}

@Composable
fun Profile( modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.padding(16.dp)
    ) {
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            ){
            val Image = painterResource(R.drawable.android_logo)
            Image(painter = Image, contentDescription = null)
            Text(
                text = stringResource(R.string.roan_miles_d_tanduyan),

            )
            Text(
                stringResource(R.string.android_developer_extraordinaire),
            )
        }
    }
}
@Composable
fun Info() {
    Box(
        modifier = Modifier.padding(16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            val imageSize = 24.dp

            val imageOne = painterResource(R.drawable.telephone)
            val imageTwo = painterResource(R.drawable.share)
            val imageThree = painterResource(R.drawable.share)


            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = imageOne,
                    contentDescription = null,
                    modifier = Modifier.size(imageSize)
                )
                Column(modifier = Modifier.padding(start = 8.dp)) {
                    Text(
                        text = stringResource(R.string._09982237876),
                        textAlign = TextAlign.Start,
                    )
                }
            }


            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = imageTwo,
                    contentDescription = null,
                    modifier = Modifier.size(imageSize)
                )
                Column(modifier = Modifier.padding(start = 8.dp)) {
                    Text(
                        text = stringResource(R.string.android_dev),
                        textAlign = TextAlign.Start,
                    )
                }
            }

            // Third Row
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = imageThree,
                    contentDescription = null,
                    modifier = Modifier.size(imageSize)
                )
                Column(modifier = Modifier.padding(start = 8.dp)) {
                    Text(
                        text = stringResource(R.string.roanmilestanduyan_gmail_com),
                        textAlign = TextAlign.Start,
                    )
                }
            }
        }
    }
}



@Composable
fun ScreenHere(){
    Column {
        Profile()
        Info()
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyBusinessCardTheme {
        ScreenHere()
    }
}