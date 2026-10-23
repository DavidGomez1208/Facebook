package me.davidgomez.facebook.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

/**
 * Composable que representa una publicación completa de Facebook,
 * utilizando Coil (AsyncImage) para cargar imágenes desde Internet.
 */
@Composable
fun PostCard(
    modifier: Modifier = Modifier,
    postText: String = "Por fin terminé la pantalla de Login",
    imageUrl: String = "https://picsum.photos/600/400"
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            // Cabecera de la publicación
            PostHeader()

            // Texto de la publicación
            Text(
                text = postText,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 4.dp),
                style = MaterialTheme.typography.bodyMedium
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Imagen cargada desde internet con la librería Coil
            AsyncImage(
                model = imageUrl,
                contentDescription = "Imagen de la publicación",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Estadísticas de la publicación
            PostStats()

            HorizontalDivider(modifier = Modifier.padding(horizontal = 12.dp))

            // Acciones de la publicación
            PostActions()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PostCardPreview() {
    Surface {
        PostCard()
    }
}
