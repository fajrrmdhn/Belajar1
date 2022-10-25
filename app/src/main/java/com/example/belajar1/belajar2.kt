package com.example.belajar1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class belajar2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column() {
                Image(painter = painterResource(id = R.drawable.monkey_king_aka_sun_wukong_figure_posing_stick_rod_legendary_creature_chinese_mythology_vector_201904_1016),
                    contentDescription = "Gambar")
                androidx.compose.material.Surface(
                    color = Color.Red, modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Halo Jang?",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(8.dp, 12.dp, 8.dp, 12.dp),
                        color = Color.Blue
                    )
                }
            }

            Text(text = "Halo Cep")
        }
    }
}