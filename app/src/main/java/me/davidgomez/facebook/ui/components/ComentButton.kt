package me.davidgomez.facebook.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Comment
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Composable que simula el botón de comentar de Facebook.
 * Es un composable sin estado (stateless).
 */
@Composable
fun ComentButton(
    modifier: Modifier = Modifier,
    text: String = "Comentar",
    icon: ImageVector = Icons.AutoMirrored.Filled.Comment,
    tint: Color = MaterialTheme.colorScheme.onSurfaceVariant,
    onClick: () -> Unit = {}
) {
    Row(
        modifier = modifier
            .clickable(onClick = onClick)
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Icono de comentar
        Icon(
            imageVector = icon,
            contentDescription = text,
            tint = tint
        )

        Spacer(modifier = Modifier.width(6.dp))

        // Texto "Comentar" a la derecha
        Text(
            text = text,
            style = MaterialTheme.typography.labelLarge,
            color = tint
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComentButtonPreview() {
    Surface {
        ComentButton()
    }
}
