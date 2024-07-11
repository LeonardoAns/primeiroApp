package com.android.primeiroapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun UserItem(user: User) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {

        AsyncImage(
            model = user.profileImg,
            contentDescription = "Imagem do perfil de ${user.name}",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(48.dp)
                .padding(start = 8.dp)
                .padding(top = 8.dp)
                .clip(CircleShape)

        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Text(
                text = user.name,
                modifier = Modifier.padding(top = 4.dp)
            )

            Text(
                text = user.nickname,
                modifier = Modifier.padding(top = 4.dp),
                color = Color.Gray
            )

            Text(
                text = user.bio,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UserItemPreview() {

    val user: User = User(
        name = "Leonardo", nickname = "@LeoAns", bio = "back end developer", profileImg = ""
    )

    UserItem(user = user)
}