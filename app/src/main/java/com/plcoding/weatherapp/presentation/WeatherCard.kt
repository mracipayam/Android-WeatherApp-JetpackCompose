package com.plcoding.weatherapp.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun WeatherCard(
    state : WeatherState,
    backgroundColor : Color,
    modifier: Modifier = Modifier
    ){
        state.weatherInfo?.currentWeatherData?.let {data->

            Card(
                backgroundColor = backgroundColor,
                shape = RoundedCornerShape(10.dp),
                modifier = modifier.padding(16.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {

                }

            }
        }

}