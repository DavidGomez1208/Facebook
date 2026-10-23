package me.davidgomez.facebook.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * Composable que agrupa las acciones de una publicación de Facebook:
 * Me gusta, Comentar y Compartir.
 * Es un composable sin estado (stateless).
 */
@Composable
fun PostActions(
    modifier: Modifier = Modifier,
    onLikeClick: () -> Unit = {},
    onCommentClick: () -> Unit = {},
    onShareClick: () -> Unit = {}
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        LikeButton(onClick = onLikeClick)
        ComentButton(onClick = onCommentClick)
        ShareButton(onClick = onShareClick)
    }
}

@Preview(showBackground = true)
@Composable
fun PostActionsPreview() {
    Surface {
        PostActions()
    }
}
