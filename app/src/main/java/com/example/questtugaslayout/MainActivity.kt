package com.example.questtugaslayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LayoutScreen()
        }
    }
}

@Composable
fun LayoutScreen() {
    val scriptFont = FontFamily.Cursive

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.prabwowo),
            contentDescription = stringResource(R.string.background_description),
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(R.color.background_scrim))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .safeDrawingPadding()
                .padding(horizontal = dimensionResource(R.dimen.screen_padding)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HeaderSection()

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.card_spacing))
                ) {
                    PersonCard(
                        name = stringResource(R.string.name_amba),
                        address = stringResource(R.string.address_amba),
                        photo = R.drawable.amba,
                        containerColor = colorResource(R.color.card_gray),
                        nameColor = colorResource(R.color.text_white),
                        addressColor = colorResource(R.color.text_yellow),
                        nameFontFamily = scriptFont,
                        nameFontSizeRes = R.dimen.text_card_name_script,
                        nameFontWeight = FontWeight.Normal
                    )
                    PersonCard(
                        name = stringResource(R.string.name_rusdi),
                        phone = stringResource(R.string.phone_number),
                        address = stringResource(R.string.address_rusdi),
                        photo = R.drawable.a,
                        containerColor = colorResource(R.color.card_purple),
                        nameColor = colorResource(R.color.text_white),
                        phoneColor = colorResource(R.color.text_cyan),
                        addressColor = colorResource(R.color.text_yellow)
                    )
                    PersonCard(
                        name = stringResource(R.string.name_fuad),
                        phone = stringResource(R.string.phone_number),
                        address = stringResource(R.string.address_fuad),
                        photo = R.drawable.fuad,
                        containerColor = colorResource(R.color.card_blue),
                        nameColor = colorResource(R.color.text_white),
                        phoneColor = colorResource(R.color.text_cyan),
                        addressColor = colorResource(R.color.text_white)
                    )
                    PersonCard(
                        name = stringResource(R.string.name_lilnusnus),
                        phone = stringResource(R.string.phone_number),
                        address = stringResource(R.string.address_lilnusnus),
                        photo = R.drawable.lilnusnus,
                        containerColor = colorResource(R.color.card_green),
                        nameColor = colorResource(R.color.text_white),
                        phoneColor = colorResource(R.color.text_cyan),
                        addressColor = colorResource(R.color.text_white)
                    )
                    PersonCard(
                        name = stringResource(R.string.name_rafli),
                        phone = stringResource(R.string.nim
                        ),
                        address = stringResource(R.string.address_saya),
                        photo = R.drawable.saya,
                        containerColor = colorResource(R.color.card_orange),
                        nameColor = colorResource(R.color.text_white),
                        phoneColor = colorResource(R.color.text_cyan),
                        addressColor = colorResource(R.color.text_white)
                    )
                }
            }

            FooterSection()
        }
    }
}

@Composable
private fun HeaderSection() {
    Column(
        modifier = Modifier.padding(
            top = dimensionResource(R.dimen.header_top_padding),
            bottom = dimensionResource(R.dimen.header_bottom_padding)
        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.header_title),
            color = colorResource(R.color.text_white),
            fontSize = dimensionResource(R.dimen.text_title).value.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.header_subtitle),
            color = colorResource(R.color.text_white),
            fontSize = dimensionResource(R.dimen.text_subtitle).value.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun FooterSection() {
    Text(
        text = stringResource(R.string.footer_copyright),
        color = colorResource(R.color.text_white),
        fontSize = dimensionResource(R.dimen.text_footer).value.sp,
        modifier = Modifier.padding(vertical = dimensionResource(R.dimen.footer_vertical_padding))
    )
}