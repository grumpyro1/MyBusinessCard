package com.example.mybusinesscard

import android.graphics.Color
import android.media.Image
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
fun Profile(modifier: Modifier = Modifier ) {
    Box(
        modifier = modifier.padding(16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            val image = painterResource(R.drawable.android_logo)
            Image(painter = image, contentDescription = null)
            Text(
                text = stringResource(R.string.roan_miles_d_tanduyan),
                modifier = Modifier.padding(top = 8.dp),
                textAlign = TextAlign.Center
            )
            Text(
                text = stringResource(R.string.android_developer_extraordinaire),
                modifier = Modifier.padding(top = 4.dp),
                textAlign = TextAlign.Center,
            )
        }
    }
}

@Composable
fun Info(imageRes: Int, info: String, modifier: Modifier = Modifier) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val imageSize = 24.dp
            Row(modifier = modifier.padding(start = 50.dp, end = 50.dp, bottom = 16.dp)) {
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = null,
                    modifier = Modifier.size(imageSize)
                )
                Text(
                    text = info,
                    modifier = Modifier.padding(start = 16.dp).fillMaxWidth(),
                    textAlign = TextAlign.Start
                )
            }

        }
    }


@Composable
fun ScreenHere(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize().padding(),
        verticalArrangement = Arrangement.SpaceBetween,
    ) {
        Profile()
        Box (modifier = modifier.padding(16.dp)){
            Column {
                Info(imageRes = R.drawable.telephone, info = stringResource(R.string.number))
                Info(imageRes = R.drawable.share, info = stringResource(R.string.androiddev))
                Info(imageRes = R.drawable.mail, info = stringResource(R.string.rmdtanduyan_addu_edu_ph))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyBusinessCardTheme {
        ScreenHere()
    }
}