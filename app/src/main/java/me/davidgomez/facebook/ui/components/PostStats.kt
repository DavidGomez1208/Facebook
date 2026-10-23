package me.davidgomez.facebook.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Composable que muestra las estadísticas de una publicación de Facebook.
 * A la izquierda muestra las reacciones de likes con el emoji del pulgar arriba 👍
 * y a la derecha el número de comentarios.
 * Es un composable sin estado (stateless).
 */
@Composable
fun PostStats(
    modifier: Modifier = Modifier,
    likesText: String = "👍 12",
    commentsText: String = "3 comentarios"
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 6.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Estadísticas de likes a la izquierda
        Text(
            text = likesText,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            fontSize = 14.sp
        )

        // Estadísticas de comentarios a la derecha
        Text(
            text = commentsText,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            fontSize = 14.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PostStatsPreview() {
    Surface {
        PostStats()
    }
}
