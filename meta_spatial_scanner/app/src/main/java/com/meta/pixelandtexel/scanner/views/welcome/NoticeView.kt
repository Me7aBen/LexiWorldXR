// (c) Meta Platforms, Inc. and affiliates. Confidential and proprietary.

package com.meta.pixelandtexel.scanner.views.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.meta.pixelandtexel.scanner.R
import com.meta.pixelandtexel.scanner.views.components.Panel
import com.meta.spatial.uiset.button.PrimaryButton
import com.meta.spatial.uiset.theme.SpatialColor
import com.meta.spatial.uiset.theme.SpatialTheme
import dev.jeziellago.compose.markdowntext.MarkdownText

@Composable
fun NoticeView(onLinkClicked: ((String) -> Unit)? = null, onContinue: (() -> Unit)) {
    Panel {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 32.dp) // Add some horizontal padding
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(30.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
// Add the Image here
                Image(
                    painter = painterResource(R.drawable.lexi), // Use the name of your image file
                    contentDescription = stringResource(R.string.app_name), // Use the app name as content description
                    modifier = Modifier
                        .size(150.dp) // Adjust the size as needed
                        .padding(bottom = 16.dp) // Add some space below the logo
                )
                MarkdownText(
                    stringResource(R.string.notice),
                    style = SpatialTheme.typography.body1.merge(TextStyle(color = SpatialColor.white100)),
                    onLinkClicked = onLinkClicked
                )
                PrimaryButton(
                    stringResource(R.string.btn_continue),
                    onClick = onContinue,
                    expanded = true
                )
            }
        }
    }
}

@Preview(widthDp = 368, heightDp = 404)
@Composable
private fun InterstitialViewPreview() {
    NoticeView {}
}