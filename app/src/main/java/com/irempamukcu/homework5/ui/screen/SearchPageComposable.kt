package com.irempamukcu.homework5.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.irempamukcu.homework5.R
import com.irempamukcu.homework5.ui.theme.amazonEmberBold
import com.irempamukcu.homework5.ui.theme.cornerColor
import com.irempamukcu.homework5.ui.theme.transparentGray

@Composable
fun SearchPageComposable() {//This composable is for search page
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .background(Color.Black)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(color = transparentGray),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {  }) {
                Icon(
                    painter = painterResource(id = R.drawable.searchicon),
                    contentDescription = "Search",
                    tint = Color.Gray
                )
            }

            Text(
                text = "Aktöre, başlığa... göre arama",
                color = Color.Gray,
                textAlign = TextAlign.Start,
                fontFamily = amazonEmberBold,
                modifier = Modifier.weight(1f)
            )

            IconButton(onClick = { }) {
                Icon(
                    painter = painterResource(id = R.drawable.microfonicon),
                    contentDescription = "Microphone",
                    tint = Color.Gray
                )
            }
        }

        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "Türler",
            color = Color.White,
            fontSize = 17.sp,
            textAlign = TextAlign.Start,
            fontFamily = amazonEmberBold,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(15.dp))

        SearchSubjectRowsChip("Aksiyon ve macera", "Komedi")
        SearchSubjectRowsChip("Belgesel", "Dram")
        SearchSubjectRowsChip("Fantastik", "Korku")

        Spacer(modifier = Modifier.height(20.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = cornerColor,
                contentColor = Color.White
            ),
            modifier = Modifier
                .clip(RoundedCornerShape(10.dp))
                .fillMaxWidth()
                .padding(horizontal = 105.dp)
                .height(40.dp)
        ) {
            Text(
                text = "Daha fazlasını gör",
                fontSize = 13.sp,
                textAlign = TextAlign.Center,
                fontFamily = amazonEmberBold
            )
        }

        Spacer(modifier = Modifier.height(15.dp))

        Text(
            text = "Seçme koleksiyonlar",
            color = Color.White,
            fontSize = 17.sp,
            textAlign = TextAlign.Start,
            fontFamily = amazonEmberBold,
            modifier = Modifier.fillMaxWidth()
                .padding(top = 20.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Avrupa'da üretilmiştir",
                color = Color.White,
                fontSize = 14.sp,
                textAlign = TextAlign.Start,
                fontFamily = amazonEmberBold,
                modifier = Modifier
                    .padding(end = 8.dp)
            )

            Image(
                painter = painterResource(R.drawable.titlegoicon),
                contentDescription = "go icon",
                modifier = Modifier.size(24.dp)
            )
        }


    }
}



