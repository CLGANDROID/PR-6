package com.example.menunavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun AppMenu(
    currentRoute: String?,
    onNavigate: (Page) -> Unit,
    modifier: Modifier = Modifier
) {
    Surface(
        tonalElevation = 3.dp,
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .navigationBarsPadding()
                .padding(horizontal = 8.dp, vertical = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Page.entries.forEach { page ->
                val buttonModifier = Modifier.weight(1f)
                val padding = PaddingValues(horizontal = 4.dp)
                if (page.route == currentRoute) {
                    Button(
                        onClick = { onNavigate(page) },
                        modifier = buttonModifier,
                        contentPadding = padding
                    ) {
                        Text(page.label, maxLines = 1, overflow = TextOverflow.Ellipsis)
                    }
                } else {
                    OutlinedButton(
                        onClick = { onNavigate(page) },
                        modifier = buttonModifier,
                        contentPadding = padding
                    ) {
                        Text(page.label, maxLines = 1, overflow = TextOverflow.Ellipsis)
                    }
                }
            }
        }
    }
}
