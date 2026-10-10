package com.example.questtugaslayout

import androidx.annotation.DimenRes
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun PersonCard(
    name: String,
    address: String,
    @DrawableRes photo: Int,
    containerColor: Color,
    nameColor: Color,
    addressColor: Color,
    modifier: Modifier = Modifier,
    phone: String? = null,
    phoneColor: Color = Color.Unspecified,
    nameFontFamily: FontFamily? = null,
    @DimenRes nameFontSizeRes: Int = R.dimen.text_card_name,
    nameFontWeight: FontWeight = FontWeight.Bold
) {
