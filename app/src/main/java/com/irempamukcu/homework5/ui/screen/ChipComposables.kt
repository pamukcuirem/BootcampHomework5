package com.irempamukcu.homework5.ui.screen

import android.annotation.SuppressLint
import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.irempamukcu.homework5.R
import com.irempamukcu.homework5.data.entity.Contents
import com.irempamukcu.homework5.ui.theme.amazonEmberBold
import com.irempamukcu.homework5.ui.theme.amazonEmberRegular
import com.irempamukcu.homework5.ui.theme.cornerColor
import com.irempamukcu.homework5.ui.theme.subjectColor

@SuppressLint("SuspiciousIndentation")
@Composable
fun CategoryChip(text : String){ //It is a chip for multiple use of categories
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp
    val screenWidth = configuration.screenWidthDp

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(start = 15.dp)
            .background(
                Color.Black,
                shape = RoundedCornerShape(20.dp)
            )
            .border(1.dp, cornerColor, shape = RoundedCornerShape(20.dp))
    ) {
        Text(
            modifier = Modifier.padding( horizontal = 15.dp, vertical = 5.dp ),
            text = text,
            fontFamily = amazonEmberRegular,
            color = Color.White,
            fontSize = (screenWidth/30).sp,
            fontWeight = FontWeight.Bold
        )
    }


}



@Composable
fun MoviesChip(text: String, list: List<Contents>?){//This is a chip for showing contents
    val configuration = LocalConfiguration.current
    val screenHeight = configuration.screenHeightDp
    val screenWidth = configuration.screenWidthDp

    Column (modifier = Modifier.fillMaxWidth()
        .size((screenHeight/4.5).dp)){
        Row(modifier = Modifier.fillMaxWidth()) {
            Text(text = text,
                color = Color.White,
                fontSize = 17.sp,
                fontFamily = amazonEmberBold,
                modifier = Modifier.padding(start = 20.dp, end = 10.dp))
            Image(painter = painterResource(R.drawable.titlegoicon), contentDescription = "go icon")
        }

        Spacer(modifier = Modifier.size(width = screenWidth.dp, height = 10.dp))

        LazyRow (modifier = Modifier.fillMaxSize()){

            list.let {
                if (it != null) {
                    items(
                        it.count(),
                        itemContent = {
                            val content = list!![it]
                            val activity = (LocalContext.current as Activity)
                           
                            Image(bitmap = ImageBitmap.imageResource(
                                id= activity.resources.getIdentifier(content.content_image,"drawable",activity.packageName)),
                                contentDescription = "Film Resmi",
                                modifier = Modifier.size(height = (screenHeight/5.5).dp, width = (screenWidth/1.9).dp).padding(horizontal =6.dp))

                        }
                    )
                }
            }
        }


    }

    Spacer(modifier = Modifier.size(width = screenWidth.dp, height = 20.dp))
}

@Composable
fun SearchSubjectsChip(text : String){//This is a chip for subjects of contents

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(5.dp))
            .background(subjectColor)

            .height(55.dp)
            .width(166.dp)
            .padding(8.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = Color.White,
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            fontFamily = amazonEmberBold
        )
    }
}

@Composable
fun SearchSubjectRowsChip(text: String, text2: String){//This is a chip for showing subject composables
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        SearchSubjectsChip(text)
        SearchSubjectsChip(text2)
    }
}



