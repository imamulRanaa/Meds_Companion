package com.example.medscompanion.ui.presentation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.medscompanion.medicineData.squareMed
import com.example.medscompanion.ui.theme.MedsCompanionTheme
import com.example.medscompanion.ui.theme.SpartanTypography

@Preview
@Composable
fun AllMedsPrev() {
    MedsCompanionTheme {
        AllMeds()
    }
}

@Composable
fun AllMeds() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.surface)
    ) {
        MedsDetail()
        MedsCard()
    }
}


@Composable
fun MedsDetail() {
    Column(
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 20.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text(
            "Aspirin",
            color = MaterialTheme.colorScheme.secondary,
            style = SpartanTypography.titleLarge
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .wrapContentSize()
                    .height(60.dp)
                    .width(60.dp)
                    .clip(CircleShape)
                    .background(
                        MaterialTheme.colorScheme.primary
                    )
            ) {
                Text(
                    text = "TAB",
                    style = SpartanTypography.bodyLarge,
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }
            Text(
                text = squareMed.type,
                style = SpartanTypography.bodyLarge,
                color = MaterialTheme.colorScheme.secondary
            )
        }
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Text(
                text = "Available Brands: ${squareMed.availableBrands}",
                color = MaterialTheme.colorScheme.secondary,
                style = SpartanTypography.bodySmall
            )
            Text(
                text = "Pharmacology: ${squareMed.aspirinPhermalogy}",
                color = MaterialTheme.colorScheme.secondary,
                style = SpartanTypography.bodySmall
            )
            SelectionContainer {
                Text(
                    text = "Side Effects: ${squareMed.aspririnSide}",
                    color = MaterialTheme.colorScheme.secondary,
                    style = SpartanTypography.bodySmall
                )
            }

        }
        Row(
            modifier = Modifier
                .padding(horizontal = 20.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                "Name",
                color = MaterialTheme.colorScheme.secondary,
                style = SpartanTypography.bodyLarge
            )
            Text(
                "Price",
                color = MaterialTheme.colorScheme.secondary,
                style = SpartanTypography.bodyLarge
            )
        }
    }
}

@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
@Composable
fun MedsCard() {
    val state = rememberLazyListState()
    val snappingLayout = remember(state) { SnapLayoutInfoProvider(state) }
    val flingBehavior = rememberSnapFlingBehavior(snappingLayout)
    var expendedState by remember {
        mutableStateOf(false)
    }
    LazyColumn(
        state = state,
        flingBehavior = flingBehavior,
        contentPadding = PaddingValues(start = 20.dp, end = 20.dp, bottom = 20.dp),
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(5) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(25.dp))
                    .wrapContentHeight(),
                colors = CardDefaults.cardColors(MaterialTheme.colorScheme.secondary),
                onClick = { expendedState = !expendedState }
            ) {
                DetailsCard(squareMed.name, squareMed.company, squareMed.strength, squareMed.price)
            }
        }
    }
}


@Composable
fun DetailsCard(tabName: String, companyName: String, strength: String, price: String) {


    Row(
        modifier = Modifier
            .padding(vertical = 20.dp, horizontal = 20.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .wrapContentSize()
                        .height(60.dp)
                        .width(60.dp)
                        .clip(CircleShape)
                        .background(
                            MaterialTheme.colorScheme.primary
                        )
                ) {
                    Text(
                        text = "TAB",
                        style = SpartanTypography.bodyLarge,
                        color = MaterialTheme.colorScheme.onPrimary
                    )
                }
                Text(
                    text = tabName,
                    style = SpartanTypography.bodyLarge,
                    color = MaterialTheme.colorScheme.surface
                )
            }
            Text(
                "Company Name: $companyName",
                style = SpartanTypography.bodySmall,
                color = MaterialTheme.colorScheme.surface
            )
            Text(
                "Strength: $strength",
                style = SpartanTypography.bodySmall,
                color = MaterialTheme.colorScheme.surface
            )
            Text(
                "Price: $price TK",
                style = SpartanTypography.bodySmall,
                color = MaterialTheme.colorScheme.surface
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .wrapContentSize()
                .height(60.dp)
                .width(60.dp)
                .clip(CircleShape)
                .background(
                    MaterialTheme.colorScheme.primary
                )
        ) {
            Text(
                text = "160",
                style = SpartanTypography.bodyLarge,
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
    }

}