package com.gas.pam_p4_tugas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScheduleCard(
    title: String,
    timelocation: String,
    lecture: String,
    backgroundColor: Color,
    leftIcon : Painter,
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = leftIcon,
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
                    .padding(end = 10.dp)
            )
            Column(modifier = Modifier.weight(1f)) {
                Text(text = title, fontSize = 20.sp, fontWeight = FontWeight.SemiBold)
                Text(text = timelocation, fontSize = 16.sp, fontWeight = FontWeight.SemiBold, color = colorResource(R.color.waktu_text))
                Text(text = lecture, fontWeight = FontWeight.Bold, color = colorResource(R.color.dosen_text))
            }
            Image(
                painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(30.dp)
            )
        }
    }
}

@Composable
fun Layout(){
    Box(modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.bg_hebat),
            contentDescription = "Background",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .blur(radius = 10.dp)
        )
        Column(modifier = Modifier
            .padding(top = 60.dp, start = 10.dp, end = 10.dp, bottom = 10.dp)
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                stringResource(R.string.judul),
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                stringResource(R.string.semesterditempuh),
                fontSize = 25.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(20.dp))
            ScheduleCard(
                title = stringResource(R.string.matkul1),
                timelocation = stringResource(R.string.waktu1),
                lecture = stringResource(R.string.dosen1),
                backgroundColor = colorResource(R.color.biru),
                leftIcon = painterResource(R.drawable.manpro)
            )
            Spacer(modifier = Modifier.height(20.dp))
            ScheduleCard(
                title = stringResource(R.string.matkul2),
                timelocation = stringResource(R.string.waktu2),
                lecture = stringResource(R.string.dosen2),
                backgroundColor = colorResource(R.color.biru_langit),
                leftIcon = painterResource(R.drawable.technopreneurship)
            )
            Spacer(modifier = Modifier.height(20.dp))
            ScheduleCard(
                title = stringResource(R.string.matkul3),
                timelocation = stringResource(R.string.waktu3),
                lecture = stringResource(R.string.dosen3),
                backgroundColor = colorResource(R.color.oranye),
                leftIcon = painterResource(R.drawable.database)
            )
            Spacer(modifier = Modifier.height(20.dp))
            ScheduleCard(
                title = stringResource(R.string.matkul4),
                timelocation = stringResource(R.string.waktu4),
                lecture = stringResource(R.string.dosen4),
                backgroundColor = colorResource(R.color.oranye_cerah),
                leftIcon = painterResource(R.drawable.pws)
            )
            Box(
                modifier = Modifier.fillMaxSize()
            ){
                Text(
                    stringResource(R.string.copy),
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 50.dp)
                )
            }
        }
    }
}